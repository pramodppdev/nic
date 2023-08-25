package insp.nic.Service;

import insp.nic.model.QueTemplet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QueTempletService {

    QueTemplet saveTemp(QueTemplet queTemplet);

    List<QueTemplet> getAllTemp();

    QueTemplet updateTemp(QueTemplet queTemplet,String id);

    QueTemplet getById(String id);

    void deleteTemp(String id);
}
