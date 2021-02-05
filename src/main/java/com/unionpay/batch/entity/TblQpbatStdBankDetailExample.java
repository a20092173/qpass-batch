package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatStdBankDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatStdBankDetailExample() {
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

        public Criteria andBankTransSeqIsNull() {
            addCriterion("BANK_TRANS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqIsNotNull() {
            addCriterion("BANK_TRANS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqEqualTo(String value) {
            addCriterion("BANK_TRANS_SEQ =", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqNotEqualTo(String value) {
            addCriterion("BANK_TRANS_SEQ <>", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqGreaterThan(String value) {
            addCriterion("BANK_TRANS_SEQ >", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TRANS_SEQ >=", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqLessThan(String value) {
            addCriterion("BANK_TRANS_SEQ <", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqLessThanOrEqualTo(String value) {
            addCriterion("BANK_TRANS_SEQ <=", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqLike(String value) {
            addCriterion("BANK_TRANS_SEQ like", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqNotLike(String value) {
            addCriterion("BANK_TRANS_SEQ not like", value, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqIn(List<String> values) {
            addCriterion("BANK_TRANS_SEQ in", values, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqNotIn(List<String> values) {
            addCriterion("BANK_TRANS_SEQ not in", values, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqBetween(String value1, String value2) {
            addCriterion("BANK_TRANS_SEQ between", value1, value2, "bankTransSeq");
            return (Criteria) this;
        }

        public Criteria andBankTransSeqNotBetween(String value1, String value2) {
            addCriterion("BANK_TRANS_SEQ not between", value1, value2, "bankTransSeq");
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

        public Criteria andBankTransAtIsNull() {
            addCriterion("BANK_TRANS_AT is null");
            return (Criteria) this;
        }

        public Criteria andBankTransAtIsNotNull() {
            addCriterion("BANK_TRANS_AT is not null");
            return (Criteria) this;
        }

        public Criteria andBankTransAtEqualTo(String value) {
            addCriterion("BANK_TRANS_AT =", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtNotEqualTo(String value) {
            addCriterion("BANK_TRANS_AT <>", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtGreaterThan(String value) {
            addCriterion("BANK_TRANS_AT >", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TRANS_AT >=", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtLessThan(String value) {
            addCriterion("BANK_TRANS_AT <", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtLessThanOrEqualTo(String value) {
            addCriterion("BANK_TRANS_AT <=", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtLike(String value) {
            addCriterion("BANK_TRANS_AT like", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtNotLike(String value) {
            addCriterion("BANK_TRANS_AT not like", value, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtIn(List<String> values) {
            addCriterion("BANK_TRANS_AT in", values, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtNotIn(List<String> values) {
            addCriterion("BANK_TRANS_AT not in", values, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtBetween(String value1, String value2) {
            addCriterion("BANK_TRANS_AT between", value1, value2, "bankTransAt");
            return (Criteria) this;
        }

        public Criteria andBankTransAtNotBetween(String value1, String value2) {
            addCriterion("BANK_TRANS_AT not between", value1, value2, "bankTransAt");
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

        public Criteria andSndrInsIdCdIsNull() {
            addCriterion("SNDR_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdIsNotNull() {
            addCriterion("SNDR_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdEqualTo(String value) {
            addCriterion("SNDR_INS_ID_CD =", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdNotEqualTo(String value) {
            addCriterion("SNDR_INS_ID_CD <>", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdGreaterThan(String value) {
            addCriterion("SNDR_INS_ID_CD >", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdGreaterThanOrEqualTo(String value) {
            addCriterion("SNDR_INS_ID_CD >=", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdLessThan(String value) {
            addCriterion("SNDR_INS_ID_CD <", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdLessThanOrEqualTo(String value) {
            addCriterion("SNDR_INS_ID_CD <=", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdLike(String value) {
            addCriterion("SNDR_INS_ID_CD like", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdNotLike(String value) {
            addCriterion("SNDR_INS_ID_CD not like", value, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdIn(List<String> values) {
            addCriterion("SNDR_INS_ID_CD in", values, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdNotIn(List<String> values) {
            addCriterion("SNDR_INS_ID_CD not in", values, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdBetween(String value1, String value2) {
            addCriterion("SNDR_INS_ID_CD between", value1, value2, "sndrInsIdCd");
            return (Criteria) this;
        }

        public Criteria andSndrInsIdCdNotBetween(String value1, String value2) {
            addCriterion("SNDR_INS_ID_CD not between", value1, value2, "sndrInsIdCd");
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

        public Criteria andLineBufIsNull() {
            addCriterion("LINE_BUF is null");
            return (Criteria) this;
        }

        public Criteria andLineBufIsNotNull() {
            addCriterion("LINE_BUF is not null");
            return (Criteria) this;
        }

        public Criteria andLineBufEqualTo(String value) {
            addCriterion("LINE_BUF =", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufNotEqualTo(String value) {
            addCriterion("LINE_BUF <>", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufGreaterThan(String value) {
            addCriterion("LINE_BUF >", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_BUF >=", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufLessThan(String value) {
            addCriterion("LINE_BUF <", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufLessThanOrEqualTo(String value) {
            addCriterion("LINE_BUF <=", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufLike(String value) {
            addCriterion("LINE_BUF like", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufNotLike(String value) {
            addCriterion("LINE_BUF not like", value, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufIn(List<String> values) {
            addCriterion("LINE_BUF in", values, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufNotIn(List<String> values) {
            addCriterion("LINE_BUF not in", values, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufBetween(String value1, String value2) {
            addCriterion("LINE_BUF between", value1, value2, "lineBuf");
            return (Criteria) this;
        }

        public Criteria andLineBufNotBetween(String value1, String value2) {
            addCriterion("LINE_BUF not between", value1, value2, "lineBuf");
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

        public Criteria andRecnclDescIsNull() {
            addCriterion("RECNCL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRecnclDescIsNotNull() {
            addCriterion("RECNCL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRecnclDescEqualTo(String value) {
            addCriterion("RECNCL_DESC =", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescNotEqualTo(String value) {
            addCriterion("RECNCL_DESC <>", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescGreaterThan(String value) {
            addCriterion("RECNCL_DESC >", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescGreaterThanOrEqualTo(String value) {
            addCriterion("RECNCL_DESC >=", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescLessThan(String value) {
            addCriterion("RECNCL_DESC <", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescLessThanOrEqualTo(String value) {
            addCriterion("RECNCL_DESC <=", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescLike(String value) {
            addCriterion("RECNCL_DESC like", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescNotLike(String value) {
            addCriterion("RECNCL_DESC not like", value, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescIn(List<String> values) {
            addCriterion("RECNCL_DESC in", values, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescNotIn(List<String> values) {
            addCriterion("RECNCL_DESC not in", values, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescBetween(String value1, String value2) {
            addCriterion("RECNCL_DESC between", value1, value2, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andRecnclDescNotBetween(String value1, String value2) {
            addCriterion("RECNCL_DESC not between", value1, value2, "recnclDesc");
            return (Criteria) this;
        }

        public Criteria andOperInIsNull() {
            addCriterion("OPER_IN is null");
            return (Criteria) this;
        }

        public Criteria andOperInIsNotNull() {
            addCriterion("OPER_IN is not null");
            return (Criteria) this;
        }

        public Criteria andOperInEqualTo(String value) {
            addCriterion("OPER_IN =", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotEqualTo(String value) {
            addCriterion("OPER_IN <>", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThan(String value) {
            addCriterion("OPER_IN >", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_IN >=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThan(String value) {
            addCriterion("OPER_IN <", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThanOrEqualTo(String value) {
            addCriterion("OPER_IN <=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLike(String value) {
            addCriterion("OPER_IN like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotLike(String value) {
            addCriterion("OPER_IN not like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInIn(List<String> values) {
            addCriterion("OPER_IN in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotIn(List<String> values) {
            addCriterion("OPER_IN not in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInBetween(String value1, String value2) {
            addCriterion("OPER_IN between", value1, value2, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotBetween(String value1, String value2) {
            addCriterion("OPER_IN not between", value1, value2, "operIn");
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