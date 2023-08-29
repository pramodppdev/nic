package insp.nic.repo;

import insp.nic.model.InspectionUnit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspUnitRepo extends MongoRepository<InspectionUnit, String > {
}
