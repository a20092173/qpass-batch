package com.unionpay.batch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblQpbatBatTaskStExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblQpbatBatTaskStExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIsNull() {
            addCriterion("TASK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIsNotNull() {
            addCriterion("TASK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqEqualTo(String value) {
            addCriterion("TASK_SEQ =", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotEqualTo(String value) {
            addCriterion("TASK_SEQ <>", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqGreaterThan(String value) {
            addCriterion("TASK_SEQ >", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SEQ >=", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqLessThan(String value) {
            addCriterion("TASK_SEQ <", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqLessThanOrEqualTo(String value) {
            addCriterion("TASK_SEQ <=", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqLike(String value) {
            addCriterion("TASK_SEQ like", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotLike(String value) {
            addCriterion("TASK_SEQ not like", value, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqIn(List<String> values) {
            addCriterion("TASK_SEQ in", values, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotIn(List<String> values) {
            addCriterion("TASK_SEQ not in", values, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqBetween(String value1, String value2) {
            addCriterion("TASK_SEQ between", value1, value2, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNotBetween(String value1, String value2) {
            addCriterion("TASK_SEQ not between", value1, value2, "taskSeq");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNull() {
            addCriterion("TRANS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNotNull() {
            addCriterion("TRANS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransCodeEqualTo(String value) {
            addCriterion("TRANS_CODE =", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotEqualTo(String value) {
            addCriterion("TRANS_CODE <>", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThan(String value) {
            addCriterion("TRANS_CODE >", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CODE >=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThan(String value) {
            addCriterion("TRANS_CODE <", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CODE <=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLike(String value) {
            addCriterion("TRANS_CODE like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotLike(String value) {
            addCriterion("TRANS_CODE not like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeIn(List<String> values) {
            addCriterion("TRANS_CODE in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotIn(List<String> values) {
            addCriterion("TRANS_CODE not in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeBetween(String value1, String value2) {
            addCriterion("TRANS_CODE between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotBetween(String value1, String value2) {
            addCriterion("TRANS_CODE not between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTaskNmIsNull() {
            addCriterion("TASK_NM is null");
            return (Criteria) this;
        }

        public Criteria andTaskNmIsNotNull() {
            addCriterion("TASK_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNmEqualTo(String value) {
            addCriterion("TASK_NM =", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmNotEqualTo(String value) {
            addCriterion("TASK_NM <>", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmGreaterThan(String value) {
            addCriterion("TASK_NM >", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NM >=", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmLessThan(String value) {
            addCriterion("TASK_NM <", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmLessThanOrEqualTo(String value) {
            addCriterion("TASK_NM <=", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmLike(String value) {
            addCriterion("TASK_NM like", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmNotLike(String value) {
            addCriterion("TASK_NM not like", value, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmIn(List<String> values) {
            addCriterion("TASK_NM in", values, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmNotIn(List<String> values) {
            addCriterion("TASK_NM not in", values, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmBetween(String value1, String value2) {
            addCriterion("TASK_NM between", value1, value2, "taskNm");
            return (Criteria) this;
        }

        public Criteria andTaskNmNotBetween(String value1, String value2) {
            addCriterion("TASK_NM not between", value1, value2, "taskNm");
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

        public Criteria andTaskDtIsNull() {
            addCriterion("TASK_DT is null");
            return (Criteria) this;
        }

        public Criteria andTaskDtIsNotNull() {
            addCriterion("TASK_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDtEqualTo(String value) {
            addCriterion("TASK_DT =", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtNotEqualTo(String value) {
            addCriterion("TASK_DT <>", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtGreaterThan(String value) {
            addCriterion("TASK_DT >", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DT >=", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtLessThan(String value) {
            addCriterion("TASK_DT <", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtLessThanOrEqualTo(String value) {
            addCriterion("TASK_DT <=", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtLike(String value) {
            addCriterion("TASK_DT like", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtNotLike(String value) {
            addCriterion("TASK_DT not like", value, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtIn(List<String> values) {
            addCriterion("TASK_DT in", values, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtNotIn(List<String> values) {
            addCriterion("TASK_DT not in", values, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtBetween(String value1, String value2) {
            addCriterion("TASK_DT between", value1, value2, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskDtNotBetween(String value1, String value2) {
            addCriterion("TASK_DT not between", value1, value2, "taskDt");
            return (Criteria) this;
        }

        public Criteria andTaskTmIsNull() {
            addCriterion("TASK_TM is null");
            return (Criteria) this;
        }

        public Criteria andTaskTmIsNotNull() {
            addCriterion("TASK_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTmEqualTo(String value) {
            addCriterion("TASK_TM =", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmNotEqualTo(String value) {
            addCriterion("TASK_TM <>", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmGreaterThan(String value) {
            addCriterion("TASK_TM >", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TM >=", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmLessThan(String value) {
            addCriterion("TASK_TM <", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmLessThanOrEqualTo(String value) {
            addCriterion("TASK_TM <=", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmLike(String value) {
            addCriterion("TASK_TM like", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmNotLike(String value) {
            addCriterion("TASK_TM not like", value, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmIn(List<String> values) {
            addCriterion("TASK_TM in", values, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmNotIn(List<String> values) {
            addCriterion("TASK_TM not in", values, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmBetween(String value1, String value2) {
            addCriterion("TASK_TM between", value1, value2, "taskTm");
            return (Criteria) this;
        }

        public Criteria andTaskTmNotBetween(String value1, String value2) {
            addCriterion("TASK_TM not between", value1, value2, "taskTm");
            return (Criteria) this;
        }

        public Criteria andProcStIsNull() {
            addCriterion("PROC_ST is null");
            return (Criteria) this;
        }

        public Criteria andProcStIsNotNull() {
            addCriterion("PROC_ST is not null");
            return (Criteria) this;
        }

        public Criteria andProcStEqualTo(String value) {
            addCriterion("PROC_ST =", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStNotEqualTo(String value) {
            addCriterion("PROC_ST <>", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStGreaterThan(String value) {
            addCriterion("PROC_ST >", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_ST >=", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStLessThan(String value) {
            addCriterion("PROC_ST <", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStLessThanOrEqualTo(String value) {
            addCriterion("PROC_ST <=", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStLike(String value) {
            addCriterion("PROC_ST like", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStNotLike(String value) {
            addCriterion("PROC_ST not like", value, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStIn(List<String> values) {
            addCriterion("PROC_ST in", values, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStNotIn(List<String> values) {
            addCriterion("PROC_ST not in", values, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStBetween(String value1, String value2) {
            addCriterion("PROC_ST between", value1, value2, "procSt");
            return (Criteria) this;
        }

        public Criteria andProcStNotBetween(String value1, String value2) {
            addCriterion("PROC_ST not between", value1, value2, "procSt");
            return (Criteria) this;
        }

        public Criteria andRedoStIsNull() {
            addCriterion("REDO_ST is null");
            return (Criteria) this;
        }

        public Criteria andRedoStIsNotNull() {
            addCriterion("REDO_ST is not null");
            return (Criteria) this;
        }

        public Criteria andRedoStEqualTo(String value) {
            addCriterion("REDO_ST =", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStNotEqualTo(String value) {
            addCriterion("REDO_ST <>", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStGreaterThan(String value) {
            addCriterion("REDO_ST >", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStGreaterThanOrEqualTo(String value) {
            addCriterion("REDO_ST >=", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStLessThan(String value) {
            addCriterion("REDO_ST <", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStLessThanOrEqualTo(String value) {
            addCriterion("REDO_ST <=", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStLike(String value) {
            addCriterion("REDO_ST like", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStNotLike(String value) {
            addCriterion("REDO_ST not like", value, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStIn(List<String> values) {
            addCriterion("REDO_ST in", values, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStNotIn(List<String> values) {
            addCriterion("REDO_ST not in", values, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStBetween(String value1, String value2) {
            addCriterion("REDO_ST between", value1, value2, "redoSt");
            return (Criteria) this;
        }

        public Criteria andRedoStNotBetween(String value1, String value2) {
            addCriterion("REDO_ST not between", value1, value2, "redoSt");
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