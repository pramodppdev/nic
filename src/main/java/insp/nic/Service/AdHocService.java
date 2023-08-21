package insp.nic.Service;

import insp.nic.model.AdHoc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdHocService {

    AdHoc saveRoutInsp(AdHoc adHoc);

    List<AdHoc> getAllRoutInsp();

    AdHoc updateRoutInsp(AdHoc adHoc, String id);

    AdHoc getById(String id);


    void deleteRoutInsp(String id);

    int adHocCount();


}