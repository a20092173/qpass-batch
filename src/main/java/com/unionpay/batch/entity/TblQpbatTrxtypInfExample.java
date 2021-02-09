package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatTrxtypInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatTrxtypInfExample() {
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

        public Criteria andTrxtypCdIsNull() {
            addCriterion("TRXTYP_CD is null");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdIsNotNull() {
            addCriterion("TRXTYP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdEqualTo(String value) {
            addCriterion("TRXTYP_CD =", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdNotEqualTo(String value) {
            addCriterion("TRXTYP_CD <>", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdGreaterThan(String value) {
            addCriterion("TRXTYP_CD >", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdGreaterThanOrEqualTo(String value) {
            addCriterion("TRXTYP_CD >=", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdLessThan(String value) {
            addCriterion("TRXTYP_CD <", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdLessThanOrEqualTo(String value) {
            addCriterion("TRXTYP_CD <=", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdLike(String value) {
            addCriterion("TRXTYP_CD like", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdNotLike(String value) {
            addCriterion("TRXTYP_CD not like", value, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdIn(List<String> values) {
            addCriterion("TRXTYP_CD in", values, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdNotIn(List<String> values) {
            addCriterion("TRXTYP_CD not in", values, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdBetween(String value1, String value2) {
            addCriterion("TRXTYP_CD between", value1, value2, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andTrxtypCdNotBetween(String value1, String value2) {
            addCriterion("TRXTYP_CD not between", value1, value2, "trxtypCd");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdIsNull() {
            addCriterion("BIZ_FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdIsNotNull() {
            addCriterion("BIZ_FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdEqualTo(String value) {
            addCriterion("BIZ_FUNC_ID =", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdNotEqualTo(String value) {
            addCriterion("BIZ_FUNC_ID <>", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdGreaterThan(String value) {
            addCriterion("BIZ_FUNC_ID >", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_FUNC_ID >=", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdLessThan(String value) {
            addCriterion("BIZ_FUNC_ID <", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdLessThanOrEqualTo(String value) {
            addCriterion("BIZ_FUNC_ID <=", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdLike(String value) {
            addCriterion("BIZ_FUNC_ID like", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdNotLike(String value) {
            addCriterion("BIZ_FUNC_ID not like", value, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdIn(List<String> values) {
            addCriterion("BIZ_FUNC_ID in", values, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdNotIn(List<String> values) {
            addCriterion("BIZ_FUNC_ID not in", values, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdBetween(String value1, String value2) {
            addCriterion("BIZ_FUNC_ID between", value1, value2, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andBizFuncIdNotBetween(String value1, String value2) {
            addCriterion("BIZ_FUNC_ID not between", value1, value2, "bizFuncId");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmIsNull() {
            addCriterion("TRXTYP_NM is null");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmIsNotNull() {
            addCriterion("TRXTYP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmEqualTo(String value) {
            addCriterion("TRXTYP_NM =", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmNotEqualTo(String value) {
            addCriterion("TRXTYP_NM <>", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmGreaterThan(String value) {
            addCriterion("TRXTYP_NM >", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmGreaterThanOrEqualTo(String value) {
            addCriterion("TRXTYP_NM >=", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmLessThan(String value) {
            addCriterion("TRXTYP_NM <", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmLessThanOrEqualTo(String value) {
            addCriterion("TRXTYP_NM <=", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmLike(String value) {
            addCriterion("TRXTYP_NM like", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmNotLike(String value) {
            addCriterion("TRXTYP_NM not like", value, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmIn(List<String> values) {
            addCriterion("TRXTYP_NM in", values, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmNotIn(List<String> values) {
            addCriterion("TRXTYP_NM not in", values, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmBetween(String value1, String value2) {
            addCriterion("TRXTYP_NM between", value1, value2, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andTrxtypNmNotBetween(String value1, String value2) {
            addCriterion("TRXTYP_NM not between", value1, value2, "trxtypNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmIsNull() {
            addCriterion("BIZ_FUNC_NM is null");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmIsNotNull() {
            addCriterion("BIZ_FUNC_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmEqualTo(String value) {
            addCriterion("BIZ_FUNC_NM =", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmNotEqualTo(String value) {
            addCriterion("BIZ_FUNC_NM <>", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmGreaterThan(String value) {
            addCriterion("BIZ_FUNC_NM >", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_FUNC_NM >=", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmLessThan(String value) {
            addCriterion("BIZ_FUNC_NM <", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmLessThanOrEqualTo(String value) {
            addCriterion("BIZ_FUNC_NM <=", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmLike(String value) {
            addCriterion("BIZ_FUNC_NM like", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmNotLike(String value) {
            addCriterion("BIZ_FUNC_NM not like", value, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmIn(List<String> values) {
            addCriterion("BIZ_FUNC_NM in", values, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmNotIn(List<String> values) {
            addCriterion("BIZ_FUNC_NM not in", values, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmBetween(String value1, String value2) {
            addCriterion("BIZ_FUNC_NM between", value1, value2, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andBizFuncNmNotBetween(String value1, String value2) {
            addCriterion("BIZ_FUNC_NM not between", value1, value2, "bizFuncNm");
            return (Criteria) this;
        }

        public Criteria andRecnclStIsNull() {
            addCriterion("RECNCL_ST is null");
            return (Criteria) this;
        }

        public Criteria andRecnclStIsNotNull() {
            addCriterion("RECNCL_ST is not null");
            return (Criteria) this;
        }

        public Criteria andRecnclStEqualTo(String value) {
            addCriterion("RECNCL_ST =", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStNotEqualTo(String value) {
            addCriterion("RECNCL_ST <>", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStGreaterThan(String value) {
            addCriterion("RECNCL_ST >", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStGreaterThanOrEqualTo(String value) {
            addCriterion("RECNCL_ST >=", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStLessThan(String value) {
            addCriterion("RECNCL_ST <", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStLessThanOrEqualTo(String value) {
            addCriterion("RECNCL_ST <=", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStLike(String value) {
            addCriterion("RECNCL_ST like", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStNotLike(String value) {
            addCriterion("RECNCL_ST not like", value, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStIn(List<String> values) {
            addCriterion("RECNCL_ST in", values, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStNotIn(List<String> values) {
            addCriterion("RECNCL_ST not in", values, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStBetween(String value1, String value2) {
            addCriterion("RECNCL_ST between", value1, value2, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andRecnclStNotBetween(String value1, String value2) {
            addCriterion("RECNCL_ST not between", value1, value2, "recnclSt");
            return (Criteria) this;
        }

        public Criteria andSettleStIsNull() {
            addCriterion("SETTLE_ST is null");
            return (Criteria) this;
        }

        public Criteria andSettleStIsNotNull() {
            addCriterion("SETTLE_ST is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStEqualTo(String value) {
            addCriterion("SETTLE_ST =", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStNotEqualTo(String value) {
            addCriterion("SETTLE_ST <>", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStGreaterThan(String value) {
            addCriterion("SETTLE_ST >", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_ST >=", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStLessThan(String value) {
            addCriterion("SETTLE_ST <", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_ST <=", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStLike(String value) {
            addCriterion("SETTLE_ST like", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStNotLike(String value) {
            addCriterion("SETTLE_ST not like", value, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStIn(List<String> values) {
            addCriterion("SETTLE_ST in", values, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStNotIn(List<String> values) {
            addCriterion("SETTLE_ST not in", values, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStBetween(String value1, String value2) {
            addCriterion("SETTLE_ST between", value1, value2, "settleSt");
            return (Criteria) this;
        }

        public Criteria andSettleStNotBetween(String value1, String value2) {
            addCriterion("SETTLE_ST not between", value1, value2, "settleSt");
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