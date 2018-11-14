package cn.pwol.pwolbackgroundprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupportinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupportinfoExample() {
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

        public Criteria andSupportidIsNull() {
            addCriterion("supportid is null");
            return (Criteria) this;
        }

        public Criteria andSupportidIsNotNull() {
            addCriterion("supportid is not null");
            return (Criteria) this;
        }

        public Criteria andSupportidEqualTo(Integer value) {
            addCriterion("supportid =", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidNotEqualTo(Integer value) {
            addCriterion("supportid <>", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidGreaterThan(Integer value) {
            addCriterion("supportid >", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supportid >=", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidLessThan(Integer value) {
            addCriterion("supportid <", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidLessThanOrEqualTo(Integer value) {
            addCriterion("supportid <=", value, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidIn(List<Integer> values) {
            addCriterion("supportid in", values, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidNotIn(List<Integer> values) {
            addCriterion("supportid not in", values, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidBetween(Integer value1, Integer value2) {
            addCriterion("supportid between", value1, value2, "supportid");
            return (Criteria) this;
        }

        public Criteria andSupportidNotBetween(Integer value1, Integer value2) {
            addCriterion("supportid not between", value1, value2, "supportid");
            return (Criteria) this;
        }

        public Criteria andChooseseatIsNull() {
            addCriterion("chooseseat is null");
            return (Criteria) this;
        }

        public Criteria andChooseseatIsNotNull() {
            addCriterion("chooseseat is not null");
            return (Criteria) this;
        }

        public Criteria andChooseseatEqualTo(Integer value) {
            addCriterion("chooseseat =", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatNotEqualTo(Integer value) {
            addCriterion("chooseseat <>", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatGreaterThan(Integer value) {
            addCriterion("chooseseat >", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatGreaterThanOrEqualTo(Integer value) {
            addCriterion("chooseseat >=", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatLessThan(Integer value) {
            addCriterion("chooseseat <", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatLessThanOrEqualTo(Integer value) {
            addCriterion("chooseseat <=", value, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatIn(List<Integer> values) {
            addCriterion("chooseseat in", values, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatNotIn(List<Integer> values) {
            addCriterion("chooseseat not in", values, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatBetween(Integer value1, Integer value2) {
            addCriterion("chooseseat between", value1, value2, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andChooseseatNotBetween(Integer value1, Integer value2) {
            addCriterion("chooseseat not between", value1, value2, "chooseseat");
            return (Criteria) this;
        }

        public Criteria andSuperticketIsNull() {
            addCriterion("superticket is null");
            return (Criteria) this;
        }

        public Criteria andSuperticketIsNotNull() {
            addCriterion("superticket is not null");
            return (Criteria) this;
        }

        public Criteria andSuperticketEqualTo(Integer value) {
            addCriterion("superticket =", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketNotEqualTo(Integer value) {
            addCriterion("superticket <>", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketGreaterThan(Integer value) {
            addCriterion("superticket >", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketGreaterThanOrEqualTo(Integer value) {
            addCriterion("superticket >=", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketLessThan(Integer value) {
            addCriterion("superticket <", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketLessThanOrEqualTo(Integer value) {
            addCriterion("superticket <=", value, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketIn(List<Integer> values) {
            addCriterion("superticket in", values, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketNotIn(List<Integer> values) {
            addCriterion("superticket not in", values, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketBetween(Integer value1, Integer value2) {
            addCriterion("superticket between", value1, value2, "superticket");
            return (Criteria) this;
        }

        public Criteria andSuperticketNotBetween(Integer value1, Integer value2) {
            addCriterion("superticket not between", value1, value2, "superticket");
            return (Criteria) this;
        }

        public Criteria andElecwalletIsNull() {
            addCriterion("elecwallet is null");
            return (Criteria) this;
        }

        public Criteria andElecwalletIsNotNull() {
            addCriterion("elecwallet is not null");
            return (Criteria) this;
        }

        public Criteria andElecwalletEqualTo(Integer value) {
            addCriterion("elecwallet =", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletNotEqualTo(Integer value) {
            addCriterion("elecwallet <>", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletGreaterThan(Integer value) {
            addCriterion("elecwallet >", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletGreaterThanOrEqualTo(Integer value) {
            addCriterion("elecwallet >=", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletLessThan(Integer value) {
            addCriterion("elecwallet <", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletLessThanOrEqualTo(Integer value) {
            addCriterion("elecwallet <=", value, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletIn(List<Integer> values) {
            addCriterion("elecwallet in", values, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletNotIn(List<Integer> values) {
            addCriterion("elecwallet not in", values, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletBetween(Integer value1, Integer value2) {
            addCriterion("elecwallet between", value1, value2, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecwalletNotBetween(Integer value1, Integer value2) {
            addCriterion("elecwallet not between", value1, value2, "elecwallet");
            return (Criteria) this;
        }

        public Criteria andElecticketIsNull() {
            addCriterion("electicket is null");
            return (Criteria) this;
        }

        public Criteria andElecticketIsNotNull() {
            addCriterion("electicket is not null");
            return (Criteria) this;
        }

        public Criteria andElecticketEqualTo(Integer value) {
            addCriterion("electicket =", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketNotEqualTo(Integer value) {
            addCriterion("electicket <>", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketGreaterThan(Integer value) {
            addCriterion("electicket >", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketGreaterThanOrEqualTo(Integer value) {
            addCriterion("electicket >=", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketLessThan(Integer value) {
            addCriterion("electicket <", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketLessThanOrEqualTo(Integer value) {
            addCriterion("electicket <=", value, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketIn(List<Integer> values) {
            addCriterion("electicket in", values, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketNotIn(List<Integer> values) {
            addCriterion("electicket not in", values, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketBetween(Integer value1, Integer value2) {
            addCriterion("electicket between", value1, value2, "electicket");
            return (Criteria) this;
        }

        public Criteria andElecticketNotBetween(Integer value1, Integer value2) {
            addCriterion("electicket not between", value1, value2, "electicket");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNull() {
            addCriterion("delivery is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNotNull() {
            addCriterion("delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEqualTo(Integer value) {
            addCriterion("delivery =", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotEqualTo(Integer value) {
            addCriterion("delivery <>", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThan(Integer value) {
            addCriterion("delivery >", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery >=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThan(Integer value) {
            addCriterion("delivery <", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThanOrEqualTo(Integer value) {
            addCriterion("delivery <=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryIn(List<Integer> values) {
            addCriterion("delivery in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotIn(List<Integer> values) {
            addCriterion("delivery not in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryBetween(Integer value1, Integer value2) {
            addCriterion("delivery between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery not between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andPickupIsNull() {
            addCriterion("pickup is null");
            return (Criteria) this;
        }

        public Criteria andPickupIsNotNull() {
            addCriterion("pickup is not null");
            return (Criteria) this;
        }

        public Criteria andPickupEqualTo(Integer value) {
            addCriterion("pickup =", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotEqualTo(Integer value) {
            addCriterion("pickup <>", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupGreaterThan(Integer value) {
            addCriterion("pickup >", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickup >=", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupLessThan(Integer value) {
            addCriterion("pickup <", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupLessThanOrEqualTo(Integer value) {
            addCriterion("pickup <=", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupIn(List<Integer> values) {
            addCriterion("pickup in", values, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotIn(List<Integer> values) {
            addCriterion("pickup not in", values, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupBetween(Integer value1, Integer value2) {
            addCriterion("pickup between", value1, value2, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotBetween(Integer value1, Integer value2) {
            addCriterion("pickup not between", value1, value2, "pickup");
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