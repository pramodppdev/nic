package insp.nic.repo;

import insp.nic.model.Inspection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionRepo extends MongoRepository<Inspection,String> {
}
