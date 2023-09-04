package insp.nic.repo;

import insp.nic.model.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficerRepo extends MongoRepository<Officer,String> {

    @Query(value = "{'level':?0, 'taluk':?1, 'officerDept':?2, 'designation':?3}")
    List<Officer> getOfficerByLTDptDes(String level, String taluk, String officerDept, String designation);
}
