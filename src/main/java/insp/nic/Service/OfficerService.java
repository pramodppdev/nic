package insp.nic.Service;

import insp.nic.model.Executive;
import insp.nic.model.Officer;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Service
public interface OfficerService {

    Officer saveOfficer(Officer officer);

    List<Officer> getAllOfficer();

    Officer getById(String id);

    List<Officer> getOfficerByLTDD(String level, String taluk, String officerDept, String designation);


    void deleteOfficer(String id);


    Officer exeOffi(Officer officer) throws AuthenticationException;

}
