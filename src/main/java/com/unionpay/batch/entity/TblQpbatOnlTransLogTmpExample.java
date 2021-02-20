package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatOnlTransLogTmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatOnlTransLogTmpExample() {
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

        public Criteria andFwdInsIdCdIsNull() {
            addCriterion("FWD_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdIsNotNull() {
            addCriterion("FWD_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdEqualTo(String value) {
            addCriterion("FWD_INS_ID_CD =", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdNotEqualTo(String value) {
            addCriterion("FWD_INS_ID_CD <>", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdGreaterThan(String value) {
            addCriterion("FWD_INS_ID_CD >", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdGreaterThanOrEqualTo(String value) {
            addCriterion("FWD_INS_ID_CD >=", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdLessThan(String value) {
            addCriterion("FWD_INS_ID_CD <", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdLessThanOrEqualTo(String value) {
            addCriterion("FWD_INS_ID_CD <=", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdLike(String value) {
            addCriterion("FWD_INS_ID_CD like", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdNotLike(String value) {
            addCriterion("FWD_INS_ID_CD not like", value, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdIn(List<String> values) {
            addCriterion("FWD_INS_ID_CD in", values, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdNotIn(List<String> values) {
            addCriterion("FWD_INS_ID_CD not in", values, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdBetween(String value1, String value2) {
            addCriterion("FWD_INS_ID_CD between", value1, value2, "fwdInsIdCd");
            return (Criteria) this;
        }

        public Criteria andFwdInsIdCdNotBetween(String value1, String value2) {
            addCriterion("FWD_INS_ID_CD not between", value1, value2, "fwdInsIdCd");
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

        public Criteria andQpTransSeqIsNull() {
            addCriterion("QP_TRANS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqIsNotNull() {
            addCriterion("QP_TRANS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqEqualTo(Long value) {
            addCriterion("QP_TRANS_SEQ =", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqNotEqualTo(Long value) {
            addCriterion("QP_TRANS_SEQ <>", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqGreaterThan(Long value) {
            addCriterion("QP_TRANS_SEQ >", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("QP_TRANS_SEQ >=", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqLessThan(Long value) {
            addCriterion("QP_TRANS_SEQ <", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqLessThanOrEqualTo(Long value) {
            addCriterion("QP_TRANS_SEQ <=", value, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqIn(List<Long> values) {
            addCriterion("QP_TRANS_SEQ in", values, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqNotIn(List<Long> values) {
            addCriterion("QP_TRANS_SEQ not in", values, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqBetween(Long value1, Long value2) {
            addCriterion("QP_TRANS_SEQ between", value1, value2, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransSeqNotBetween(Long value1, Long value2) {
            addCriterion("QP_TRANS_SEQ not between", value1, value2, "qpTransSeq");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmIsNull() {
            addCriterion("QP_TRANS_DT_TM is null");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmIsNotNull() {
            addCriterion("QP_TRANS_DT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmEqualTo(String value) {
            addCriterion("QP_TRANS_DT_TM =", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmNotEqualTo(String value) {
            addCriterion("QP_TRANS_DT_TM <>", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmGreaterThan(String value) {
            addCriterion("QP_TRANS_DT_TM >", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmGreaterThanOrEqualTo(String value) {
            addCriterion("QP_TRANS_DT_TM >=", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmLessThan(String value) {
            addCriterion("QP_TRANS_DT_TM <", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmLessThanOrEqualTo(String value) {
            addCriterion("QP_TRANS_DT_TM <=", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmLike(String value) {
            addCriterion("QP_TRANS_DT_TM like", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmNotLike(String value) {
            addCriterion("QP_TRANS_DT_TM not like", value, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmIn(List<String> values) {
            addCriterion("QP_TRANS_DT_TM in", values, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmNotIn(List<String> values) {
            addCriterion("QP_TRANS_DT_TM not in", values, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmBetween(String value1, String value2) {
            addCriterion("QP_TRANS_DT_TM between", value1, value2, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andQpTransDtTmNotBetween(String value1, String value2) {
            addCriterion("QP_TRANS_DT_TM not between", value1, value2, "qpTransDtTm");
            return (Criteria) this;
        }

        public Criteria andTransDetCdIsNull() {
            addCriterion("TRANS_DET_CD is null");
            return (Criteria) this;
        }

        public Criteria andTransDetCdIsNotNull() {
            addCriterion("TRANS_DET_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTransDetCdEqualTo(String value) {
            addCriterion("TRANS_DET_CD =", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdNotEqualTo(String value) {
            addCriterion("TRANS_DET_CD <>", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdGreaterThan(String value) {
            addCriterion("TRANS_DET_CD >", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DET_CD >=", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdLessThan(String value) {
            addCriterion("TRANS_DET_CD <", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DET_CD <=", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdLike(String value) {
            addCriterion("TRANS_DET_CD like", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdNotLike(String value) {
            addCriterion("TRANS_DET_CD not like", value, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdIn(List<String> values) {
            addCriterion("TRANS_DET_CD in", values, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdNotIn(List<String> values) {
            addCriterion("TRANS_DET_CD not in", values, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdBetween(String value1, String value2) {
            addCriterion("TRANS_DET_CD between", value1, value2, "transDetCd");
            return (Criteria) this;
        }

        public Criteria andTransDetCdNotBetween(String value1, String value2) {
            addCriterion("TRANS_DET_CD not between", value1, value2, "transDetCd");
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

        public Criteria andSettleDtTmIsNull() {
            addCriterion("SETTLE_DT_TM is null");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmIsNotNull() {
            addCriterion("SETTLE_DT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmEqualTo(String value) {
            addCriterion("SETTLE_DT_TM =", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmNotEqualTo(String value) {
            addCriterion("SETTLE_DT_TM <>", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmGreaterThan(String value) {
            addCriterion("SETTLE_DT_TM >", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_DT_TM >=", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmLessThan(String value) {
            addCriterion("SETTLE_DT_TM <", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_DT_TM <=", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmLike(String value) {
            addCriterion("SETTLE_DT_TM like", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmNotLike(String value) {
            addCriterion("SETTLE_DT_TM not like", value, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmIn(List<String> values) {
            addCriterion("SETTLE_DT_TM in", values, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmNotIn(List<String> values) {
            addCriterion("SETTLE_DT_TM not in", values, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmBetween(String value1, String value2) {
            addCriterion("SETTLE_DT_TM between", value1, value2, "settleDtTm");
            return (Criteria) this;
        }

        public Criteria andSettleDtTmNotBetween(String value1, String value2) {
            addCriterion("SETTLE_DT_TM not between", value1, value2, "settleDtTm");
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

        public Criteria andRcvAcctNoIsNull() {
            addCriterion("RCV_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoIsNotNull() {
            addCriterion("RCV_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoEqualTo(String value) {
            addCriterion("RCV_ACCT_NO =", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoNotEqualTo(String value) {
            addCriterion("RCV_ACCT_NO <>", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoGreaterThan(String value) {
            addCriterion("RCV_ACCT_NO >", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("RCV_ACCT_NO >=", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoLessThan(String value) {
            addCriterion("RCV_ACCT_NO <", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoLessThanOrEqualTo(String value) {
            addCriterion("RCV_ACCT_NO <=", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoLike(String value) {
            addCriterion("RCV_ACCT_NO like", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoNotLike(String value) {
            addCriterion("RCV_ACCT_NO not like", value, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoIn(List<String> values) {
            addCriterion("RCV_ACCT_NO in", values, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoNotIn(List<String> values) {
            addCriterion("RCV_ACCT_NO not in", values, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoBetween(String value1, String value2) {
            addCriterion("RCV_ACCT_NO between", value1, value2, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andRcvAcctNoNotBetween(String value1, String value2) {
            addCriterion("RCV_ACCT_NO not between", value1, value2, "rcvAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoIsNull() {
            addCriterion("SND_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoIsNotNull() {
            addCriterion("SND_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoEqualTo(String value) {
            addCriterion("SND_ACCT_NO =", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoNotEqualTo(String value) {
            addCriterion("SND_ACCT_NO <>", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoGreaterThan(String value) {
            addCriterion("SND_ACCT_NO >", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("SND_ACCT_NO >=", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoLessThan(String value) {
            addCriterion("SND_ACCT_NO <", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoLessThanOrEqualTo(String value) {
            addCriterion("SND_ACCT_NO <=", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoLike(String value) {
            addCriterion("SND_ACCT_NO like", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoNotLike(String value) {
            addCriterion("SND_ACCT_NO not like", value, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoIn(List<String> values) {
            addCriterion("SND_ACCT_NO in", values, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoNotIn(List<String> values) {
            addCriterion("SND_ACCT_NO not in", values, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoBetween(String value1, String value2) {
            addCriterion("SND_ACCT_NO between", value1, value2, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSndAcctNoNotBetween(String value1, String value2) {
            addCriterion("SND_ACCT_NO not between", value1, value2, "sndAcctNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoIsNull() {
            addCriterion("SGN_NO is null");
            return (Criteria) this;
        }

        public Criteria andSgnNoIsNotNull() {
            addCriterion("SGN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSgnNoEqualTo(String value) {
            addCriterion("SGN_NO =", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoNotEqualTo(String value) {
            addCriterion("SGN_NO <>", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoGreaterThan(String value) {
            addCriterion("SGN_NO >", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoGreaterThanOrEqualTo(String value) {
            addCriterion("SGN_NO >=", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoLessThan(String value) {
            addCriterion("SGN_NO <", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoLessThanOrEqualTo(String value) {
            addCriterion("SGN_NO <=", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoLike(String value) {
            addCriterion("SGN_NO like", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoNotLike(String value) {
            addCriterion("SGN_NO not like", value, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoIn(List<String> values) {
            addCriterion("SGN_NO in", values, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoNotIn(List<String> values) {
            addCriterion("SGN_NO not in", values, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoBetween(String value1, String value2) {
            addCriterion("SGN_NO between", value1, value2, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andSgnNoNotBetween(String value1, String value2) {
            addCriterion("SGN_NO not between", value1, value2, "sgnNo");
            return (Criteria) this;
        }

        public Criteria andTransStIsNull() {
            addCriterion("TRANS_ST is null");
            return (Criteria) this;
        }

        public Criteria andTransStIsNotNull() {
            addCriterion("TRANS_ST is not null");
            return (Criteria) this;
        }

        public Criteria andTransStEqualTo(String value) {
            addCriterion("TRANS_ST =", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotEqualTo(String value) {
            addCriterion("TRANS_ST <>", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThan(String value) {
            addCriterion("TRANS_ST >", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ST >=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThan(String value) {
            addCriterion("TRANS_ST <", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ST <=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLike(String value) {
            addCriterion("TRANS_ST like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotLike(String value) {
            addCriterion("TRANS_ST not like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStIn(List<String> values) {
            addCriterion("TRANS_ST in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotIn(List<String> values) {
            addCriterion("TRANS_ST not in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStBetween(String value1, String value2) {
            addCriterion("TRANS_ST between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotBetween(String value1, String value2) {
            addCriterion("TRANS_ST not between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqIsNull() {
            addCriterion("BANK_MAIN_TRANS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqIsNotNull() {
            addCriterion("BANK_MAIN_TRANS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqEqualTo(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ =", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqNotEqualTo(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ <>", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqGreaterThan(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ >", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ >=", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqLessThan(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ <", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqLessThanOrEqualTo(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ <=", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqLike(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ like", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqNotLike(String value) {
            addCriterion("BANK_MAIN_TRANS_SEQ not like", value, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqIn(List<String> values) {
            addCriterion("BANK_MAIN_TRANS_SEQ in", values, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqNotIn(List<String> values) {
            addCriterion("BANK_MAIN_TRANS_SEQ not in", values, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqBetween(String value1, String value2) {
            addCriterion("BANK_MAIN_TRANS_SEQ between", value1, value2, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankMainTransSeqNotBetween(String value1, String value2) {
            addCriterion("BANK_MAIN_TRANS_SEQ not between", value1, value2, "bankMainTransSeq");
            return (Criteria) this;
        }

        public Criteria andRsvFldIsNull() {
            addCriterion("RSV_FLD is null");
            return (Criteria) this;
        }

        public Criteria andRsvFldIsNotNull() {
            addCriterion("RSV_FLD is not null");
            return (Criteria) this;
        }

        public Criteria andRsvFldEqualTo(String value) {
            addCriterion("RSV_FLD =", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldNotEqualTo(String value) {
            addCriterion("RSV_FLD <>", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldGreaterThan(String value) {
            addCriterion("RSV_FLD >", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_FLD >=", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldLessThan(String value) {
            addCriterion("RSV_FLD <", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldLessThanOrEqualTo(String value) {
            addCriterion("RSV_FLD <=", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldLike(String value) {
            addCriterion("RSV_FLD like", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldNotLike(String value) {
            addCriterion("RSV_FLD not like", value, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldIn(List<String> values) {
            addCriterion("RSV_FLD in", values, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldNotIn(List<String> values) {
            addCriterion("RSV_FLD not in", values, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldBetween(String value1, String value2) {
            addCriterion("RSV_FLD between", value1, value2, "rsvFld");
            return (Criteria) this;
        }

        public Criteria andRsvFldNotBetween(String value1, String value2) {
            addCriterion("RSV_FLD not between", value1, value2, "rsvFld");
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