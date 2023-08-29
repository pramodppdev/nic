package insp.nic.controller;

import insp.nic.Service.InspUnitService;
import insp.nic.model.Department;
import insp.nic.model.InspectionUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inspunit")
public class InspUnitController {

    @Autowired
    InspUnitService inspUnitService;

    @PostMapping("/save")
    public ResponseEntity<InspectionUnit> saveInspUnit(@RequestBody InspectionUnit inspectionUnit){
        return new ResponseEntity<InspectionUnit>(inspUnitService.saveInspectionUnit(inspectionUnit), HttpStatus.CREATED);
    }

    @GetMapping("/getAllInspUnit")
    public List<InspectionUnit> getAllInspUnit(){
        return inspUnitService.getAllInspectionUnit();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<InspectionUnit> getById(@PathVariable("id") String id){
        return new ResponseEntity<InspectionUnit> (inspUnitService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteInspUnit(@PathVariable("id") String id){
        inspUnitService.deleteInspectionUnit(id);
        return new ResponseEntity<String>("InspectionUnit Deleted Successfully",HttpStatus.OK);
    }
}
