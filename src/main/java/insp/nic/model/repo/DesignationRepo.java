package insp.nic.model.repo;

import insp.nic.model.Department;
import insp.nic.model.Designation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepo extends MongoRepository<Designation,String> {
}
