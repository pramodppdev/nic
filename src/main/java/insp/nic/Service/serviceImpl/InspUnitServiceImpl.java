package insp.nic.Service.serviceImpl;


import insp.nic.Service.InspUnitService;
import insp.nic.exception.ResourceNotFoundException;
import insp.nic.model.InspectionUnit;
import insp.nic.repo.InspUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspUnitServiceImpl implements InspUnitService {

    @Autowired
    private InspUnitRepo inspUnitRepo;

    @Override
    public InspectionUnit saveInspectionUnit(InspectionUnit inspectionUnit) {

        inspectionUnit.setStatus("Not_assigned");
        return inspUnitRepo.save(inspectionUnit);
    }

    @Override
    public List<InspectionUnit> getAllInspectionUnit() {
        return inspUnitRepo.findAll();
    }

    @Override
    public InspectionUnit updateInspectionUnit(InspectionUnit inspectionUnit, String id) {
        InspectionUnit existingInspUnit = inspUnitRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("InspectionUnit not Found","Id",id));


        existingInspUnit.setDept(inspectionUnit.getDept());
        existingInspUnit.setLevel(inspectionUnit.getLevel());
        existingInspUnit.setTaluk(inspectionUnit.getTaluk());
        existingInspUnit.setUnitName(inspectionUnit.getUnitName());

        existingInspUnit.setAssignedMonth(inspectionUnit.getAssignedMonth());
        existingInspUnit.setAssignedOfficer(inspectionUnit.getAssignedOfficer());
        existingInspUnit.setStatus(inspectionUnit.getStatus());

        inspUnitRepo.save(existingInspUnit);

        return existingInspUnit;
    }

    @Override
    public InspectionUnit getById(String id) {
        return inspUnitRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("InspUnit","Id",id));
    }

    @Override
    public List<InspectionUnit> getUnitByLTDept(String level, String taluk, String dept) {
        return inspUnitRepo.getUnitByLTDept(level,taluk,dept);
    }

    @Override
    public void deleteInspectionUnit(String id) {
        inspUnitRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("InspUnit","Id",id));
        inspUnitRepo.deleteById(id);
    }

   
}
