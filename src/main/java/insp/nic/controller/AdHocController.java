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
    public ResponseEntity<AdHoc> saveRoutInsp(@RequestBody AdHoc adHoc){
        return new ResponseEntity<AdHoc>(adHocService.saveRoutInsp(adHoc), HttpStatus.CREATED);
    }

    @GetMapping("/getAllAdhoc")
    public List<AdHoc> getAllRoutInsp(){
        return adHocService.getAllRoutInsp();
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
    public ResponseEntity<String> updateRout(@PathVariable("id")String id, @RequestBody AdHoc adHoc){
        adHocService.updateRoutInsp(adHoc,id);
        return new ResponseEntity<String>("Routine Inspection Updated Sucessfully",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRoutInsp(@PathVariable("id") String id){
        adHocService.deleteRoutInsp(id);
        return new ResponseEntity<String>("RoutInsp Deleted Successfully", HttpStatus.OK);
    }
}