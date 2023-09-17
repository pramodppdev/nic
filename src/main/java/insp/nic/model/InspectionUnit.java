package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;

@Document(collection = "insp_unit")
public class InspectionUnit {

    @Id
    private String id;

    @DBRef
    private Department dept;

    private String level;

    @DBRef
    private Taluk taluk;
    private String unitName;
    private String assignedMonth;

    private String assignedOfficer;

    public InspectionUnit() {
    }

    public InspectionUnit(String id, Department dept, String level, Taluk taluk, String unitName, String assignedMonth, String assignedOfficer) {
        this.id = id;
        this.dept = dept;
        this.level = level;
        this.taluk = taluk;
        this.unitName = unitName;
        this.assignedMonth = assignedMonth;
        this.assignedOfficer = assignedOfficer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Taluk getTaluk() {
        return taluk;
    }

    public void setTaluk(Taluk taluk) {
        this.taluk = taluk;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAssignedMonth() {
        return assignedMonth;
    }

    public void setAssignedMonth(String assignedMonth) {
        this.assignedMonth = assignedMonth;
    }

    public String getAssignedOfficer() {
        return assignedOfficer;
    }

    public void setAssignedOfficer(String assignedOfficer) {
        this.assignedOfficer = assignedOfficer;
    }
}
