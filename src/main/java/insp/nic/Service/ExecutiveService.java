package insp.nic.Service;


import insp.nic.model.Executive;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExecutiveService {

    Executive saveExe(Executive executive);

    List<Executive> getAllExe();

    Executive getById(String id);

    void deleteExe(String id);
}