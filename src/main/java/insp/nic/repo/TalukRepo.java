package insp.nic.repo;

import insp.nic.model.Officer;
import insp.nic.model.Taluk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TalukRepo extends MongoRepository<Taluk,String> {

    @Query(value = "{district:'?0'}")
    List<Taluk> getTakByDist(String district);

}
