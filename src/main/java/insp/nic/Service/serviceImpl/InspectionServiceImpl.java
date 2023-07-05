package insp.nic.Service.serviceImpl;


import insp.nic.Service.InspectionService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Inspection;
import insp.nic.repo.InspectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class InspectionServiceImpl implements InspectionService {

    @Autowired
    private InspectionRepo inspectionRepo;

    @Override
    public Inspection saveInsp(Inspection inspection) {
        return inspectionRepo.save(inspection);
    }

    @Override
    public List<Inspection> getAllInsp() {
        return inspectionRepo.findAll();
    }

    @Override
    public Inspection getById(String id) {
        return inspectionRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Inspection","Id",id));
    }

    @Override
    public void deleteInsp(String id) {
        inspectionRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Inspection","Id",id));
        inspectionRepo.deleteById(id);
    }
}
