package insp.nic.Service;

import insp.nic.model.Officer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfficerService {

    Officer saveOfficer(Officer officer);

    List<Officer> getAllOfficer();

    Officer getById(String id);

    void deleteOfficer(String id);
}
