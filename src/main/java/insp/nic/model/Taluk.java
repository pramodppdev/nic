package insp.nic.model;


import jdk.jfr.Timestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "taluk")
public class Taluk {

    @Id
    private String talukId;

    private String talukName;

    @DBRef
    private District district;

    private Date createdAt;

    private String createdBy;

    public Taluk() {
    }

    public Taluk(String talukId, String talukName, District district, Date createdAt, String  createdBy) {
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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}