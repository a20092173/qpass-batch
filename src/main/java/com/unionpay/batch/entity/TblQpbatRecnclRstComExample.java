package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatRecnclRstComExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatRecnclRstComExample() {
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

        public Criteria andBussCdIsNull() {
            addCriterion("BUSS_CD is null");
            return (Criteria) this;
        }

        public Criteria andBussCdIsNotNull() {
            addCriterion("BUSS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBussCdEqualTo(String value) {
            addCriterion("BUSS_CD =", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdNotEqualTo(String value) {
            addCriterion("BUSS_CD <>", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdGreaterThan(String value) {
            addCriterion("BUSS_CD >", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSS_CD >=", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdLessThan(String value) {
            addCriterion("BUSS_CD <", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdLessThanOrEqualTo(String value) {
            addCriterion("BUSS_CD <=", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdLike(String value) {
            addCriterion("BUSS_CD like", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdNotLike(String value) {
            addCriterion("BUSS_CD not like", value, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdIn(List<String> values) {
            addCriterion("BUSS_CD in", values, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdNotIn(List<String> values) {
            addCriterion("BUSS_CD not in", values, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdBetween(String value1, String value2) {
            addCriterion("BUSS_CD between", value1, value2, "bussCd");
            return (Criteria) this;
        }

        public Criteria andBussCdNotBetween(String value1, String value2) {
            addCriterion("BUSS_CD not between", value1, value2, "bussCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdIsNull() {
            addCriterion("SND_INS_CD is null");
            return (Criteria) this;
        }

        public Criteria andSndInsCdIsNotNull() {
            addCriterion("SND_INS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSndInsCdEqualTo(String value) {
            addCriterion("SND_INS_CD =", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdNotEqualTo(String value) {
            addCriterion("SND_INS_CD <>", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdGreaterThan(String value) {
            addCriterion("SND_INS_CD >", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdGreaterThanOrEqualTo(String value) {
            addCriterion("SND_INS_CD >=", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdLessThan(String value) {
            addCriterion("SND_INS_CD <", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdLessThanOrEqualTo(String value) {
            addCriterion("SND_INS_CD <=", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdLike(String value) {
            addCriterion("SND_INS_CD like", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdNotLike(String value) {
            addCriterion("SND_INS_CD not like", value, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdIn(List<String> values) {
            addCriterion("SND_INS_CD in", values, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdNotIn(List<String> values) {
            addCriterion("SND_INS_CD not in", values, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdBetween(String value1, String value2) {
            addCriterion("SND_INS_CD between", value1, value2, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSndInsCdNotBetween(String value1, String value2) {
            addCriterion("SND_INS_CD not between", value1, value2, "sndInsCd");
            return (Criteria) this;
        }

        public Criteria andSettleDtIsNull() {
            addCriterion("SETTLE_DT is null");
            return (Criteria) this;
        }

        public Criteria andSettleDtIsNotNull() {
            addCriterion("SETTLE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDtEqualTo(String value) {
            addCriterion("SETTLE_DT =", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtNotEqualTo(String value) {
            addCriterion("SETTLE_DT <>", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtGreaterThan(String value) {
            addCriterion("SETTLE_DT >", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_DT >=", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtLessThan(String value) {
            addCriterion("SETTLE_DT <", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_DT <=", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtLike(String value) {
            addCriterion("SETTLE_DT like", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtNotLike(String value) {
            addCriterion("SETTLE_DT not like", value, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtIn(List<String> values) {
            addCriterion("SETTLE_DT in", values, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtNotIn(List<String> values) {
            addCriterion("SETTLE_DT not in", values, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtBetween(String value1, String value2) {
            addCriterion("SETTLE_DT between", value1, value2, "settleDt");
            return (Criteria) this;
        }

        public Criteria andSettleDtNotBetween(String value1, String value2) {
            addCriterion("SETTLE_DT not between", value1, value2, "settleDt");
            return (Criteria) this;
        }

        public Criteria andTransSeqIsNull() {
            addCriterion("TRANS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTransSeqIsNotNull() {
            addCriterion("TRANS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTransSeqEqualTo(String value) {
            addCriterion("TRANS_SEQ =", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqNotEqualTo(String value) {
            addCriterion("TRANS_SEQ <>", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqGreaterThan(String value) {
            addCriterion("TRANS_SEQ >", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_SEQ >=", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqLessThan(String value) {
            addCriterion("TRANS_SEQ <", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqLessThanOrEqualTo(String value) {
            addCriterion("TRANS_SEQ <=", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqLike(String value) {
            addCriterion("TRANS_SEQ like", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqNotLike(String value) {
            addCriterion("TRANS_SEQ not like", value, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqIn(List<String> values) {
            addCriterion("TRANS_SEQ in", values, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqNotIn(List<String> values) {
            addCriterion("TRANS_SEQ not in", values, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqBetween(String value1, String value2) {
            addCriterion("TRANS_SEQ between", value1, value2, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransSeqNotBetween(String value1, String value2) {
            addCriterion("TRANS_SEQ not between", value1, value2, "transSeq");
            return (Criteria) this;
        }

        public Criteria andTransTpIsNull() {
            addCriterion("TRANS_TP is null");
            return (Criteria) this;
        }

        public Criteria andTransTpIsNotNull() {
            addCriterion("TRANS_TP is not null");
            return (Criteria) this;
        }

        public Criteria andTransTpEqualTo(String value) {
            addCriterion("TRANS_TP =", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotEqualTo(String value) {
            addCriterion("TRANS_TP <>", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpGreaterThan(String value) {
            addCriterion("TRANS_TP >", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TP >=", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLessThan(String value) {
            addCriterion("TRANS_TP <", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TP <=", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLike(String value) {
            addCriterion("TRANS_TP like", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotLike(String value) {
            addCriterion("TRANS_TP not like", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpIn(List<String> values) {
            addCriterion("TRANS_TP in", values, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotIn(List<String> values) {
            addCriterion("TRANS_TP not in", values, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpBetween(String value1, String value2) {
            addCriterion("TRANS_TP between", value1, value2, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotBetween(String value1, String value2) {
            addCriterion("TRANS_TP not between", value1, value2, "transTp");
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

        public Criteria andOutActNoIsNull() {
            addCriterion("OUT_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutActNoIsNotNull() {
            addCriterion("OUT_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutActNoEqualTo(String value) {
            addCriterion("OUT_ACT_NO =", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoNotEqualTo(String value) {
            addCriterion("OUT_ACT_NO <>", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoGreaterThan(String value) {
            addCriterion("OUT_ACT_NO >", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_ACT_NO >=", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoLessThan(String value) {
            addCriterion("OUT_ACT_NO <", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_ACT_NO <=", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoLike(String value) {
            addCriterion("OUT_ACT_NO like", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoNotLike(String value) {
            addCriterion("OUT_ACT_NO not like", value, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoIn(List<String> values) {
            addCriterion("OUT_ACT_NO in", values, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoNotIn(List<String> values) {
            addCriterion("OUT_ACT_NO not in", values, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoBetween(String value1, String value2) {
            addCriterion("OUT_ACT_NO between", value1, value2, "outActNo");
            return (Criteria) this;
        }

        public Criteria andOutActNoNotBetween(String value1, String value2) {
            addCriterion("OUT_ACT_NO not between", value1, value2, "outActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoIsNull() {
            addCriterion("IN_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andInActNoIsNotNull() {
            addCriterion("IN_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInActNoEqualTo(String value) {
            addCriterion("IN_ACT_NO =", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoNotEqualTo(String value) {
            addCriterion("IN_ACT_NO <>", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoGreaterThan(String value) {
            addCriterion("IN_ACT_NO >", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ACT_NO >=", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoLessThan(String value) {
            addCriterion("IN_ACT_NO <", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoLessThanOrEqualTo(String value) {
            addCriterion("IN_ACT_NO <=", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoLike(String value) {
            addCriterion("IN_ACT_NO like", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoNotLike(String value) {
            addCriterion("IN_ACT_NO not like", value, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoIn(List<String> values) {
            addCriterion("IN_ACT_NO in", values, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoNotIn(List<String> values) {
            addCriterion("IN_ACT_NO not in", values, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoBetween(String value1, String value2) {
            addCriterion("IN_ACT_NO between", value1, value2, "inActNo");
            return (Criteria) this;
        }

        public Criteria andInActNoNotBetween(String value1, String value2) {
            addCriterion("IN_ACT_NO not between", value1, value2, "inActNo");
            return (Criteria) this;
        }

        public Criteria andTransAtIsNull() {
            addCriterion("TRANS_AT is null");
            return (Criteria) this;
        }

        public Criteria andTransAtIsNotNull() {
            addCriterion("TRANS_AT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAtEqualTo(String value) {
            addCriterion("TRANS_AT =", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotEqualTo(String value) {
            addCriterion("TRANS_AT <>", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtGreaterThan(String value) {
            addCriterion("TRANS_AT >", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_AT >=", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtLessThan(String value) {
            addCriterion("TRANS_AT <", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtLessThanOrEqualTo(String value) {
            addCriterion("TRANS_AT <=", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtLike(String value) {
            addCriterion("TRANS_AT like", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotLike(String value) {
            addCriterion("TRANS_AT not like", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtIn(List<String> values) {
            addCriterion("TRANS_AT in", values, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotIn(List<String> values) {
            addCriterion("TRANS_AT not in", values, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtBetween(String value1, String value2) {
            addCriterion("TRANS_AT between", value1, value2, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotBetween(String value1, String value2) {
            addCriterion("TRANS_AT not between", value1, value2, "transAt");
            return (Criteria) this;
        }

        public Criteria andSettleNumIsNull() {
            addCriterion("SETTLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSettleNumIsNotNull() {
            addCriterion("SETTLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSettleNumEqualTo(String value) {
            addCriterion("SETTLE_NUM =", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotEqualTo(String value) {
            addCriterion("SETTLE_NUM <>", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumGreaterThan(String value) {
            addCriterion("SETTLE_NUM >", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_NUM >=", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLessThan(String value) {
            addCriterion("SETTLE_NUM <", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_NUM <=", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLike(String value) {
            addCriterion("SETTLE_NUM like", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotLike(String value) {
            addCriterion("SETTLE_NUM not like", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumIn(List<String> values) {
            addCriterion("SETTLE_NUM in", values, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotIn(List<String> values) {
            addCriterion("SETTLE_NUM not in", values, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumBetween(String value1, String value2) {
            addCriterion("SETTLE_NUM between", value1, value2, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotBetween(String value1, String value2) {
            addCriterion("SETTLE_NUM not between", value1, value2, "settleNum");
            return (Criteria) this;
        }

        public Criteria andTransDtIsNull() {
            addCriterion("TRANS_DT is null");
            return (Criteria) this;
        }

        public Criteria andTransDtIsNotNull() {
            addCriterion("TRANS_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTransDtEqualTo(String value) {
            addCriterion("TRANS_DT =", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotEqualTo(String value) {
            addCriterion("TRANS_DT <>", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtGreaterThan(String value) {
            addCriterion("TRANS_DT >", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DT >=", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLessThan(String value) {
            addCriterion("TRANS_DT <", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DT <=", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLike(String value) {
            addCriterion("TRANS_DT like", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotLike(String value) {
            addCriterion("TRANS_DT not like", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtIn(List<String> values) {
            addCriterion("TRANS_DT in", values, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotIn(List<String> values) {
            addCriterion("TRANS_DT not in", values, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtBetween(String value1, String value2) {
            addCriterion("TRANS_DT between", value1, value2, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotBetween(String value1, String value2) {
            addCriterion("TRANS_DT not between", value1, value2, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransTmIsNull() {
            addCriterion("TRANS_TM is null");
            return (Criteria) this;
        }

        public Criteria andTransTmIsNotNull() {
            addCriterion("TRANS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTransTmEqualTo(String value) {
            addCriterion("TRANS_TM =", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotEqualTo(String value) {
            addCriterion("TRANS_TM <>", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmGreaterThan(String value) {
            addCriterion("TRANS_TM >", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TM >=", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLessThan(String value) {
            addCriterion("TRANS_TM <", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TM <=", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLike(String value) {
            addCriterion("TRANS_TM like", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotLike(String value) {
            addCriterion("TRANS_TM not like", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmIn(List<String> values) {
            addCriterion("TRANS_TM in", values, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotIn(List<String> values) {
            addCriterion("TRANS_TM not in", values, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmBetween(String value1, String value2) {
            addCriterion("TRANS_TM between", value1, value2, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotBetween(String value1, String value2) {
            addCriterion("TRANS_TM not between", value1, value2, "transTm");
            return (Criteria) this;
        }

        public Criteria andIssAcqIsNull() {
            addCriterion("ISS_ACQ is null");
            return (Criteria) this;
        }

        public Criteria andIssAcqIsNotNull() {
            addCriterion("ISS_ACQ is not null");
            return (Criteria) this;
        }

        public Criteria andIssAcqEqualTo(String value) {
            addCriterion("ISS_ACQ =", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqNotEqualTo(String value) {
            addCriterion("ISS_ACQ <>", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqGreaterThan(String value) {
            addCriterion("ISS_ACQ >", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqGreaterThanOrEqualTo(String value) {
            addCriterion("ISS_ACQ >=", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqLessThan(String value) {
            addCriterion("ISS_ACQ <", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqLessThanOrEqualTo(String value) {
            addCriterion("ISS_ACQ <=", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqLike(String value) {
            addCriterion("ISS_ACQ like", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqNotLike(String value) {
            addCriterion("ISS_ACQ not like", value, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqIn(List<String> values) {
            addCriterion("ISS_ACQ in", values, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqNotIn(List<String> values) {
            addCriterion("ISS_ACQ not in", values, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqBetween(String value1, String value2) {
            addCriterion("ISS_ACQ between", value1, value2, "issAcq");
            return (Criteria) this;
        }

        public Criteria andIssAcqNotBetween(String value1, String value2) {
            addCriterion("ISS_ACQ not between", value1, value2, "issAcq");
            return (Criteria) this;
        }

        public Criteria andOperStIsNull() {
            addCriterion("OPER_ST is null");
            return (Criteria) this;
        }

        public Criteria andOperStIsNotNull() {
            addCriterion("OPER_ST is not null");
            return (Criteria) this;
        }

        public Criteria andOperStEqualTo(String value) {
            addCriterion("OPER_ST =", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStNotEqualTo(String value) {
            addCriterion("OPER_ST <>", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStGreaterThan(String value) {
            addCriterion("OPER_ST >", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_ST >=", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStLessThan(String value) {
            addCriterion("OPER_ST <", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStLessThanOrEqualTo(String value) {
            addCriterion("OPER_ST <=", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStLike(String value) {
            addCriterion("OPER_ST like", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStNotLike(String value) {
            addCriterion("OPER_ST not like", value, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStIn(List<String> values) {
            addCriterion("OPER_ST in", values, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStNotIn(List<String> values) {
            addCriterion("OPER_ST not in", values, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStBetween(String value1, String value2) {
            addCriterion("OPER_ST between", value1, value2, "operSt");
            return (Criteria) this;
        }

        public Criteria andOperStNotBetween(String value1, String value2) {
            addCriterion("OPER_ST not between", value1, value2, "operSt");
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

        public Criteria andBtpNoIsNull() {
            addCriterion("BTP_NO is null");
            return (Criteria) this;
        }

        public Criteria andBtpNoIsNotNull() {
            addCriterion("BTP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBtpNoEqualTo(String value) {
            addCriterion("BTP_NO =", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoNotEqualTo(String value) {
            addCriterion("BTP_NO <>", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoGreaterThan(String value) {
            addCriterion("BTP_NO >", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoGreaterThanOrEqualTo(String value) {
            addCriterion("BTP_NO >=", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoLessThan(String value) {
            addCriterion("BTP_NO <", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoLessThanOrEqualTo(String value) {
            addCriterion("BTP_NO <=", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoLike(String value) {
            addCriterion("BTP_NO like", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoNotLike(String value) {
            addCriterion("BTP_NO not like", value, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoIn(List<String> values) {
            addCriterion("BTP_NO in", values, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoNotIn(List<String> values) {
            addCriterion("BTP_NO not in", values, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoBetween(String value1, String value2) {
            addCriterion("BTP_NO between", value1, value2, "btpNo");
            return (Criteria) this;
        }

        public Criteria andBtpNoNotBetween(String value1, String value2) {
            addCriterion("BTP_NO not between", value1, value2, "btpNo");
            return (Criteria) this;
        }

        public Criteria andRstMsgIsNull() {
            addCriterion("RST_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRstMsgIsNotNull() {
            addCriterion("RST_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRstMsgEqualTo(String value) {
            addCriterion("RST_MSG =", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgNotEqualTo(String value) {
            addCriterion("RST_MSG <>", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgGreaterThan(String value) {
            addCriterion("RST_MSG >", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RST_MSG >=", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgLessThan(String value) {
            addCriterion("RST_MSG <", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgLessThanOrEqualTo(String value) {
            addCriterion("RST_MSG <=", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgLike(String value) {
            addCriterion("RST_MSG like", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgNotLike(String value) {
            addCriterion("RST_MSG not like", value, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgIn(List<String> values) {
            addCriterion("RST_MSG in", values, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgNotIn(List<String> values) {
            addCriterion("RST_MSG not in", values, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgBetween(String value1, String value2) {
            addCriterion("RST_MSG between", value1, value2, "rstMsg");
            return (Criteria) this;
        }

        public Criteria andRstMsgNotBetween(String value1, String value2) {
            addCriterion("RST_MSG not between", value1, value2, "rstMsg");
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