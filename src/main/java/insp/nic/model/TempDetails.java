package insp.nic.model;

import java.sql.Blob;

public class TempDetails {

    private String tempContent;

    private String tempAns;

    private String imgReq;

    private Blob image;

    public TempDetails() {
    }

    public TempDetails(String tempContent, String tempAns, String imgReq, Blob image) {
        this.tempContent = tempContent;
        this.tempAns = tempAns;
        this.imgReq = imgReq;
        this.image = image;
    }

    public String getTempContent() {
        return tempContent;
    }

    public void setTempContent(String tempContent) {
        this.tempContent = tempContent;
    }

    public String getTempAns() {
        return tempAns;
    }

    public void setTempAns(String tempAns) {
        this.tempAns = tempAns;
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
