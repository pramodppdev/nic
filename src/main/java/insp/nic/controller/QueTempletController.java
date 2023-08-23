package insp.nic.controller;

import insp.nic.Service.QueTempletService;
import insp.nic.model.QueTemplet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quetemplet")
public class QueTempletController {
    
    @Autowired
    private QueTempletService queTempletService;

    @PostMapping("/save")
    public ResponseEntity<QueTemplet> saveTemp(@RequestBody QueTemplet queTemplet){
        return new ResponseEntity<QueTemplet>(queTempletService.saveTemp(queTemplet), HttpStatus.CREATED);
    }

    @GetMapping("/getAllTemp")
    public List<QueTemplet> getAllTemp(){
        return queTempletService.getAllTemp();
    }


    @GetMapping("/getById/{id}")
    public ResponseEntity<QueTemplet> getById(@PathVariable("id") String id){
        return new ResponseEntity<QueTemplet>(queTempletService.getById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTemp(@PathVariable("id")String id, @RequestBody QueTemplet queTemplet){
        queTempletService.updateTemp(queTemplet,id);
        return new ResponseEntity<String>("Templet Updated Sucessfully",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTemp(@PathVariable("id") String id){
        queTempletService.deleteTemp(id);
        return new ResponseEntity<String>("Templet Deleted Successfully", HttpStatus.OK);
    }

}
