package insp.nic.model;

public class RoutInspDetails {
    private String routInspContent;
    private String routInspAns;

    public RoutInspDetails() {
    }

    public RoutInspDetails(String routInspContent, String routInspAns) {
        this.routInspContent = routInspContent;
        this.routInspAns = routInspAns;
    }

    public String getRoutInspContent() {
        return routInspContent;
    }

    public void setRoutInspContent(String routInspContent) {
        this.routInspContent = routInspContent;
    }

    public String getRoutInspAns() {
        return routInspAns;
    }

    public void setRoutInspAns(String routInspAns) {
        this.routInspAns = routInspAns;
    }
}
