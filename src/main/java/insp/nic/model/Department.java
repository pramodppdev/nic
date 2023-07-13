package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dept")
public class Department {

    @Id
    private String deptId;

    private String deptName;

    private String deptCode;

    public Department() {
    }

    public Department(String deptId, String deptName, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptCode = deptCode;
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}
