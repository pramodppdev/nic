package insp.nic.controller;


import insp.nic.Service.InspectionService;
import insp.nic.model.Inspection;
import insp.nic.model.RoutInsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/inspection")

public class InspectionController {

    @Autowired
    private InspectionService inspectionService;

    @PostMapping("/save")
    public ResponseEntity<Inspection> saveInspection(@RequestBody Inspection inspection){
        return new ResponseEntity<Inspection>(inspectionService.saveInsp(inspection), HttpStatus.CREATED);
    }

    @GetMapping("/getAllInsp")
    public List<Inspection> getAllInsp(){
        return inspectionService.getAllInsp();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Inspection> getById(@PathVariable("id") String id){
        return new ResponseEntity<Inspection>(inspectionService.getById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateInsp(@PathVariable("id")String id, @RequestBody Inspection inspection){
        inspectionService.updateInsp(inspection,id);
        return new ResponseEntity<String>("Inspection Updated Sucessfully",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteInsp(@PathVariable("id") String id){
        inspectionService.deleteInsp(id);
        return new ResponseEntity<String>("Inspection Deleted Successfully", HttpStatus.OK);
    }
}
