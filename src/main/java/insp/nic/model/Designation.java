package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "designation")
public class Designation {

    @Id
    private String desgId;

    private String department;

    private String designationName;

    public Designation() {
    }

    public Designation(String desgId, String department, String designation) {
        this.desgId = desgId;
        this.department = department;
        this.designationName = designation;
    }

    public String getDesgId() {
        return desgId;
    }

    public void setDesgId(String desgId) {
        this.desgId = desgId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }
}
