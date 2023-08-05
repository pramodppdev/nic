package insp.nic.controller;


import insp.nic.model.Department;
import insp.nic.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return new ResponseEntity<Department>(departmentService.saveDept(department), HttpStatus.CREATED);
    }

    @GetMapping("/getAllDept")
    public List<Department> getAllDept(){
        return departmentService.getAllDept();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Department> getById(@PathVariable("id") String id){
        return new ResponseEntity<Department> (departmentService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDept(@PathVariable("id") String id){
        departmentService.deleteDept(id);
        return new ResponseEntity<String>("Department Deleted Successfully",HttpStatus.OK);
    }

}
