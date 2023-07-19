package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "district")
public class District {

    @Id
    private String districtId;

    private String districtName;

    private String createdAt;

    private String createdBy;

    public District() {
    }

    public District(String districtId, String districtName, String createdAt, String createdBy) {
        this.districtId = districtId;
        this.districtName = districtName;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
