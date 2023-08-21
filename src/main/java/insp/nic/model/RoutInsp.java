package insp.nic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "routinsp")
public class RoutInsp {

    @Id
    private String routinspId;

    private String routtaluk;

    private String routdepartment;

    private List<RoutInspDetails> routdescription;

    private String routDesig;

    private String routlastDate;

    private String routstatus;

    private String routassignedOfficer;

    private String routcreatedAt;

    private String routcreatedBy;

    private String routdistrict;

    public RoutInsp() {
    }

    public RoutInsp(String routinspId, String routtaluk, String routdepartment, List<RoutInspDetails> routdescription, String routDesig, String routlastDate, String routstatus, String routassignedOfficer, String routcreatedAt, String routcreatedBy, String routdistrict) {
        this.routinspId = routinspId;
        this.routtaluk = routtaluk;
        this.routdepartment = routdepartment;
        this.routdescription = routdescription;
        this.routDesig = routDesig;
        this.routlastDate = routlastDate;
        this.routstatus = routstatus;
        this.routassignedOfficer = routassignedOfficer;
        this.routcreatedAt = routcreatedAt;
        this.routcreatedBy = routcreatedBy;
        this.routdistrict = routdistrict;
    }

    public String getRoutinspId() {
        return routinspId;
    }

    public void setRoutinspId(String routinspId) {
        this.routinspId = routinspId;
    }

    public String getRouttaluk() {
        return routtaluk;
    }

    public void setRouttaluk(String routtaluk) {
        this.routtaluk = routtaluk;
    }

    public String getRoutdepartment() {
        return routdepartment;
    }

    public void setRoutdepartment(String routdepartment) {
        this.routdepartment = routdepartment;
    }

    public List<RoutInspDetails> getRoutdescription() {
        return routdescription;
    }

    public void setRoutdescription(List<RoutInspDetails> routdescription) {
        this.routdescription = routdescription;
    }

    public String getRoutDesig() {
        return routDesig;
    }

    public void setRoutDesig(String routDesig) {
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

    public String getRoutassignedOfficer() {
        return routassignedOfficer;
    }

    public void setRoutassignedOfficer(String routassignedOfficer) {
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
}