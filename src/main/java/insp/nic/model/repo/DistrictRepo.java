package insp.nic.model.repo;


import insp.nic.model.District;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends MongoRepository<District,String> {
}
