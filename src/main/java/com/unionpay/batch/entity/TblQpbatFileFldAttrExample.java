package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatFileFldAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatFileFldAttrExample() {
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

        public Criteria andColNumIsNull() {
            addCriterion("COL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andColNumIsNotNull() {
            addCriterion("COL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andColNumEqualTo(Integer value) {
            addCriterion("COL_NUM =", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotEqualTo(Integer value) {
            addCriterion("COL_NUM <>", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumGreaterThan(Integer value) {
            addCriterion("COL_NUM >", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_NUM >=", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumLessThan(Integer value) {
            addCriterion("COL_NUM <", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumLessThanOrEqualTo(Integer value) {
            addCriterion("COL_NUM <=", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumIn(List<Integer> values) {
            addCriterion("COL_NUM in", values, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotIn(List<Integer> values) {
            addCriterion("COL_NUM not in", values, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumBetween(Integer value1, Integer value2) {
            addCriterion("COL_NUM between", value1, value2, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_NUM not between", value1, value2, "colNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNull() {
            addCriterion("OUT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNotNull() {
            addCriterion("OUT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumEqualTo(Integer value) {
            addCriterion("OUT_NUM =", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotEqualTo(Integer value) {
            addCriterion("OUT_NUM <>", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThan(Integer value) {
            addCriterion("OUT_NUM >", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUM >=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThan(Integer value) {
            addCriterion("OUT_NUM <", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUM <=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIn(List<Integer> values) {
            addCriterion("OUT_NUM in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotIn(List<Integer> values) {
            addCriterion("OUT_NUM not in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUM between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUM not between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andColTypIsNull() {
            addCriterion("COL_TYP is null");
            return (Criteria) this;
        }

        public Criteria andColTypIsNotNull() {
            addCriterion("COL_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andColTypEqualTo(String value) {
            addCriterion("COL_TYP =", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypNotEqualTo(String value) {
            addCriterion("COL_TYP <>", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypGreaterThan(String value) {
            addCriterion("COL_TYP >", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypGreaterThanOrEqualTo(String value) {
            addCriterion("COL_TYP >=", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypLessThan(String value) {
            addCriterion("COL_TYP <", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypLessThanOrEqualTo(String value) {
            addCriterion("COL_TYP <=", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypLike(String value) {
            addCriterion("COL_TYP like", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypNotLike(String value) {
            addCriterion("COL_TYP not like", value, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypIn(List<String> values) {
            addCriterion("COL_TYP in", values, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypNotIn(List<String> values) {
            addCriterion("COL_TYP not in", values, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypBetween(String value1, String value2) {
            addCriterion("COL_TYP between", value1, value2, "colTyp");
            return (Criteria) this;
        }

        public Criteria andColTypNotBetween(String value1, String value2) {
            addCriterion("COL_TYP not between", value1, value2, "colTyp");
            return (Criteria) this;
        }

        public Criteria andFldIdIsNull() {
            addCriterion("FLD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFldIdIsNotNull() {
            addCriterion("FLD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFldIdEqualTo(String value) {
            addCriterion("FLD_ID =", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdNotEqualTo(String value) {
            addCriterion("FLD_ID <>", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdGreaterThan(String value) {
            addCriterion("FLD_ID >", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_ID >=", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdLessThan(String value) {
            addCriterion("FLD_ID <", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdLessThanOrEqualTo(String value) {
            addCriterion("FLD_ID <=", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdLike(String value) {
            addCriterion("FLD_ID like", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdNotLike(String value) {
            addCriterion("FLD_ID not like", value, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdIn(List<String> values) {
            addCriterion("FLD_ID in", values, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdNotIn(List<String> values) {
            addCriterion("FLD_ID not in", values, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdBetween(String value1, String value2) {
            addCriterion("FLD_ID between", value1, value2, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldIdNotBetween(String value1, String value2) {
            addCriterion("FLD_ID not between", value1, value2, "fldId");
            return (Criteria) this;
        }

        public Criteria andFldNmIsNull() {
            addCriterion("FLD_NM is null");
            return (Criteria) this;
        }

        public Criteria andFldNmIsNotNull() {
            addCriterion("FLD_NM is not null");
            return (Criteria) this;
        }

        public Criteria andFldNmEqualTo(String value) {
            addCriterion("FLD_NM =", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmNotEqualTo(String value) {
            addCriterion("FLD_NM <>", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmGreaterThan(String value) {
            addCriterion("FLD_NM >", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_NM >=", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmLessThan(String value) {
            addCriterion("FLD_NM <", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmLessThanOrEqualTo(String value) {
            addCriterion("FLD_NM <=", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmLike(String value) {
            addCriterion("FLD_NM like", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmNotLike(String value) {
            addCriterion("FLD_NM not like", value, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmIn(List<String> values) {
            addCriterion("FLD_NM in", values, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmNotIn(List<String> values) {
            addCriterion("FLD_NM not in", values, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmBetween(String value1, String value2) {
            addCriterion("FLD_NM between", value1, value2, "fldNm");
            return (Criteria) this;
        }

        public Criteria andFldNmNotBetween(String value1, String value2) {
            addCriterion("FLD_NM not between", value1, value2, "fldNm");
            return (Criteria) this;
        }

        public Criteria andStartPosIsNull() {
            addCriterion("START_POS is null");
            return (Criteria) this;
        }

        public Criteria andStartPosIsNotNull() {
            addCriterion("START_POS is not null");
            return (Criteria) this;
        }

        public Criteria andStartPosEqualTo(Integer value) {
            addCriterion("START_POS =", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosNotEqualTo(Integer value) {
            addCriterion("START_POS <>", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosGreaterThan(Integer value) {
            addCriterion("START_POS >", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosGreaterThanOrEqualTo(Integer value) {
            addCriterion("START_POS >=", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosLessThan(Integer value) {
            addCriterion("START_POS <", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosLessThanOrEqualTo(Integer value) {
            addCriterion("START_POS <=", value, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosIn(List<Integer> values) {
            addCriterion("START_POS in", values, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosNotIn(List<Integer> values) {
            addCriterion("START_POS not in", values, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosBetween(Integer value1, Integer value2) {
            addCriterion("START_POS between", value1, value2, "startPos");
            return (Criteria) this;
        }

        public Criteria andStartPosNotBetween(Integer value1, Integer value2) {
            addCriterion("START_POS not between", value1, value2, "startPos");
            return (Criteria) this;
        }

        public Criteria andEndPosIsNull() {
            addCriterion("END_POS is null");
            return (Criteria) this;
        }

        public Criteria andEndPosIsNotNull() {
            addCriterion("END_POS is not null");
            return (Criteria) this;
        }

        public Criteria andEndPosEqualTo(Integer value) {
            addCriterion("END_POS =", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosNotEqualTo(Integer value) {
            addCriterion("END_POS <>", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosGreaterThan(Integer value) {
            addCriterion("END_POS >", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosGreaterThanOrEqualTo(Integer value) {
            addCriterion("END_POS >=", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosLessThan(Integer value) {
            addCriterion("END_POS <", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosLessThanOrEqualTo(Integer value) {
            addCriterion("END_POS <=", value, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosIn(List<Integer> values) {
            addCriterion("END_POS in", values, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosNotIn(List<Integer> values) {
            addCriterion("END_POS not in", values, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosBetween(Integer value1, Integer value2) {
            addCriterion("END_POS between", value1, value2, "endPos");
            return (Criteria) this;
        }

        public Criteria andEndPosNotBetween(Integer value1, Integer value2) {
            addCriterion("END_POS not between", value1, value2, "endPos");
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