package com.szboanda.meeting.video.mode;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_ZXXD_VIDEO_EVIDENCE")
public class Video {

    @Id
    @Column(name = "XH")
    private String xh;

    @Column(name = "RECORDID")
    private String recordId;

    @Column(name = "MAPPATH")
    private String path;

    @Column(name = "CJR")
    private String cjr;

    @Column(name = "CJSJ")
    private Date cjsj;

    @Column(name = "XGR")
    private String xgr;

    @Column(name = "XGSJ")
    @CreatedDate
    private Date xgsj;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }
}
