package insp.nic.Service.serviceImpl;


import insp.nic.Service.TalukService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.Taluk;
import insp.nic.repo.TalukRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalukServiceImpl implements TalukService {

    @Autowired
    private TalukRepo talukRepo;

    @Override
    public Taluk saveTaluk(Taluk taluk) {
        return talukRepo.save(taluk);
    }

    @Override
    public List<Taluk> getAllTaluk() {
        return talukRepo.findAll();
    }

    @Override
    public Taluk getById(String id) {
        return talukRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Taluk","Id",id));
    }

    @Override
    public void deleteTaluk(String id) {
        talukRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Talukr","Id",id));
        talukRepo.deleteById(id);
    }
}
