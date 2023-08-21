package insp.nic.model;

import java.sql.Blob;

public class AdHocDetails {
    private String adhocInspContent;
    private String adhocInspAns;
    private String imgReq;
    private Blob image;

    public AdHocDetails() {
    }

    public AdHocDetails(String adhocInspContent, String adhocInspAns, String imgReq, Blob image) {
        this.adhocInspContent = adhocInspContent;
        this.adhocInspAns = adhocInspAns;
        this.imgReq = imgReq;
        this.image = image;
    }

    public String getAdhocInspContent() {
        return adhocInspContent;
    }

    public void setAdhocInspContent(String adhocInspContent) {
        this.adhocInspContent = adhocInspContent;
    }

    public String getAdhocInspAns() {
        return adhocInspAns;
    }

    public void setAdhocInspAns(String adhocInspAns) {
        this.adhocInspAns = adhocInspAns;
    }

    public String getImgReq() {
        return imgReq;
    }

    public void setImgReq(String imgReq) {
        this.imgReq = imgReq;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}