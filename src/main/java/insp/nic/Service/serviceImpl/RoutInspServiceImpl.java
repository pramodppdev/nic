package insp.nic.Service.serviceImpl;

import insp.nic.Service.InspectionService;
import insp.nic.Service.RoutInspService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Inspection;
import insp.nic.model.RoutInsp;
import insp.nic.repo.InspectionRepo;
import insp.nic.repo.RoutInspRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutInspServiceImpl implements RoutInspService {

    @Autowired
    private RoutInspRepo routInspRepoRepo;

    @Override
    public RoutInsp saveRoutInsp(RoutInsp routInsp) {
        return routInspRepoRepo.save(routInsp);
    }

    @Override
    public List<RoutInsp> getAllRoutInsp() {
        return routInspRepoRepo.findAll();
    }

    @Override
    public RoutInsp updateRoutInsp(RoutInsp routInsp, String id) {
        RoutInsp existingRoutInsp = routInspRepoRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));


        existingRoutInsp.setRouttaluk(routInsp.getRouttaluk());
        existingRoutInsp.setRoutdepartment(routInsp.getRoutdepartment());
        existingRoutInsp.setRoutlastDate(routInsp.getRoutlastDate());
        existingRoutInsp.setRoutstatus(routInsp.getRoutstatus());
       
        existingRoutInsp.setRoutassignedOfficer(routInsp.getRoutassignedOfficer());
        existingRoutInsp.setRoutdistrict(routInsp.getRoutdistrict());

        routInspRepoRepo.save(existingRoutInsp);

        return existingRoutInsp;
    }

    @Override
    public RoutInsp getById(String id) {
        return routInspRepoRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
    }

    @Override
    public void deleteRoutInsp(String id) {
        routInspRepoRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
        routInspRepoRepo.deleteById(id);
    }




}
