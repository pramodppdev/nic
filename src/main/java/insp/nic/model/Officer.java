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

    private String designation;

    public Officer() {
    }

    public Officer(String officerId, String officerName, Long officerMob, String officerDept, String taluk, String designation) {
        this.officerId = officerId;
        this.officerName = officerName;
        this.officerMob = officerMob;
        this.officerDept = officerDept;
        this.taluk = taluk;
        this.designation = designation;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
