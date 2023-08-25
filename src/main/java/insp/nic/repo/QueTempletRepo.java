package insp.nic.repo;

import insp.nic.model.QueTemplet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueTempletRepo extends MongoRepository<QueTemplet,String> {
}
