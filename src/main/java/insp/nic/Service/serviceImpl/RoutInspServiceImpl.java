package insp.nic.Service.serviceImpl;

import insp.nic.Service.RoutInspService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.RoutInsp;
import insp.nic.model.RoutInspDetails;
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
    public RoutInsp updateRoutInsp(RoutInsp updatedRoutInsp, String id) {
        // Fetch the existing RoutInsp object by ID
        RoutInsp existingRoutInsp = routInspRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Inspection not Found","Id",id));

        // Update the existing RoutInsp object's properties
        existingRoutInsp.setLevel(updatedRoutInsp.getLevel());
        existingRoutInsp.setRouttaluk(updatedRoutInsp.getRouttaluk());
        existingRoutInsp.setRoutdepartment(updatedRoutInsp.getRoutdepartment());
        existingRoutInsp.setRoutlastDate(updatedRoutInsp.getRoutlastDate());
        existingRoutInsp.setRoutstatus(updatedRoutInsp.getRoutstatus());
        existingRoutInsp.setRoutassignedOfficer(updatedRoutInsp.getRoutassignedOfficer());
        existingRoutInsp.setRoutdistrict(updatedRoutInsp.getRoutdistrict());

        // Update the RoutInspDetails objects within the routdescription list
        List<RoutInspDetails> updatedRoutdescription = updatedRoutInsp.getRoutdescription();
        if (updatedRoutdescription != null) {
            for (RoutInspDetails updatedDetail : updatedRoutdescription) {
                // Find the matching existing RoutInspDetails object by some unique identifier
                // For example, if you have a unique identifier like 'routInspContent', find the matching one.
                RoutInspDetails existingDetail = existingRoutInsp.getRoutdescription()
                        .stream()
                        .filter(detail -> detail.getRoutInspContent().equals(updatedDetail.getRoutInspContent()))
                        .findFirst()
                        .orElse(null);

                // If a matching detail is found, update its properties including the image
                if (existingDetail != null) {
                    existingDetail.setRoutInspAns(updatedDetail.getRoutInspAns());
                    existingDetail.setImgReq(updatedDetail.getImgReq());

                    // Update the image if needed (assuming image is a byte array)
                    byte[] updatedImage = updatedDetail.getImage();
                    if (updatedImage != null) {
                        existingDetail.setImage(updatedImage);
                    }
                }
            }
        }

        // Save the updated RoutInsp object
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