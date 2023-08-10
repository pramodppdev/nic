package insp.nic.Service.serviceImpl;


import insp.nic.Service.ExecutiveService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Executive;
import insp.nic.repo.ExecutiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutiveServiceImpl implements ExecutiveService {

    @Autowired
    private ExecutiveRepo executiveRepo;

    @Override
    public Executive saveExe(Executive executive) {
        return executiveRepo.save(executive);
    }

    @Override
    public List<Executive> getAllExe() {
        return executiveRepo.findAll();
    }

    @Override
    public Executive getById(String id) {
        return executiveRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Executive","Id",id));
    }

    @Override
    public void deleteExe(String id) {
        executiveRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Executive","Id",id));
        executiveRepo.deleteById(id);
    }
}
