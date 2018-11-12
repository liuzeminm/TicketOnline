package cn.pwol.pwolbackgroundprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class BannerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerinfoExample() {
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

        public Criteria andBanneridIsNull() {
            addCriterion("bannerid is null");
            return (Criteria) this;
        }

        public Criteria andBanneridIsNotNull() {
            addCriterion("bannerid is not null");
            return (Criteria) this;
        }

        public Criteria andBanneridEqualTo(Integer value) {
            addCriterion("bannerid =", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotEqualTo(Integer value) {
            addCriterion("bannerid <>", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridGreaterThan(Integer value) {
            addCriterion("bannerid >", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("bannerid >=", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridLessThan(Integer value) {
            addCriterion("bannerid <", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridLessThanOrEqualTo(Integer value) {
            addCriterion("bannerid <=", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridIn(List<Integer> values) {
            addCriterion("bannerid in", values, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotIn(List<Integer> values) {
            addCriterion("bannerid not in", values, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridBetween(Integer value1, Integer value2) {
            addCriterion("bannerid between", value1, value2, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotBetween(Integer value1, Integer value2) {
            addCriterion("bannerid not between", value1, value2, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBannerurlIsNull() {
            addCriterion("bannerurl is null");
            return (Criteria) this;
        }

        public Criteria andBannerurlIsNotNull() {
            addCriterion("bannerurl is not null");
            return (Criteria) this;
        }

        public Criteria andBannerurlEqualTo(String value) {
            addCriterion("bannerurl =", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotEqualTo(String value) {
            addCriterion("bannerurl <>", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThan(String value) {
            addCriterion("bannerurl >", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThanOrEqualTo(String value) {
            addCriterion("bannerurl >=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThan(String value) {
            addCriterion("bannerurl <", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThanOrEqualTo(String value) {
            addCriterion("bannerurl <=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLike(String value) {
            addCriterion("bannerurl like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotLike(String value) {
            addCriterion("bannerurl not like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlIn(List<String> values) {
            addCriterion("bannerurl in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotIn(List<String> values) {
            addCriterion("bannerurl not in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlBetween(String value1, String value2) {
            addCriterion("bannerurl between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotBetween(String value1, String value2) {
            addCriterion("bannerurl not between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannertypeIsNull() {
            addCriterion("bannertype is null");
            return (Criteria) this;
        }

        public Criteria andBannertypeIsNotNull() {
            addCriterion("bannertype is not null");
            return (Criteria) this;
        }

        public Criteria andBannertypeEqualTo(String value) {
            addCriterion("bannertype =", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotEqualTo(String value) {
            addCriterion("bannertype <>", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeGreaterThan(String value) {
            addCriterion("bannertype >", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeGreaterThanOrEqualTo(String value) {
            addCriterion("bannertype >=", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeLessThan(String value) {
            addCriterion("bannertype <", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeLessThanOrEqualTo(String value) {
            addCriterion("bannertype <=", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeLike(String value) {
            addCriterion("bannertype like", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotLike(String value) {
            addCriterion("bannertype not like", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeIn(List<String> values) {
            addCriterion("bannertype in", values, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotIn(List<String> values) {
            addCriterion("bannertype not in", values, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeBetween(String value1, String value2) {
            addCriterion("bannertype between", value1, value2, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotBetween(String value1, String value2) {
            addCriterion("bannertype not between", value1, value2, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannercityIsNull() {
            addCriterion("bannercity is null");
            return (Criteria) this;
        }

        public Criteria andBannercityIsNotNull() {
            addCriterion("bannercity is not null");
            return (Criteria) this;
        }

        public Criteria andBannercityEqualTo(String value) {
            addCriterion("bannercity =", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityNotEqualTo(String value) {
            addCriterion("bannercity <>", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityGreaterThan(String value) {
            addCriterion("bannercity >", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityGreaterThanOrEqualTo(String value) {
            addCriterion("bannercity >=", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityLessThan(String value) {
            addCriterion("bannercity <", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityLessThanOrEqualTo(String value) {
            addCriterion("bannercity <=", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityLike(String value) {
            addCriterion("bannercity like", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityNotLike(String value) {
            addCriterion("bannercity not like", value, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityIn(List<String> values) {
            addCriterion("bannercity in", values, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityNotIn(List<String> values) {
            addCriterion("bannercity not in", values, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityBetween(String value1, String value2) {
            addCriterion("bannercity between", value1, value2, "bannercity");
            return (Criteria) this;
        }

        public Criteria andBannercityNotBetween(String value1, String value2) {
            addCriterion("bannercity not between", value1, value2, "bannercity");
            return (Criteria) this;
        }

        public Criteria andTicketfkIsNull() {
            addCriterion("ticketfk is null");
            return (Criteria) this;
        }

        public Criteria andTicketfkIsNotNull() {
            addCriterion("ticketfk is not null");
            return (Criteria) this;
        }

        public Criteria andTicketfkEqualTo(Integer value) {
            addCriterion("ticketfk =", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkNotEqualTo(Integer value) {
            addCriterion("ticketfk <>", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkGreaterThan(Integer value) {
            addCriterion("ticketfk >", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketfk >=", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkLessThan(Integer value) {
            addCriterion("ticketfk <", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkLessThanOrEqualTo(Integer value) {
            addCriterion("ticketfk <=", value, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkIn(List<Integer> values) {
            addCriterion("ticketfk in", values, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkNotIn(List<Integer> values) {
            addCriterion("ticketfk not in", values, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkBetween(Integer value1, Integer value2) {
            addCriterion("ticketfk between", value1, value2, "ticketfk");
            return (Criteria) this;
        }

        public Criteria andTicketfkNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketfk not between", value1, value2, "ticketfk");
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