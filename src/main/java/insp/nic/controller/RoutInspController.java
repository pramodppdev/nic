package insp.nic.controller;

import insp.nic.Service.InspectionService;
import insp.nic.Service.RoutInspService;
import insp.nic.model.Inspection;
import insp.nic.model.RoutInsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routinsp")
public class RoutInspController {
    @Autowired
    private RoutInspService routInspService;

    @PostMapping("/save")
    public ResponseEntity<RoutInsp> saveRoutInsp(@RequestBody RoutInsp routInsp){
        return new ResponseEntity<RoutInsp>(routInspService.saveRoutInsp(routInsp), HttpStatus.CREATED);
    }

    @GetMapping("/getAllRoutInsp")
    public List<RoutInsp> getAllRoutInsp(){
        return routInspService.getAllRoutInsp();
    }

    @GetMapping("/count")
    public int rountCount(){
        return routInspService.routCount();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<RoutInsp> getById(@PathVariable("id") String id){
        return new ResponseEntity<RoutInsp>(routInspService.getById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateRout(@PathVariable("id")String id, @RequestBody RoutInsp routInsp){
        routInspService.updateRoutInsp(routInsp,id);
        return new ResponseEntity<String>("Routine Inspection Updated Sucessfully",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRoutInsp(@PathVariable("id") String id){
        routInspService.deleteRoutInsp(id);
        return new ResponseEntity<String>("RoutInsp Deleted Successfully", HttpStatus.OK);
    }


}