package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "routinsp")
public class RoutInsp {

    @Id
    private String routinspId;

    private String level;

    @DBRef
    private Taluk routtaluk;

    @DBRef
    private Department routdepartment;

    private String routTempName;

    private List<RoutInspDetails> routdescription;

    @DBRef
    private Designation routDesig;

    private String routlastDate;

    private String routstatus;

    @DBRef
    private Officer routassignedOfficer;

    private String routcreatedAt;

    private String routcreatedBy;

    private String routdistrict;

    @DBRef
    private List<InspectionUnit> inspUnits;

    public RoutInsp() {
    }

    public RoutInsp(String routinspId, String level, Taluk routtaluk, Department routdepartment, String routTempName, List<RoutInspDetails> routdescription, Designation routDesig, String routlastDate, String routstatus, Officer routassignedOfficer, String routcreatedAt, String routcreatedBy, String routdistrict, List<InspectionUnit> inspUnits) {
        this.routinspId = routinspId;
        this.level = level;
        this.routtaluk = routtaluk;
        this.routdepartment = routdepartment;
        this.routTempName = routTempName;
        this.routdescription = routdescription;
        this.routDesig = routDesig;
        this.routlastDate = routlastDate;
        this.routstatus = routstatus;
        this.routassignedOfficer = routassignedOfficer;
        this.routcreatedAt = routcreatedAt;
        this.routcreatedBy = routcreatedBy;
        this.routdistrict = routdistrict;
        this.inspUnits = inspUnits;
    }

    public String getRoutinspId() {
        return routinspId;
    }

    public void setRoutinspId(String routinspId) {
        this.routinspId = routinspId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Taluk getRouttaluk() {
        return routtaluk;
    }

    public void setRouttaluk(Taluk routtaluk) {
        this.routtaluk = routtaluk;
    }

    public Department getRoutdepartment() {
        return routdepartment;
    }

    public void setRoutdepartment(Department routdepartment) {
        this.routdepartment = routdepartment;
    }

    public String getRoutTempName() {
        return routTempName;
    }

    public void setRoutTempName(String routTempName) {
        this.routTempName = routTempName;
    }

    public List<RoutInspDetails> getRoutdescription() {
        return routdescription;
    }

    public void setRoutdescription(List<RoutInspDetails> routdescription) {
        this.routdescription = routdescription;
    }

    public Designation getRoutDesig() {
        return routDesig;
    }

    public void setRoutDesig(Designation routDesig) {
        this.routDesig = routDesig;
    }

    public String getRoutlastDate() {
        return routlastDate;
    }

    public void setRoutlastDate(String routlastDate) {
        this.routlastDate = routlastDate;
    }

    public String getRoutstatus() {
        return routstatus;
    }

    public void setRoutstatus(String routstatus) {
        this.routstatus = routstatus;
    }

    public Officer getRoutassignedOfficer() {
        return routassignedOfficer;
    }

    public void setRoutassignedOfficer(Officer routassignedOfficer) {
        this.routassignedOfficer = routassignedOfficer;
    }

    public String getRoutcreatedAt() {
        return routcreatedAt;
    }

    public void setRoutcreatedAt(String routcreatedAt) {
        this.routcreatedAt = routcreatedAt;
    }

    public String getRoutcreatedBy() {
        return routcreatedBy;
    }

    public void setRoutcreatedBy(String routcreatedBy) {
        this.routcreatedBy = routcreatedBy;
    }

    public String getRoutdistrict() {
        return routdistrict;
    }

    public void setRoutdistrict(String routdistrict) {
        this.routdistrict = routdistrict;
    }

    public List<InspectionUnit> getInspUnits() {
        return inspUnits;
    }

    public void setInspUnits(List<InspectionUnit> inspUnits) {
        this.inspUnits = inspUnits;
    }
}