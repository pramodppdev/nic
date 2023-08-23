package insp.nic.Service.serviceImpl;

import insp.nic.Service.QueTempletService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.QueTemplet;
import insp.nic.model.RoutInsp;
import insp.nic.repo.QueTempletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QueTempletServiceImpl implements QueTempletService {

    @Autowired
    private QueTempletRepo queTempletRepo;

    @Override
    public QueTemplet saveTemp(QueTemplet queTemplet) {
        return queTempletRepo.save(queTemplet);
    }

    @Override
    public List<QueTemplet> getAllTemp() {
        return queTempletRepo.findAll();
    }

    @Override
    public QueTemplet updateTemp(QueTemplet queTemplet, String id) {
        QueTemplet existingQueTemplate = queTempletRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));

        existingQueTemplate.setTempName(queTemplet.getTempName());
        existingQueTemplate.setTempLevel(queTemplet.getTempLevel());

        queTempletRepo.save(existingQueTemplate);

        return existingQueTemplate;
    }

    @Override
    public QueTemplet getById(String id) {
        return queTempletRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("QueTemplet","Id",id));
    }

    @Override
    public void deleteTemp(String id) {
        queTempletRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("QueTemplet","Id",id));
        queTempletRepo.deleteById(id);
    }
}
