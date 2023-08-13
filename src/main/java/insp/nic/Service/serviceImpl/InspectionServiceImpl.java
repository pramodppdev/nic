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
    public Inspection updateInsp(Inspection inspection, String id) {
        Inspection existingInspection = inspectionRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));


        existingInspection.setTaluk(inspection.getTaluk());
        existingInspection.setDepartment(inspection.getDepartment());
        existingInspection.setLastDate(inspection.getLastDate());
        existingInspection.setStatus(inspection.getStatus());

        existingInspection.setAssignedOfficer(inspection.getAssignedOfficer());
        existingInspection.setDistrict(inspection.getDistrict());

        inspectionRepo.save(existingInspection);

        return existingInspection;
    }


    @Override
    public void deleteInsp(String id) {
        inspectionRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Inspection","Id",id));
        inspectionRepo.deleteById(id);
    }
}
