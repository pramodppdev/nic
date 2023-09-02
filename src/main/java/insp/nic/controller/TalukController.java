package insp.nic.controller;


import insp.nic.Service.TalukService;
import insp.nic.model.Taluk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taluk")
public class TalukController {

    @Autowired
    private TalukService talukService;

    @PostMapping("/save")
    public ResponseEntity<Taluk> saveTaluk(@RequestBody Taluk taluk){
        return new ResponseEntity<Taluk>(talukService.saveTaluk(taluk), HttpStatus.CREATED);
    }

    @GetMapping("/getAllTaluk")
    public List<Taluk> getAllTaluk(){
        return talukService.getAllTaluk();
    }

    @GetMapping("/getTakByDist/{district}")
    public List<Taluk> getTakByDist(@PathVariable("district") String district){
        return talukService.getTakByDist(district);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Taluk> getById(@PathVariable("id") String id){
        return new ResponseEntity<Taluk>(talukService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTaluk(@PathVariable("id") String id){
        talukService.deleteTaluk(id);
        return new ResponseEntity<String>("Taluk Deleted Successfully",HttpStatus.OK);
    }
}
