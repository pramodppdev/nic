package insp.nic.Service.serviceImpl;

import insp.nic.Service.AdHocService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.AdHoc;
import insp.nic.repo.AdHocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdHocServiceImpl implements AdHocService {

    @Autowired
    private AdHocRepo adHocRepo;

    @Override
    public AdHoc saveRoutInsp(AdHoc adHoc) {
        return adHocRepo.save(adHoc);
    }

    @Override
    public List<AdHoc> getAllRoutInsp() {
        return adHocRepo.findAll();
    }

    @Override
    public AdHoc updateRoutInsp(AdHoc adHoc, String id) {
        AdHoc existingAdHoc = adHocRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));


        existingAdHoc.setAdhoctaluk(adHoc.getAdhoctaluk());
        existingAdHoc.setAdhocdepartment(adHoc.getAdhocdepartment());
        existingAdHoc.setAdhoclastDate(adHoc.getAdhoclastDate());
        existingAdHoc.setAdhocstatus(adHoc.getAdhocstatus());
       
        existingAdHoc.setAdhocassignedOfficer(adHoc.getAdhocassignedOfficer());
        existingAdHoc.setAdhocdistrict(adHoc.getAdhocdistrict());

        adHocRepo.save(existingAdHoc);

        return existingAdHoc;
    }

    @Override
    public AdHoc getById(String id) {
        return adHocRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
    }

    @Override
    public void deleteRoutInsp(String id) {
        adHocRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("RoutInsp","Id",id));
        adHocRepo.deleteById(id);
    }

    @Override
    public int adHocCount() {
        return (int) adHocRepo.count();
    }


}
