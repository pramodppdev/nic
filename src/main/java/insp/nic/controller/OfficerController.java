package insp.nic.controller;


import insp.nic.Service.OfficerService;
import insp.nic.model.Officer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/officer")
public class OfficerController {

    @Autowired
    private OfficerService officerService;

    @PostMapping("/save")
    public ResponseEntity<Officer> saveOfficer(@RequestBody Officer officer){
            return new ResponseEntity<Officer>(officerService.saveOfficer(officer), HttpStatus.CREATED);
    }

    @GetMapping("/getAllOfficer")
    public List<Officer> getAllOfficer(){
        return officerService.getAllOfficer();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Officer> getById(@PathVariable("id") String id){
        return new ResponseEntity<Officer>(officerService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOfficer(@PathVariable("id") String id){
        officerService.deleteOfficer(id);
        return new ResponseEntity<String>("Officer Deleted Successfully", HttpStatus.OK);
    }
}
