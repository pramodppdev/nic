package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "insp")
public class Inspection {

    @Id
    private String inspId;

    private String taluk;

    private String department;

    private String description;

    private String lastDate;

    private String status;

    private String assignedOfficer;

    public Inspection() {
    }

    public Inspection(String inspId, String taluk, String department, String description, String lastDate, String status, String assignedOfficer) {
        this.inspId = inspId;
        this.taluk = taluk;
        this.department = department;
        this.description = description;
        this.lastDate = lastDate;
        this.status = status;
        this.assignedOfficer = assignedOfficer;
    }

    public String getInspId() {
        return inspId;
    }

    public void setInspId(String inspId) {
        this.inspId = inspId;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedOff() {
        return assignedOfficer;
    }

    public void setAssignedOff(String assignedOff) {
        this.assignedOfficer = assignedOff;
    }

}
