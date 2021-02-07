package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatFileFmtInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatFileFmtInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFileFldIdxIsNull() {
            addCriterion("FILE_FLD_IDX is null");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxIsNotNull() {
            addCriterion("FILE_FLD_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxEqualTo(String value) {
            addCriterion("FILE_FLD_IDX =", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxNotEqualTo(String value) {
            addCriterion("FILE_FLD_IDX <>", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxGreaterThan(String value) {
            addCriterion("FILE_FLD_IDX >", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_FLD_IDX >=", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxLessThan(String value) {
            addCriterion("FILE_FLD_IDX <", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxLessThanOrEqualTo(String value) {
            addCriterion("FILE_FLD_IDX <=", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxLike(String value) {
            addCriterion("FILE_FLD_IDX like", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxNotLike(String value) {
            addCriterion("FILE_FLD_IDX not like", value, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxIn(List<String> values) {
            addCriterion("FILE_FLD_IDX in", values, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxNotIn(List<String> values) {
            addCriterion("FILE_FLD_IDX not in", values, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxBetween(String value1, String value2) {
            addCriterion("FILE_FLD_IDX between", value1, value2, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileFldIdxNotBetween(String value1, String value2) {
            addCriterion("FILE_FLD_IDX not between", value1, value2, "fileFldIdx");
            return (Criteria) this;
        }

        public Criteria andFileTypIsNull() {
            addCriterion("FILE_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFileTypIsNotNull() {
            addCriterion("FILE_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypEqualTo(String value) {
            addCriterion("FILE_TYP =", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypNotEqualTo(String value) {
            addCriterion("FILE_TYP <>", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypGreaterThan(String value) {
            addCriterion("FILE_TYP >", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_TYP >=", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypLessThan(String value) {
            addCriterion("FILE_TYP <", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypLessThanOrEqualTo(String value) {
            addCriterion("FILE_TYP <=", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypLike(String value) {
            addCriterion("FILE_TYP like", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypNotLike(String value) {
            addCriterion("FILE_TYP not like", value, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypIn(List<String> values) {
            addCriterion("FILE_TYP in", values, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypNotIn(List<String> values) {
            addCriterion("FILE_TYP not in", values, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypBetween(String value1, String value2) {
            addCriterion("FILE_TYP between", value1, value2, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileTypNotBetween(String value1, String value2) {
            addCriterion("FILE_TYP not between", value1, value2, "fileTyp");
            return (Criteria) this;
        }

        public Criteria andFileFmtIsNull() {
            addCriterion("FILE_FMT is null");
            return (Criteria) this;
        }

        public Criteria andFileFmtIsNotNull() {
            addCriterion("FILE_FMT is not null");
            return (Criteria) this;
        }

        public Criteria andFileFmtEqualTo(String value) {
            addCriterion("FILE_FMT =", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtNotEqualTo(String value) {
            addCriterion("FILE_FMT <>", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtGreaterThan(String value) {
            addCriterion("FILE_FMT >", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_FMT >=", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtLessThan(String value) {
            addCriterion("FILE_FMT <", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtLessThanOrEqualTo(String value) {
            addCriterion("FILE_FMT <=", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtLike(String value) {
            addCriterion("FILE_FMT like", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtNotLike(String value) {
            addCriterion("FILE_FMT not like", value, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtIn(List<String> values) {
            addCriterion("FILE_FMT in", values, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtNotIn(List<String> values) {
            addCriterion("FILE_FMT not in", values, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtBetween(String value1, String value2) {
            addCriterion("FILE_FMT between", value1, value2, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileFmtNotBetween(String value1, String value2) {
            addCriterion("FILE_FMT not between", value1, value2, "fileFmt");
            return (Criteria) this;
        }

        public Criteria andFileSepIsNull() {
            addCriterion("FILE_SEP is null");
            return (Criteria) this;
        }

        public Criteria andFileSepIsNotNull() {
            addCriterion("FILE_SEP is not null");
            return (Criteria) this;
        }

        public Criteria andFileSepEqualTo(String value) {
            addCriterion("FILE_SEP =", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepNotEqualTo(String value) {
            addCriterion("FILE_SEP <>", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepGreaterThan(String value) {
            addCriterion("FILE_SEP >", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_SEP >=", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepLessThan(String value) {
            addCriterion("FILE_SEP <", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepLessThanOrEqualTo(String value) {
            addCriterion("FILE_SEP <=", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepLike(String value) {
            addCriterion("FILE_SEP like", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepNotLike(String value) {
            addCriterion("FILE_SEP not like", value, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepIn(List<String> values) {
            addCriterion("FILE_SEP in", values, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepNotIn(List<String> values) {
            addCriterion("FILE_SEP not in", values, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepBetween(String value1, String value2) {
            addCriterion("FILE_SEP between", value1, value2, "fileSep");
            return (Criteria) this;
        }

        public Criteria andFileSepNotBetween(String value1, String value2) {
            addCriterion("FILE_SEP not between", value1, value2, "fileSep");
            return (Criteria) this;
        }

        public Criteria andHeadFlgIsNull() {
            addCriterion("HEAD_FLG is null");
            return (Criteria) this;
        }

        public Criteria andHeadFlgIsNotNull() {
            addCriterion("HEAD_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andHeadFlgEqualTo(String value) {
            addCriterion("HEAD_FLG =", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgNotEqualTo(String value) {
            addCriterion("HEAD_FLG <>", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgGreaterThan(String value) {
            addCriterion("HEAD_FLG >", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_FLG >=", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgLessThan(String value) {
            addCriterion("HEAD_FLG <", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgLessThanOrEqualTo(String value) {
            addCriterion("HEAD_FLG <=", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgLike(String value) {
            addCriterion("HEAD_FLG like", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgNotLike(String value) {
            addCriterion("HEAD_FLG not like", value, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgIn(List<String> values) {
            addCriterion("HEAD_FLG in", values, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgNotIn(List<String> values) {
            addCriterion("HEAD_FLG not in", values, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgBetween(String value1, String value2) {
            addCriterion("HEAD_FLG between", value1, value2, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadFlgNotBetween(String value1, String value2) {
            addCriterion("HEAD_FLG not between", value1, value2, "headFlg");
            return (Criteria) this;
        }

        public Criteria andHeadLinIsNull() {
            addCriterion("HEAD_LIN is null");
            return (Criteria) this;
        }

        public Criteria andHeadLinIsNotNull() {
            addCriterion("HEAD_LIN is not null");
            return (Criteria) this;
        }

        public Criteria andHeadLinEqualTo(Integer value) {
            addCriterion("HEAD_LIN =", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinNotEqualTo(Integer value) {
            addCriterion("HEAD_LIN <>", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinGreaterThan(Integer value) {
            addCriterion("HEAD_LIN >", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinGreaterThanOrEqualTo(Integer value) {
            addCriterion("HEAD_LIN >=", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinLessThan(Integer value) {
            addCriterion("HEAD_LIN <", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinLessThanOrEqualTo(Integer value) {
            addCriterion("HEAD_LIN <=", value, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinIn(List<Integer> values) {
            addCriterion("HEAD_LIN in", values, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinNotIn(List<Integer> values) {
            addCriterion("HEAD_LIN not in", values, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinBetween(Integer value1, Integer value2) {
            addCriterion("HEAD_LIN between", value1, value2, "headLin");
            return (Criteria) this;
        }

        public Criteria andHeadLinNotBetween(Integer value1, Integer value2) {
            addCriterion("HEAD_LIN not between", value1, value2, "headLin");
            return (Criteria) this;
        }

        public Criteria andEndLinIsNull() {
            addCriterion("END_LIN is null");
            return (Criteria) this;
        }

        public Criteria andEndLinIsNotNull() {
            addCriterion("END_LIN is not null");
            return (Criteria) this;
        }

        public Criteria andEndLinEqualTo(Integer value) {
            addCriterion("END_LIN =", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinNotEqualTo(Integer value) {
            addCriterion("END_LIN <>", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinGreaterThan(Integer value) {
            addCriterion("END_LIN >", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinGreaterThanOrEqualTo(Integer value) {
            addCriterion("END_LIN >=", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinLessThan(Integer value) {
            addCriterion("END_LIN <", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinLessThanOrEqualTo(Integer value) {
            addCriterion("END_LIN <=", value, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinIn(List<Integer> values) {
            addCriterion("END_LIN in", values, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinNotIn(List<Integer> values) {
            addCriterion("END_LIN not in", values, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinBetween(Integer value1, Integer value2) {
            addCriterion("END_LIN between", value1, value2, "endLin");
            return (Criteria) this;
        }

        public Criteria andEndLinNotBetween(Integer value1, Integer value2) {
            addCriterion("END_LIN not between", value1, value2, "endLin");
            return (Criteria) this;
        }

        public Criteria andTblNmIsNull() {
            addCriterion("TBL_NM is null");
            return (Criteria) this;
        }

        public Criteria andTblNmIsNotNull() {
            addCriterion("TBL_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTblNmEqualTo(String value) {
            addCriterion("TBL_NM =", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmNotEqualTo(String value) {
            addCriterion("TBL_NM <>", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmGreaterThan(String value) {
            addCriterion("TBL_NM >", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmGreaterThanOrEqualTo(String value) {
            addCriterion("TBL_NM >=", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmLessThan(String value) {
            addCriterion("TBL_NM <", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmLessThanOrEqualTo(String value) {
            addCriterion("TBL_NM <=", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmLike(String value) {
            addCriterion("TBL_NM like", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmNotLike(String value) {
            addCriterion("TBL_NM not like", value, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmIn(List<String> values) {
            addCriterion("TBL_NM in", values, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmNotIn(List<String> values) {
            addCriterion("TBL_NM not in", values, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmBetween(String value1, String value2) {
            addCriterion("TBL_NM between", value1, value2, "tblNm");
            return (Criteria) this;
        }

        public Criteria andTblNmNotBetween(String value1, String value2) {
            addCriterion("TBL_NM not between", value1, value2, "tblNm");
            return (Criteria) this;
        }

        public Criteria andOpenInIsNull() {
            addCriterion("OPEN_IN is null");
            return (Criteria) this;
        }

        public Criteria andOpenInIsNotNull() {
            addCriterion("OPEN_IN is not null");
            return (Criteria) this;
        }

        public Criteria andOpenInEqualTo(String value) {
            addCriterion("OPEN_IN =", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInNotEqualTo(String value) {
            addCriterion("OPEN_IN <>", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInGreaterThan(String value) {
            addCriterion("OPEN_IN >", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_IN >=", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInLessThan(String value) {
            addCriterion("OPEN_IN <", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInLessThanOrEqualTo(String value) {
            addCriterion("OPEN_IN <=", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInLike(String value) {
            addCriterion("OPEN_IN like", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInNotLike(String value) {
            addCriterion("OPEN_IN not like", value, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInIn(List<String> values) {
            addCriterion("OPEN_IN in", values, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInNotIn(List<String> values) {
            addCriterion("OPEN_IN not in", values, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInBetween(String value1, String value2) {
            addCriterion("OPEN_IN between", value1, value2, "openIn");
            return (Criteria) this;
        }

        public Criteria andOpenInNotBetween(String value1, String value2) {
            addCriterion("OPEN_IN not between", value1, value2, "openIn");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIsNull() {
            addCriterion("REC_UPD_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIsNotNull() {
            addCriterion("REC_UPD_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdEqualTo(String value) {
            addCriterion("REC_UPD_USR_ID =", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotEqualTo(String value) {
            addCriterion("REC_UPD_USR_ID <>", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdGreaterThan(String value) {
            addCriterion("REC_UPD_USR_ID >", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("REC_UPD_USR_ID >=", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLessThan(String value) {
            addCriterion("REC_UPD_USR_ID <", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLessThanOrEqualTo(String value) {
            addCriterion("REC_UPD_USR_ID <=", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLike(String value) {
            addCriterion("REC_UPD_USR_ID like", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotLike(String value) {
            addCriterion("REC_UPD_USR_ID not like", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIn(List<String> values) {
            addCriterion("REC_UPD_USR_ID in", values, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotIn(List<String> values) {
            addCriterion("REC_UPD_USR_ID not in", values, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdBetween(String value1, String value2) {
            addCriterion("REC_UPD_USR_ID between", value1, value2, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotBetween(String value1, String value2) {
            addCriterion("REC_UPD_USR_ID not between", value1, value2, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNull() {
            addCriterion("REC_UPD_TS is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNotNull() {
            addCriterion("REC_UPD_TS is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsEqualTo(Date value) {
            addCriterion("REC_UPD_TS =", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotEqualTo(Date value) {
            addCriterion("REC_UPD_TS <>", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThan(Date value) {
            addCriterion("REC_UPD_TS >", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TS >=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThan(Date value) {
            addCriterion("REC_UPD_TS <", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TS <=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIn(List<Date> values) {
            addCriterion("REC_UPD_TS in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotIn(List<Date> values) {
            addCriterion("REC_UPD_TS not in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TS between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TS not between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNull() {
            addCriterion("REC_CRT_TS is null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNotNull() {
            addCriterion("REC_CRT_TS is not null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsEqualTo(Date value) {
            addCriterion("REC_CRT_TS =", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotEqualTo(Date value) {
            addCriterion("REC_CRT_TS <>", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThan(Date value) {
            addCriterion("REC_CRT_TS >", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TS >=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThan(Date value) {
            addCriterion("REC_CRT_TS <", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TS <=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIn(List<Date> values) {
            addCriterion("REC_CRT_TS in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotIn(List<Date> values) {
            addCriterion("REC_CRT_TS not in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TS between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TS not between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}