
package insp.nic.repo;


import insp.nic.model.Executive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveRepo extends MongoRepository<Executive, String> {

    @Query(value="{executiveUserName:'?0'}")
    Executive findAllByUserName(String executiveUserName);
}
