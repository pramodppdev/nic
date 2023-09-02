package insp.nic.Service.serviceImpl;


import insp.nic.Service.ExecutiveService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Executive;
import insp.nic.repo.ExecutiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Objects;

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

    @Override
    public Executive exeAuth(Executive executiveVO) throws AuthenticationException
    {

        if (StringUtils.isEmpty(executiveVO.getExecutiveUserName()) ||StringUtils.isEmpty(executiveVO.getExecutivePasswd())) {
            throw new AuthenticationException("Invalid user Credentials");
        }

        Executive authenticatedPOJO = executiveRepo.findAllByUserName(executiveVO.getExecutiveUserName());


        if (authenticatedPOJO == null ) {
            throw new AuthenticationException("User Does not exists ");
        }

        //TODO: Credentials authentication logic
        if(Objects.equals(executiveVO.getExecutiveUserName(), authenticatedPOJO.getExecutiveUserName())
                && Objects.equals(executiveVO.getExecutivePasswd(), authenticatedPOJO.getExecutivePasswd()))
        {
            authenticatedPOJO.setExecutivePasswd("");
            return authenticatedPOJO;
        }

        throw new AuthenticationException("Invalid user Credentials");
    }
}
