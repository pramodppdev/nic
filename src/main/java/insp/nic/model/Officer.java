package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "officer")
public class Officer {

    @Id
    private String officerId;

    private String officerName;

    private String officerCode;

    private Long officerMob;

    private String officerDept;

    private String taluk;

    public Officer() {
    }

    public Officer(String officerId, String officerName, String officerCode, Long officerMob, String officerDept, String taluk) {
        this.officerId = officerId;
        this.officerName = officerName;
        this.officerCode = officerCode;
        this.officerMob = officerMob;
        this.officerDept = officerDept;
        this.taluk = taluk;
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

    public String getOfficerCode() {
        return officerCode;
    }

    public void setOfficerCode(String officerCode) {
        this.officerCode = officerCode;
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
}
