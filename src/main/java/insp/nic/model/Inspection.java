package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inspection")
public class Inspection {

    @Id
    private String inspId;

    private String taluk;

    private String department;

    private String description;

    private String designation;

    private String lastDate;

    private String status;

    private String assignedOfficer;

    private String createdAt;

    private String createdBy;

    private String district;

    public Inspection() {
    }

    public Inspection(String inspId, String taluk, String department, String description, String designation, String lastDate, String status, String assignedOfficer, String createdAt, String createdBy, String district) {
        this.inspId = inspId;
        this.taluk = taluk;
        this.department = department;
        this.description = description;
        this.designation = designation;
        this.lastDate = lastDate;
        this.status = status;
        this.assignedOfficer = assignedOfficer;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.district = district;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getAssignedOfficer() {
        return assignedOfficer;
    }

    public void setAssignedOfficer(String assignedOfficer) {
        this.assignedOfficer = assignedOfficer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
