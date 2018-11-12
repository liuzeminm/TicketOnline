package cn.pwol.pwolbackgroundprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeatinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatinfoExample() {
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

        public Criteria andSeatidIsNull() {
            addCriterion("seatid is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("seatid is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(Integer value) {
            addCriterion("seatid =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(Integer value) {
            addCriterion("seatid <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(Integer value) {
            addCriterion("seatid >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatid >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(Integer value) {
            addCriterion("seatid <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(Integer value) {
            addCriterion("seatid <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<Integer> values) {
            addCriterion("seatid in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<Integer> values) {
            addCriterion("seatid not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(Integer value1, Integer value2) {
            addCriterion("seatid between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(Integer value1, Integer value2) {
            addCriterion("seatid not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andStandIsNull() {
            addCriterion("stand is null");
            return (Criteria) this;
        }

        public Criteria andStandIsNotNull() {
            addCriterion("stand is not null");
            return (Criteria) this;
        }

        public Criteria andStandEqualTo(Integer value) {
            addCriterion("stand =", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandNotEqualTo(Integer value) {
            addCriterion("stand <>", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandGreaterThan(Integer value) {
            addCriterion("stand >", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand >=", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandLessThan(Integer value) {
            addCriterion("stand <", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandLessThanOrEqualTo(Integer value) {
            addCriterion("stand <=", value, "stand");
            return (Criteria) this;
        }

        public Criteria andStandIn(List<Integer> values) {
            addCriterion("stand in", values, "stand");
            return (Criteria) this;
        }

        public Criteria andStandNotIn(List<Integer> values) {
            addCriterion("stand not in", values, "stand");
            return (Criteria) this;
        }

        public Criteria andStandBetween(Integer value1, Integer value2) {
            addCriterion("stand between", value1, value2, "stand");
            return (Criteria) this;
        }

        public Criteria andStandNotBetween(Integer value1, Integer value2) {
            addCriterion("stand not between", value1, value2, "stand");
            return (Criteria) this;
        }

        public Criteria andRowIsNull() {
            addCriterion("row is null");
            return (Criteria) this;
        }

        public Criteria andRowIsNotNull() {
            addCriterion("row is not null");
            return (Criteria) this;
        }

        public Criteria andRowEqualTo(Integer value) {
            addCriterion("row =", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotEqualTo(Integer value) {
            addCriterion("row <>", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThan(Integer value) {
            addCriterion("row >", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("row >=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThan(Integer value) {
            addCriterion("row <", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThanOrEqualTo(Integer value) {
            addCriterion("row <=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowIn(List<Integer> values) {
            addCriterion("row in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotIn(List<Integer> values) {
            addCriterion("row not in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowBetween(Integer value1, Integer value2) {
            addCriterion("row between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotBetween(Integer value1, Integer value2) {
            addCriterion("row not between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(Integer value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(Integer value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(Integer value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(Integer value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(Integer value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<Integer> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<Integer> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(Integer value1, Integer value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNull() {
            addCriterion("ticketprice is null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNotNull() {
            addCriterion("ticketprice is not null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceEqualTo(Double value) {
            addCriterion("ticketprice =", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotEqualTo(Double value) {
            addCriterion("ticketprice <>", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThan(Double value) {
            addCriterion("ticketprice >", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ticketprice >=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThan(Double value) {
            addCriterion("ticketprice <", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThanOrEqualTo(Double value) {
            addCriterion("ticketprice <=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIn(List<Double> values) {
            addCriterion("ticketprice in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotIn(List<Double> values) {
            addCriterion("ticketprice not in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceBetween(Double value1, Double value2) {
            addCriterion("ticketprice between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotBetween(Double value1, Double value2) {
            addCriterion("ticketprice not between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNull() {
            addCriterion("seatstatus is null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNotNull() {
            addCriterion("seatstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusEqualTo(String value) {
            addCriterion("seatstatus =", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotEqualTo(String value) {
            addCriterion("seatstatus <>", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThan(String value) {
            addCriterion("seatstatus >", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThanOrEqualTo(String value) {
            addCriterion("seatstatus >=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThan(String value) {
            addCriterion("seatstatus <", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThanOrEqualTo(String value) {
            addCriterion("seatstatus <=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLike(String value) {
            addCriterion("seatstatus like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotLike(String value) {
            addCriterion("seatstatus not like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIn(List<String> values) {
            addCriterion("seatstatus in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotIn(List<String> values) {
            addCriterion("seatstatus not in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusBetween(String value1, String value2) {
            addCriterion("seatstatus between", value1, value2, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotBetween(String value1, String value2) {
            addCriterion("seatstatus not between", value1, value2, "seatstatus");
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