package insp.nic.Service.serviceImpl;

import insp.nic.Service.RoutInspService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.RoutInsp;
import insp.nic.repo.RoutInspRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutInspServiceImpl implements RoutInspService {

    @Autowired
    private RoutInspRepo routInspRepo;

    @Override
    public RoutInsp saveRoutInsp(RoutInsp routInsp) {
        return routInspRepo.save(routInsp);
    }

    @Override
    public List<RoutInsp> getAllRoutInsp() {
        return routInspRepo.findAll();
    }

    @Override
    public RoutInsp updateRoutInsp(RoutInsp routInsp, String id) {
        RoutInsp existingRoutInsp = routInspRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));


        existingRoutInsp.setRouttaluk(routInsp.getRouttaluk());
        existingRoutInsp.setRoutdepartment(routInsp.getRoutdepartment());
        existingRoutInsp.setRoutlastDate(routInsp.getRoutlastDate());
        existingRoutInsp.setRoutstatus(routInsp.getRoutstatus());

        existingRoutInsp.setRoutassignedOfficer(routInsp.getRoutassignedOfficer());
        existingRoutInsp.setRoutdistrict(routInsp.getRoutdistrict());

        routInspRepo.save(existingRoutInsp);

        return existingRoutInsp;
    }

    @Override
    public RoutInsp getById(String id) {
        return routInspRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
    }

    @Override
    public void deleteRoutInsp(String id) {
        routInspRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
        routInspRepo.deleteById(id);
    }

    @Override
    public int routCount() {
        return (int) routInspRepo.count();
    }


}