package insp.nic.controller;

import insp.nic.Service.DepartmentService;
import insp.nic.Service.DesignationService;
import insp.nic.model.Department;
import insp.nic.model.Designation;
import insp.nic.model.Taluk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/designation")
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    @PostMapping("/save")
    public ResponseEntity<Designation> saveDesignation(@RequestBody Designation designation){
        return new ResponseEntity<Designation>(designationService.saveDesignation(designation), HttpStatus.CREATED);
    }

    @GetMapping("/getAllDesignation")
    public List<Designation> getAllDesignation(){
        return designationService.getAllDesignation();
    }

    @GetMapping("/getDesigByTal/{desigTaluk}")
    public List<Designation> getDesigByTal(@PathVariable("desigTaluk") String desigTaluk){
        return designationService.getDesigByTal(desigTaluk);
    }

    @GetMapping("/getDesigByTD/{desigTaluk}/{department}")
    public List<Designation> getDesigByTD(@PathVariable("desigTaluk") String desigTaluk,@PathVariable("department") String department){
        return designationService.getDesigByTD(desigTaluk,department);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Designation> getById(@PathVariable("id") String id){
        return new ResponseEntity<Designation> (designationService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDesignation(@PathVariable("id") String id){
        designationService.deleteDesignation(id);
        return new ResponseEntity<String>("Designation Deleted Successfully",HttpStatus.OK);
    }

}
