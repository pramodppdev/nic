package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "officer")
public class Officer {

    @Id
    private String officerId;

    private String officerName;

    private Long officerMob;

    @DBRef
    private Department officerDept;

    @DBRef
    private Taluk taluk;

    private String district;

    @DBRef
    private Designation designation;

    private String createdAt;

    private String createdBy;

    private String level;

    public Officer() {
    }

    public Officer(String officerId, String officerName, Long officerMob, Department officerDept, Taluk taluk, String district, Designation designation, String createdAt, String createdBy, String level) {
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

    public Department getOfficerDept() {
        return officerDept;
    }

    public void setOfficerDept(Department officerDept) {
        this.officerDept = officerDept;
    }

    public Taluk getTaluk() {
        return taluk;
    }

    public void setTaluk(Taluk taluk) {
        this.taluk = taluk;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
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
