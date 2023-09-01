package insp.nic.Service;


import insp.nic.model.Taluk;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TalukService {

    Taluk saveTaluk(Taluk taluk);

    List<Taluk> getAllTaluk();

    List<Taluk> getTakByDist(String district);

    Taluk getById(String id);

    void deleteTaluk(String id);
}
