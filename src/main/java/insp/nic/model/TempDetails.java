package insp.nic.model;

import org.springframework.data.annotation.Id;

import java.sql.Blob;

public class TempDetails {

    @Id
    private String queId;

    private String tempContent;

    private String tempAns;

    private String imgReq;

    private Blob image;

    public TempDetails() {
    }

    public TempDetails(String queId, String tempContent, String tempAns, String imgReq, Blob image) {
        this.queId = queId;
        this.tempContent = tempContent;
        this.tempAns = tempAns;
        this.imgReq = imgReq;
        this.image = image;
    }

    public String getQueId() {
        return queId;
    }

    public void setQueId(String queId) {
        this.queId = queId;
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
