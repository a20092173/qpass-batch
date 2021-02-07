package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatFileFmtInf {
    private String fileFldIdx;

    private String fileTyp;

    private String fileFmt;

    private String fileSep;

    private String headFlg;

    private Integer headLin;

    private Integer endLin;

    private String tblNm;

    private String openIn;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getFileFldIdx() {
        return fileFldIdx;
    }

    public void setFileFldIdx(String fileFldIdx) {
        this.fileFldIdx = fileFldIdx == null ? null : fileFldIdx.trim();
    }

    public String getFileTyp() {
        return fileTyp;
    }

    public void setFileTyp(String fileTyp) {
        this.fileTyp = fileTyp == null ? null : fileTyp.trim();
    }

    public String getFileFmt() {
        return fileFmt;
    }

    public void setFileFmt(String fileFmt) {
        this.fileFmt = fileFmt == null ? null : fileFmt.trim();
    }

    public String getFileSep() {
        return fileSep;
    }

    public void setFileSep(String fileSep) {
        this.fileSep = fileSep == null ? null : fileSep.trim();
    }

    public String getHeadFlg() {
        return headFlg;
    }

    public void setHeadFlg(String headFlg) {
        this.headFlg = headFlg == null ? null : headFlg.trim();
    }

    public Integer getHeadLin() {
        return headLin;
    }

    public void setHeadLin(Integer headLin) {
        this.headLin = headLin;
    }

    public Integer getEndLin() {
        return endLin;
    }

    public void setEndLin(Integer endLin) {
        this.endLin = endLin;
    }

    public String getTblNm() {
        return tblNm;
    }

    public void setTblNm(String tblNm) {
        this.tblNm = tblNm == null ? null : tblNm.trim();
    }

    public String getOpenIn() {
        return openIn;
    }

    public void setOpenIn(String openIn) {
        this.openIn = openIn == null ? null : openIn.trim();
    }

    public String getRecUpdUsrId() {
        return recUpdUsrId;
    }

    public void setRecUpdUsrId(String recUpdUsrId) {
        this.recUpdUsrId = recUpdUsrId == null ? null : recUpdUsrId.trim();
    }

    public Date getRecUpdTs() {
        return recUpdTs;
    }

    public void setRecUpdTs(Date recUpdTs) {
        this.recUpdTs = recUpdTs;
    }

    public Date getRecCrtTs() {
        return recCrtTs;
    }

    public void setRecCrtTs(Date recCrtTs) {
        this.recCrtTs = recCrtTs;
    }
}