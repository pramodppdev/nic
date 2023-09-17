
package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quetemplet")
public class QueTemplet {

    @Id
    private String tempId;

    private String tempName;

    private String tempLevel;

    @DBRef
    private Department tempDept;

    private List<TempDetails> tempDiscription;

    public QueTemplet() {
    }

    public QueTemplet(String tempId, String tempName, String tempLevel, Department tempDept, List<TempDetails> tempDiscription) {
        this.tempId = tempId;
        this.tempName = tempName;
        this.tempLevel = tempLevel;
        this.tempDept = tempDept;
        this.tempDiscription = tempDiscription;
    }

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public String getTempLevel() {
        return tempLevel;
    }

    public void setTempLevel(String tempLevel) {
        this.tempLevel = tempLevel;
    }

    public Department getTempDept() {
        return tempDept;
    }

    public void setTempDept(Department tempDept) {
        this.tempDept = tempDept;
    }

    public List<TempDetails> getTempDiscription() {
        return tempDiscription;
    }

    public void setTempDiscription(List<TempDetails> tempDiscription) {
        this.tempDiscription = tempDiscription;
    }
}
