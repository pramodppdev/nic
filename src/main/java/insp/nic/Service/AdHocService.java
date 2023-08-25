package insp.nic.Service;

import insp.nic.model.AdHoc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdHocService {

    AdHoc saveAdhocInsp(AdHoc adHoc);

    List<AdHoc> getAllAdhocInsp();

    AdHoc updateAdhocInsp(AdHoc adHoc, String id);

    AdHoc getById(String id);

    void deleteAdhocInsp(String id);

    int adHocCount();


}