package insp.nic.repo;

import insp.nic.model.Department;
import insp.nic.model.Designation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignationRepo extends MongoRepository<Designation,String> {

    @Query(value = "{'desigTaluk':?0}")
    List<Designation> getDesigByTal(String desigTaluk);

    @Query(value = "{'level':?0, 'department':?1}")
    List<Designation> getDesigByLevel(String level,String department);

    @Query(value = "{'desigTaluk':?0, 'department':?1}")
    List<Designation> getDesigByTD(String desigTaluk, String department);

}
