package insp.nic.Service;

import insp.nic.model.Department;
import insp.nic.model.Designation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DesignationService {

    Designation saveDesignation(Designation designation);

    List<Designation> getAllDesignation();

    List<Designation> getDesigByTal(String desigTaluk);



    List<Designation> getDesigByLevel(String level, String department);

    List<Designation> getDesigByTD(String desigTaluk, String department);

    Designation getById(String id);

    void deleteDesignation(String id);
}