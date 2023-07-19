package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dept")
public class Department {

    @Id
    private String deptId;

    private String deptName;

    private String createdAt;

    private String createdBy;

    public Department() {
    }

    public Department(String deptId, String deptName, String createdAt, String createdBy) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
