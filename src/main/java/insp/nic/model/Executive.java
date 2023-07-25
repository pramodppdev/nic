package insp.nic.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "executive")

public class Executive {

    @Id
    private String executiveId;

    private String executiveName;

    private String executiveUserName;

    private String executivePasswd;

    private String createdAt;

    private String createdBy;

    private String district;

    private Long executiveMob;

    public Executive() {
    }

    public Executive(String executiveId, String executiveName, String executiveUserName, String executivePasswd, String createdAt, String createdBy, String district, Long executiveMob) {
        this.executiveId = executiveId;
        this.executiveName = executiveName;
        this.executiveUserName = executiveUserName;
        this.executivePasswd = executivePasswd;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.district = district;
        this.executiveMob = executiveMob;
    }

    public String getExecutiveId() {
        return executiveId;
    }

    public void setExecutiveId(String executiveId) {
        this.executiveId = executiveId;
    }

    public String getExecutiveName() {
        return executiveName;
    }

    public void setExecutiveName(String executiveName) {
        this.executiveName = executiveName;
    }

    public String getExecutiveUserName() {
        return executiveUserName;
    }

    public void setExecutiveUserName(String executiveUserName) {
        this.executiveUserName = executiveUserName;
    }

    public String getExecutivePasswd() {
        return executivePasswd;
    }

    public void setExecutivePasswd(String executivePasswd) {
        this.executivePasswd = executivePasswd;
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

    public Long getExecutiveMob() {
        return executiveMob;
    }

    public void setExecutiveMob(Long executiveMob) {
        this.executiveMob = executiveMob;
    }
}
