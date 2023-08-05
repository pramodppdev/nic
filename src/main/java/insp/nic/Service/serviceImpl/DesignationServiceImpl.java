package insp.nic.Service.serviceImpl;

import insp.nic.Service.DepartmentService;
import insp.nic.Service.DesignationService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Department;
import insp.nic.model.Designation;
import insp.nic.repo.DepartmentRepo;
import insp.nic.repo.DesignationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService {

    @Autowired
    private DesignationRepo designationRepo;

    @Override
    public Designation saveDesignation(Designation designation) {
        return designationRepo.save(designation);
    }

    @Override
    public List<Designation> getAllDesignation() {
        return designationRepo.findAll();
    }

    @Override
    public Designation getById(String id) {
        return designationRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Designation","Id",id));
    }

    @Override
    public void deleteDesignation(String id) {
        designationRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Designation","Id",id));
        designationRepo.deleteById(id);
    }


}
