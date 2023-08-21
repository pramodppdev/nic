package insp.nic.Service;

import insp.nic.model.Inspection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InspectionService {

    Inspection saveInsp(Inspection inspection);

    List<Inspection> getAllInsp();

    Inspection getById(String id);

    Inspection updateInsp(Inspection inspection, String id);

    void deleteInsp(String id);

    int inspCout();

}
