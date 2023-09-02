package insp.nic.repo;

import insp.nic.model.QueTemplet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueTempletRepo extends MongoRepository<QueTemplet,String> {

    @Query(value = "{'tempLevel':?0}")
    List<QueTemplet> getTempByLev(String tempLevel);

    @Query(value = "{'tempLevel':?0, 'tempDept':?1}")
    List<QueTemplet> getTempByLD(String tempLevel, String tempDept);

}
