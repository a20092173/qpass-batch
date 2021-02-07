package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatRecnclFailedCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatRecnclFailedCommonExample() {
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

        public Criteria andRecnclDtIsNull() {
            addCriterion("RECNCL_DT is null");
            return (Criteria) this;
        }

        public Criteria andRecnclDtIsNotNull() {
            addCriterion("RECNCL_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRecnclDtEqualTo(String value) {
            addCriterion("RECNCL_DT =", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtNotEqualTo(String value) {
            addCriterion("RECNCL_DT <>", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtGreaterThan(String value) {
            addCriterion("RECNCL_DT >", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtGreaterThanOrEqualTo(String value) {
            addCriterion("RECNCL_DT >=", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtLessThan(String value) {
            addCriterion("RECNCL_DT <", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtLessThanOrEqualTo(String value) {
            addCriterion("RECNCL_DT <=", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtLike(String value) {
            addCriterion("RECNCL_DT like", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtNotLike(String value) {
            addCriterion("RECNCL_DT not like", value, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtIn(List<String> values) {
            addCriterion("RECNCL_DT in", values, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtNotIn(List<String> values) {
            addCriterion("RECNCL_DT not in", values, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtBetween(String value1, String value2) {
            addCriterion("RECNCL_DT between", value1, value2, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andRecnclDtNotBetween(String value1, String value2) {
            addCriterion("RECNCL_DT not between", value1, value2, "recnclDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtIsNull() {
            addCriterion("ACCT_DT is null");
            return (Criteria) this;
        }

        public Criteria andAcctDtIsNotNull() {
            addCriterion("ACCT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAcctDtEqualTo(String value) {
            addCriterion("ACCT_DT =", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtNotEqualTo(String value) {
            addCriterion("ACCT_DT <>", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtGreaterThan(String value) {
            addCriterion("ACCT_DT >", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_DT >=", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtLessThan(String value) {
            addCriterion("ACCT_DT <", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtLessThanOrEqualTo(String value) {
            addCriterion("ACCT_DT <=", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtLike(String value) {
            addCriterion("ACCT_DT like", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtNotLike(String value) {
            addCriterion("ACCT_DT not like", value, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtIn(List<String> values) {
            addCriterion("ACCT_DT in", values, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtNotIn(List<String> values) {
            addCriterion("ACCT_DT not in", values, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtBetween(String value1, String value2) {
            addCriterion("ACCT_DT between", value1, value2, "acctDt");
            return (Criteria) this;
        }

        public Criteria andAcctDtNotBetween(String value1, String value2) {
            addCriterion("ACCT_DT not between", value1, value2, "acctDt");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqIsNull() {
            addCriterion("PEER_TRANS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqIsNotNull() {
            addCriterion("PEER_TRANS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqEqualTo(String value) {
            addCriterion("PEER_TRANS_SEQ =", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqNotEqualTo(String value) {
            addCriterion("PEER_TRANS_SEQ <>", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqGreaterThan(String value) {
            addCriterion("PEER_TRANS_SEQ >", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PEER_TRANS_SEQ >=", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqLessThan(String value) {
            addCriterion("PEER_TRANS_SEQ <", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqLessThanOrEqualTo(String value) {
            addCriterion("PEER_TRANS_SEQ <=", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqLike(String value) {
            addCriterion("PEER_TRANS_SEQ like", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqNotLike(String value) {
            addCriterion("PEER_TRANS_SEQ not like", value, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqIn(List<String> values) {
            addCriterion("PEER_TRANS_SEQ in", values, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqNotIn(List<String> values) {
            addCriterion("PEER_TRANS_SEQ not in", values, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqBetween(String value1, String value2) {
            addCriterion("PEER_TRANS_SEQ between", value1, value2, "peerTransSeq");
            return (Criteria) this;
        }

        public Criteria andPeerTransSeqNotBetween(String value1, String value2) {
            addCriterion("PEER_TRANS_SEQ not between", value1, value2, "peerTransSeq");
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

        public Criteria andOutAcctNoIsNull() {
            addCriterion("OUT_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoIsNotNull() {
            addCriterion("OUT_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoEqualTo(String value) {
            addCriterion("OUT_ACCT_NO =", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoNotEqualTo(String value) {
            addCriterion("OUT_ACCT_NO <>", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoGreaterThan(String value) {
            addCriterion("OUT_ACCT_NO >", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_ACCT_NO >=", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoLessThan(String value) {
            addCriterion("OUT_ACCT_NO <", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_ACCT_NO <=", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoLike(String value) {
            addCriterion("OUT_ACCT_NO like", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoNotLike(String value) {
            addCriterion("OUT_ACCT_NO not like", value, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoIn(List<String> values) {
            addCriterion("OUT_ACCT_NO in", values, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoNotIn(List<String> values) {
            addCriterion("OUT_ACCT_NO not in", values, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoBetween(String value1, String value2) {
            addCriterion("OUT_ACCT_NO between", value1, value2, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andOutAcctNoNotBetween(String value1, String value2) {
            addCriterion("OUT_ACCT_NO not between", value1, value2, "outAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoIsNull() {
            addCriterion("IN_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andInAcctNoIsNotNull() {
            addCriterion("IN_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInAcctNoEqualTo(String value) {
            addCriterion("IN_ACCT_NO =", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoNotEqualTo(String value) {
            addCriterion("IN_ACCT_NO <>", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoGreaterThan(String value) {
            addCriterion("IN_ACCT_NO >", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ACCT_NO >=", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoLessThan(String value) {
            addCriterion("IN_ACCT_NO <", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoLessThanOrEqualTo(String value) {
            addCriterion("IN_ACCT_NO <=", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoLike(String value) {
            addCriterion("IN_ACCT_NO like", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoNotLike(String value) {
            addCriterion("IN_ACCT_NO not like", value, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoIn(List<String> values) {
            addCriterion("IN_ACCT_NO in", values, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoNotIn(List<String> values) {
            addCriterion("IN_ACCT_NO not in", values, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoBetween(String value1, String value2) {
            addCriterion("IN_ACCT_NO between", value1, value2, "inAcctNo");
            return (Criteria) this;
        }

        public Criteria andInAcctNoNotBetween(String value1, String value2) {
            addCriterion("IN_ACCT_NO not between", value1, value2, "inAcctNo");
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

        public Criteria andRecnclMsgIsNull() {
            addCriterion("RECNCL_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgIsNotNull() {
            addCriterion("RECNCL_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgEqualTo(String value) {
            addCriterion("RECNCL_MSG =", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgNotEqualTo(String value) {
            addCriterion("RECNCL_MSG <>", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgGreaterThan(String value) {
            addCriterion("RECNCL_MSG >", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RECNCL_MSG >=", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgLessThan(String value) {
            addCriterion("RECNCL_MSG <", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgLessThanOrEqualTo(String value) {
            addCriterion("RECNCL_MSG <=", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgLike(String value) {
            addCriterion("RECNCL_MSG like", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgNotLike(String value) {
            addCriterion("RECNCL_MSG not like", value, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgIn(List<String> values) {
            addCriterion("RECNCL_MSG in", values, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgNotIn(List<String> values) {
            addCriterion("RECNCL_MSG not in", values, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgBetween(String value1, String value2) {
            addCriterion("RECNCL_MSG between", value1, value2, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andRecnclMsgNotBetween(String value1, String value2) {
            addCriterion("RECNCL_MSG not between", value1, value2, "recnclMsg");
            return (Criteria) this;
        }

        public Criteria andOperInIsNull() {
            addCriterion("oper_in is null");
            return (Criteria) this;
        }

        public Criteria andOperInIsNotNull() {
            addCriterion("oper_in is not null");
            return (Criteria) this;
        }

        public Criteria andOperInEqualTo(String value) {
            addCriterion("oper_in =", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotEqualTo(String value) {
            addCriterion("oper_in <>", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThan(String value) {
            addCriterion("oper_in >", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThanOrEqualTo(String value) {
            addCriterion("oper_in >=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThan(String value) {
            addCriterion("oper_in <", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThanOrEqualTo(String value) {
            addCriterion("oper_in <=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLike(String value) {
            addCriterion("oper_in like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotLike(String value) {
            addCriterion("oper_in not like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInIn(List<String> values) {
            addCriterion("oper_in in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotIn(List<String> values) {
            addCriterion("oper_in not in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInBetween(String value1, String value2) {
            addCriterion("oper_in between", value1, value2, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotBetween(String value1, String value2) {
            addCriterion("oper_in not between", value1, value2, "operIn");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Integer value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Integer value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Integer value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Integer value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Integer> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Integer> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Integer value1, Integer value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIsNull() {
            addCriterion("rec_upd_usr_id is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIsNotNull() {
            addCriterion("rec_upd_usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdEqualTo(String value) {
            addCriterion("rec_upd_usr_id =", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotEqualTo(String value) {
            addCriterion("rec_upd_usr_id <>", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdGreaterThan(String value) {
            addCriterion("rec_upd_usr_id >", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_upd_usr_id >=", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLessThan(String value) {
            addCriterion("rec_upd_usr_id <", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLessThanOrEqualTo(String value) {
            addCriterion("rec_upd_usr_id <=", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdLike(String value) {
            addCriterion("rec_upd_usr_id like", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotLike(String value) {
            addCriterion("rec_upd_usr_id not like", value, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdIn(List<String> values) {
            addCriterion("rec_upd_usr_id in", values, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotIn(List<String> values) {
            addCriterion("rec_upd_usr_id not in", values, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdBetween(String value1, String value2) {
            addCriterion("rec_upd_usr_id between", value1, value2, "recUpdUsrId");
            return (Criteria) this;
        }

        public Criteria andRecUpdUsrIdNotBetween(String value1, String value2) {
            addCriterion("rec_upd_usr_id not between", value1, value2, "recUpdUsrId");
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