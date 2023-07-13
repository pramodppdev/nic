package insp.nic.Service;

import org.springframework.stereotype.Service;
import insp.nic.model.Department;
import java.util.List;
@Service
public interface DepartmentService {

    Department saveDept(Department dept);

    List<Department> getAllDept();

    Department getById(String id);

    void deleteDept(String id);
}
