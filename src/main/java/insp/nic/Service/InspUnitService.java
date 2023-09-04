package insp.nic.Service;


import insp.nic.model.InspectionUnit;
import insp.nic.model.Officer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface InspUnitService {


    InspectionUnit saveInspectionUnit(InspectionUnit inspectionUnit);

    List<InspectionUnit> getAllInspectionUnit();

    InspectionUnit updateInspectionUnit(InspectionUnit inspectionUnit, String id);

    InspectionUnit getById(String id);

    List<InspectionUnit> getUnitByLTDept(String level, String taluk, String dept);

    void deleteInspectionUnit(String id);


}
