package insp.nic.repo;

import insp.nic.model.InspectionUnit;
import insp.nic.model.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspUnitRepo extends MongoRepository<InspectionUnit, String > {

    @Query(value = "{'level':?0, 'taluk':?1, 'dept':?2}")
    List<InspectionUnit> getUnitByLTDept(String level, String taluk, String dept);
}
