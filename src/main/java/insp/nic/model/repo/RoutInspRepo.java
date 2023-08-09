package insp.nic.model.repo;

import insp.nic.model.Inspection;
import insp.nic.model.RoutInsp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutInspRepo extends MongoRepository<RoutInsp,String> {
}