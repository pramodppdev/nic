package insp.nic.Service;

import insp.nic.model.Inspection;
import insp.nic.model.RoutInsp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoutInspService {

    RoutInsp saveRoutInsp(RoutInsp routInsp);

    List<RoutInsp> getAllRoutInsp();

    RoutInsp getById(String id);

    void deleteRoutInsp(String id);
}