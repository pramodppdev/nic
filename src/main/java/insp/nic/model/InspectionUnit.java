package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;

@Document(collection = "insp_unit")
public class InspectionUnit {

    @Id
    private String unitid;


    @DBRef
    private Department dept;

    private String level;

    @DBRef
    private Taluk taluk;
    private String unitName;
    private String assignedMonth;

    private String assignedOfficer;
    private String status;


    public InspectionUnit() {
    }

    public InspectionUnit(String unitid, Department dept, String level, Taluk taluk, String unitName, String assignedMonth, String assignedOfficer, String status) {
        this.unitid = unitid;
        this.dept = dept;
        this.level = level;
        this.taluk = taluk;
        this.unitName = unitName;
        this.assignedMonth = assignedMonth;
        this.assignedOfficer = assignedOfficer;
        this.status = status;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
