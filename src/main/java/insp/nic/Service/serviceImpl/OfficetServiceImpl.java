package insp.nic.Service.serviceImpl;


import insp.nic.Service.OfficerService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Executive;
import insp.nic.model.Officer;
import insp.nic.repo.OfficerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Objects;

@Service
public class OfficetServiceImpl implements OfficerService {

    @Autowired
    private OfficerRepo officerRepo;

    @Override
    public Officer saveOfficer(Officer officer) {
        return officerRepo.save(officer);
    }

    @Override
    public List<Officer> getAllOfficer() {
        return officerRepo.findAll();
    }

    @Override
    public Officer getById(String id) {
        return officerRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Officer","Id",id));
    }

    @Override
    public List<Officer> getOfficerByLTDD(String level, String taluk, String officerDept, String designation) {
        return officerRepo.getOfficerByLTDptDes(level,taluk,officerDept,designation);
    }

    @Override
    public void deleteOfficer(String id) {
        officerRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Officer","Id",id));
        officerRepo.deleteById(id);
    }

    @Override
    public Officer exeOffi(Officer officer) throws AuthenticationException {

        if (StringUtils.isEmpty(officer.getOfficerName()) ||StringUtils.isEmpty(officer.getPassword())) {
            throw new AuthenticationException("Invalid user Credentials");
        }

        Officer authenticatedPOJO = officerRepo.findAllByName(officer.getOfficerName());


        if (authenticatedPOJO == null ) {
            throw new AuthenticationException("User Does not exists ");
        }

        //TODO: Credentials authentication logic
        if(Objects.equals(officer.getOfficerName(), officer.getOfficerName())
                && Objects.equals(officer.getPassword(), authenticatedPOJO.getPassword()))
        {
            authenticatedPOJO.setPassword("");
            return authenticatedPOJO;
        }

        throw new AuthenticationException("Invalid user Credentials");
    }
}
