package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatFileFldAttr {
    private String fileFldIdx;

    private Integer colNum;

    private Integer outNum;

    private String colTyp;

    private String fldId;

    private String fldNm;

    private Integer startPos;

    private Integer endPos;

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

    public Integer getColNum() {
        return colNum;
    }

    public void setColNum(Integer colNum) {
        this.colNum = colNum;
    }

    public Integer getOutNum() {
        return outNum;
    }

    public void setOutNum(Integer outNum) {
        this.outNum = outNum;
    }

    public String getColTyp() {
        return colTyp;
    }

    public void setColTyp(String colTyp) {
        this.colTyp = colTyp == null ? null : colTyp.trim();
    }

    public String getFldId() {
        return fldId;
    }

    public void setFldId(String fldId) {
        this.fldId = fldId == null ? null : fldId.trim();
    }

    public String getFldNm() {
        return fldNm;
    }

    public void setFldNm(String fldNm) {
        this.fldNm = fldNm == null ? null : fldNm.trim();
    }

    public Integer getStartPos() {
        return startPos;
    }

    public void setStartPos(Integer startPos) {
        this.startPos = startPos;
    }

    public Integer getEndPos() {
        return endPos;
    }

    public void setEndPos(Integer endPos) {
        this.endPos = endPos;
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