package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "dept")
public class Department {

    @Id
    private String deptId;

    private String deptName;

    private Date createdAt;

    private String createdBy;

    public Department() {
    }

    public Department(String deptId, String deptName, Date createdAt, String createdBy) {
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
