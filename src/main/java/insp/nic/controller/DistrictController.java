package insp.nic.controller;


import insp.nic.Service.DistrictService;
import insp.nic.model.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/district")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("/save")
    public ResponseEntity<District> saveDistrict(@RequestBody District district){
        return new ResponseEntity<District>(districtService.saveDistrict(district), HttpStatus.CREATED);
    }

    @GetMapping("/getAllDistrict")
    public List<District> getAllDistrict(){
        return districtService.getAllDistrict();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<District> getById(@PathVariable("id") String id){
        return new ResponseEntity<District>(districtService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDistrict(@PathVariable("id") String id){
        districtService.deleteDistrict(id);
        return new ResponseEntity<String>("District Deleted Successfully",HttpStatus.OK);
    }

}
