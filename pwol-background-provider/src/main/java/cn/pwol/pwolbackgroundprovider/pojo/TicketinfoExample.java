package cn.pwol.pwolbackgroundprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class TicketinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketinfoExample() {
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

        public Criteria andTicketidIsNull() {
            addCriterion("ticketid is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("ticketid is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(Integer value) {
            addCriterion("ticketid =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(Integer value) {
            addCriterion("ticketid <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(Integer value) {
            addCriterion("ticketid >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketid >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(Integer value) {
            addCriterion("ticketid <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(Integer value) {
            addCriterion("ticketid <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<Integer> values) {
            addCriterion("ticketid in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<Integer> values) {
            addCriterion("ticketid not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(Integer value1, Integer value2) {
            addCriterion("ticketid between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketid not between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIsNull() {
            addCriterion("subcategory is null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIsNotNull() {
            addCriterion("subcategory is not null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryEqualTo(String value) {
            addCriterion("subcategory =", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNotEqualTo(String value) {
            addCriterion("subcategory <>", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryGreaterThan(String value) {
            addCriterion("subcategory >", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("subcategory >=", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryLessThan(String value) {
            addCriterion("subcategory <", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryLessThanOrEqualTo(String value) {
            addCriterion("subcategory <=", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryLike(String value) {
            addCriterion("subcategory like", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNotLike(String value) {
            addCriterion("subcategory not like", value, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIn(List<String> values) {
            addCriterion("subcategory in", values, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNotIn(List<String> values) {
            addCriterion("subcategory not in", values, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryBetween(String value1, String value2) {
            addCriterion("subcategory between", value1, value2, "subcategory");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNotBetween(String value1, String value2) {
            addCriterion("subcategory not between", value1, value2, "subcategory");
            return (Criteria) this;
        }

        public Criteria andShowplaceIsNull() {
            addCriterion("showplace is null");
            return (Criteria) this;
        }

        public Criteria andShowplaceIsNotNull() {
            addCriterion("showplace is not null");
            return (Criteria) this;
        }

        public Criteria andShowplaceEqualTo(String value) {
            addCriterion("showplace =", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceNotEqualTo(String value) {
            addCriterion("showplace <>", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceGreaterThan(String value) {
            addCriterion("showplace >", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceGreaterThanOrEqualTo(String value) {
            addCriterion("showplace >=", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceLessThan(String value) {
            addCriterion("showplace <", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceLessThanOrEqualTo(String value) {
            addCriterion("showplace <=", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceLike(String value) {
            addCriterion("showplace like", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceNotLike(String value) {
            addCriterion("showplace not like", value, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceIn(List<String> values) {
            addCriterion("showplace in", values, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceNotIn(List<String> values) {
            addCriterion("showplace not in", values, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceBetween(String value1, String value2) {
            addCriterion("showplace between", value1, value2, "showplace");
            return (Criteria) this;
        }

        public Criteria andShowplaceNotBetween(String value1, String value2) {
            addCriterion("showplace not between", value1, value2, "showplace");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picurl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picurl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picurl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picurl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picurl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picurl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picurl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picurl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picurl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picurl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picurl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picurl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picurl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picurl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andZanIsNull() {
            addCriterion("zan is null");
            return (Criteria) this;
        }

        public Criteria andZanIsNotNull() {
            addCriterion("zan is not null");
            return (Criteria) this;
        }

        public Criteria andZanEqualTo(Integer value) {
            addCriterion("zan =", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotEqualTo(Integer value) {
            addCriterion("zan <>", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThan(Integer value) {
            addCriterion("zan >", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan >=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThan(Integer value) {
            addCriterion("zan <", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThanOrEqualTo(Integer value) {
            addCriterion("zan <=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanIn(List<Integer> values) {
            addCriterion("zan in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotIn(List<Integer> values) {
            addCriterion("zan not in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanBetween(Integer value1, Integer value2) {
            addCriterion("zan between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotBetween(Integer value1, Integer value2) {
            addCriterion("zan not between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andSkufkIsNull() {
            addCriterion("skufk is null");
            return (Criteria) this;
        }

        public Criteria andSkufkIsNotNull() {
            addCriterion("skufk is not null");
            return (Criteria) this;
        }

        public Criteria andSkufkEqualTo(Integer value) {
            addCriterion("skufk =", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkNotEqualTo(Integer value) {
            addCriterion("skufk <>", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkGreaterThan(Integer value) {
            addCriterion("skufk >", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkGreaterThanOrEqualTo(Integer value) {
            addCriterion("skufk >=", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkLessThan(Integer value) {
            addCriterion("skufk <", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkLessThanOrEqualTo(Integer value) {
            addCriterion("skufk <=", value, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkIn(List<Integer> values) {
            addCriterion("skufk in", values, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkNotIn(List<Integer> values) {
            addCriterion("skufk not in", values, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkBetween(Integer value1, Integer value2) {
            addCriterion("skufk between", value1, value2, "skufk");
            return (Criteria) this;
        }

        public Criteria andSkufkNotBetween(Integer value1, Integer value2) {
            addCriterion("skufk not between", value1, value2, "skufk");
            return (Criteria) this;
        }

        public Criteria andSupportfkIsNull() {
            addCriterion("supportfk is null");
            return (Criteria) this;
        }

        public Criteria andSupportfkIsNotNull() {
            addCriterion("supportfk is not null");
            return (Criteria) this;
        }

        public Criteria andSupportfkEqualTo(Integer value) {
            addCriterion("supportfk =", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkNotEqualTo(Integer value) {
            addCriterion("supportfk <>", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkGreaterThan(Integer value) {
            addCriterion("supportfk >", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkGreaterThanOrEqualTo(Integer value) {
            addCriterion("supportfk >=", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkLessThan(Integer value) {
            addCriterion("supportfk <", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkLessThanOrEqualTo(Integer value) {
            addCriterion("supportfk <=", value, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkIn(List<Integer> values) {
            addCriterion("supportfk in", values, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkNotIn(List<Integer> values) {
            addCriterion("supportfk not in", values, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkBetween(Integer value1, Integer value2) {
            addCriterion("supportfk between", value1, value2, "supportfk");
            return (Criteria) this;
        }

        public Criteria andSupportfkNotBetween(Integer value1, Integer value2) {
            addCriterion("supportfk not between", value1, value2, "supportfk");
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