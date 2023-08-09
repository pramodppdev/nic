package insp.nic.model.repo;

import insp.nic.model.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficerRepo extends MongoRepository<Officer,String> {
}
