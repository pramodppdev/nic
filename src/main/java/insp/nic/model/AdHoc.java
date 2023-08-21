package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "adhoc")
public class AdHoc {

    @Id
    private String adhocinspId;

    private String adhoctaluk;

    private String adhocdepartment;

    private List<AdHocDetails> adhocdescription;

    private String adhocDesig;

    private String adhoclastDate;

    private String adhocstatus;

    private String adhocassignedOfficer;

    private String adhoccreatedAt;

    private String adhoccreatedBy;

    private String adhocdistrict;

    public AdHoc() {
    }

    public AdHoc(String adhocinspId, String adhoctaluk, String adhocdepartment, List<AdHocDetails> adhocdescription, String adhocDesig, String adhoclastDate, String adhocstatus, String adhocassignedOfficer, String adhoccreatedAt, String adhoccreatedBy, String adhocdistrict) {
        this.adhocinspId = adhocinspId;
        this.adhoctaluk = adhoctaluk;
        this.adhocdepartment = adhocdepartment;
        this.adhocdescription = adhocdescription;
        this.adhocDesig = adhocDesig;
        this.adhoclastDate = adhoclastDate;
        this.adhocstatus = adhocstatus;
        this.adhocassignedOfficer = adhocassignedOfficer;
        this.adhoccreatedAt = adhoccreatedAt;
        this.adhoccreatedBy = adhoccreatedBy;
        this.adhocdistrict = adhocdistrict;
    }

    public String getAdhocinspId() {
        return adhocinspId;
    }

    public void setAdhocinspId(String adhocinspId) {
        this.adhocinspId = adhocinspId;
    }

    public String getAdhoctaluk() {
        return adhoctaluk;
    }

    public void setAdhoctaluk(String adhoctaluk) {
        this.adhoctaluk = adhoctaluk;
    }

    public String getAdhocdepartment() {
        return adhocdepartment;
    }

    public void setAdhocdepartment(String adhocdepartment) {
        this.adhocdepartment = adhocdepartment;
    }

    public List<AdHocDetails> getAdhocdescription() {
        return adhocdescription;
    }

    public void setAdhocdescription(List<AdHocDetails> adhocdescription) {
        this.adhocdescription = adhocdescription;
    }

    public String getAdhocDesig() {
        return adhocDesig;
    }

    public void setAdhocDesig(String adhocDesig) {
        this.adhocDesig = adhocDesig;
    }

    public String getAdhoclastDate() {
        return adhoclastDate;
    }

    public void setAdhoclastDate(String adhoclastDate) {
        this.adhoclastDate = adhoclastDate;
    }

    public String getAdhocstatus() {
        return adhocstatus;
    }

    public void setAdhocstatus(String adhocstatus) {
        this.adhocstatus = adhocstatus;
    }

    public String getAdhocassignedOfficer() {
        return adhocassignedOfficer;
    }

    public void setAdhocassignedOfficer(String adhocassignedOfficer) {
        this.adhocassignedOfficer = adhocassignedOfficer;
    }

    public String getAdhoccreatedAt() {
        return adhoccreatedAt;
    }

    public void setAdhoccreatedAt(String adhoccreatedAt) {
        this.adhoccreatedAt = adhoccreatedAt;
    }

    public String getAdhoccreatedBy() {
        return adhoccreatedBy;
    }

    public void setAdhoccreatedBy(String adhoccreatedBy) {
        this.adhoccreatedBy = adhoccreatedBy;
    }

    public String getAdhocdistrict() {
        return adhocdistrict;
    }

    public void setAdhocdistrict(String adhocdistrict) {
        this.adhocdistrict = adhocdistrict;
    }
}