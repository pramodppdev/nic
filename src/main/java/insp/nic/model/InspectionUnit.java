package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;

@Document(collection = "insp_unit")
public class InspectionUnit {

    @Id
    private String id;
    private String dept;
    private String level;
    private String taluk;
    private String unitName;
    private String assignedMonth;

    private String assignedOfficer;

    public InspectionUnit() {
    }

    public InspectionUnit(String id, String dept, String level, String taluk, String unitName, String assignedMonth, String assignedOfficer) {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
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
