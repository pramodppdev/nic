package insp.nic.repo;

import insp.nic.model.AdHoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdHocRepo extends MongoRepository<AdHoc,String> {
}