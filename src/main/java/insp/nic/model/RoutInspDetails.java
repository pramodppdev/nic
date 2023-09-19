package insp.nic.model;


public class RoutInspDetails {
    private String routInspContent;
    private String routInspAns;
    private String imgReq;
    private byte[] image;

    public RoutInspDetails() {
    }

    public RoutInspDetails(String routInspContent, String routInspAns, String imgReq, byte[] image) {
        this.routInspContent = routInspContent;
        this.routInspAns = routInspAns;
        this.imgReq = imgReq;
        this.image = image;
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

    public String getImgReq() {
        return imgReq;
    }

    public void setImgReq(String imgReq) {
        this.imgReq = imgReq;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}