package insp.nic.Service.serviceImpl;


import insp.nic.Service.DepartmentService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Department;
import insp.nic.model.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDept(Department dept) {
        return departmentRepo.save(dept);
    }

    @Override
    public List<Department> getAllDept() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getById(String id) {
        return departmentRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Department","Id",id));
    }

    @Override
    public void deleteDept(String id) {
        departmentRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Department","Id",id));
        departmentRepo.deleteById(id);
    }

}
