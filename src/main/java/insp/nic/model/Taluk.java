package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "taluk")
public class Taluk {

    @Id
    private String talukId;

    private String talukName;

    private String district;

    private String createdAt;

    private String createdBy;

    public Taluk() {
    }

    public Taluk(String talukId, String talukName, String district, String createdAt, String createdBy) {
        this.talukId = talukId;
        this.talukName = talukName;
        this.district = district;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public String getTalukId() {
        return talukId;
    }

    public void setTalukId(String talukId) {
        this.talukId = talukId;
    }

    public String getTalukName() {
        return talukName;
    }

    public void setTalukName(String talukName) {
        this.talukName = talukName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
}