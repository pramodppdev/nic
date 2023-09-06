package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "officer")
public class Officer {

    @Id
    private String officerId;

    private String officerName;

    private Long officerMob;

    private String officerDept;

    private String taluk;

    private String district;

    private String designation;

    private String createdAt;

    private String createdBy;

    private String level;

    public Officer() {
    }

    public Officer(String officerId, String officerName, Long officerMob, String officerDept, String taluk, String district, String designation, String createdAt, String createdBy, String level) {
        this.officerId = officerId;
        this.officerName = officerName;
        this.officerMob = officerMob;
        this.officerDept = officerDept;
        this.taluk = taluk;
        this.district = district;
        this.designation = designation;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.level = level;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public Long getOfficerMob() {
        return officerMob;
    }

    public void setOfficerMob(Long officerMob) {
        this.officerMob = officerMob;
    }

    public String getOfficerDept() {
        return officerDept;
    }

    public void setOfficerDept(String officerDept) {
        this.officerDept = officerDept;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
