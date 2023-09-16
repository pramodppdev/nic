package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "designation")
public class Designation {

    @Id
    private String desgId;

    @DBRef
    private Department department;

    private String designationName;

    private String level;

    public Designation() {
    }

    public Designation(String desgId, Department department, String designationName, String level) {
        this.desgId = desgId;
        this.department = department;
        this.designationName = designationName;
        this.level = level;
    }

    public String getDesgId() {
        return desgId;
    }

    public void setDesgId(String desgId) {
        this.desgId = desgId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}