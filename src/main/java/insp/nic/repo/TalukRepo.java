package insp.nic.repo;

import insp.nic.model.Officer;
import insp.nic.model.Taluk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TalukRepo extends MongoRepository<Taluk,String> {
}
