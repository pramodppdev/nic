package insp.nic.controller;

import insp.nic.Service.AdHocService;
import insp.nic.model.AdHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adhoc")
public class AdHocController {
    @Autowired
    private AdHocService adHocService;

    @PostMapping("/save")
    public ResponseEntity<AdHoc> saveAdhocInsp(@RequestBody AdHoc adHoc){
        return new ResponseEntity<AdHoc>(adHocService.saveAdhocInsp(adHoc), HttpStatus.CREATED);
    }

    @GetMapping("/getAllAdhoc")
    public List<AdHoc> getAllAdhocInsp(){
        return adHocService.getAllAdhocInsp();
    }


    @GetMapping("/count")
    public int adhocCount(){
        return adHocService.adHocCount();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<AdHoc> getById(@PathVariable("id") String id){
        return new ResponseEntity<AdHoc>(adHocService.getById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAdhoc(@PathVariable("id")String id, @RequestBody AdHoc adHoc){
        adHocService.updateAdhocInsp(adHoc,id);
        return new ResponseEntity<String>("Adhoc Inspection Updated Sucessfully",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAdhocInsp(@PathVariable("id") String id){
        adHocService.deleteAdhocInsp(id);
        return new ResponseEntity<String>("AdhocInsp Deleted Successfully", HttpStatus.OK);
    }
}