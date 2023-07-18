package insp.nic.Service;


import insp.nic.model.District;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DistrictService {

    District saveDistrict(District district);

    List<District> getAllDistrict();

    District getById(String id);

    void deleteDistrict(String id);

}
