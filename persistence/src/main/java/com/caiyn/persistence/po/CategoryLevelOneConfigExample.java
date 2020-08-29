package com.caiyn.persistence.po;

import java.util.ArrayList;
import java.util.List;

public class CategoryLevelOneConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryLevelOneConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryEnIsNull() {
            addCriterion("category_en is null");
            return (Criteria) this;
        }

        public Criteria andCategoryEnIsNotNull() {
            addCriterion("category_en is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEnEqualTo(String value) {
            addCriterion("category_en =", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnNotEqualTo(String value) {
            addCriterion("category_en <>", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnGreaterThan(String value) {
            addCriterion("category_en >", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnGreaterThanOrEqualTo(String value) {
            addCriterion("category_en >=", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnLessThan(String value) {
            addCriterion("category_en <", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnLessThanOrEqualTo(String value) {
            addCriterion("category_en <=", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnLike(String value) {
            addCriterion("category_en like", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnNotLike(String value) {
            addCriterion("category_en not like", value, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnIn(List<String> values) {
            addCriterion("category_en in", values, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnNotIn(List<String> values) {
            addCriterion("category_en not in", values, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnBetween(String value1, String value2) {
            addCriterion("category_en between", value1, value2, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryEnNotBetween(String value1, String value2) {
            addCriterion("category_en not between", value1, value2, "categoryEn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIsNull() {
            addCriterion("category_cn is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIsNotNull() {
            addCriterion("category_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCnEqualTo(String value) {
            addCriterion("category_cn =", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotEqualTo(String value) {
            addCriterion("category_cn <>", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnGreaterThan(String value) {
            addCriterion("category_cn >", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnGreaterThanOrEqualTo(String value) {
            addCriterion("category_cn >=", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLessThan(String value) {
            addCriterion("category_cn <", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLessThanOrEqualTo(String value) {
            addCriterion("category_cn <=", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLike(String value) {
            addCriterion("category_cn like", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotLike(String value) {
            addCriterion("category_cn not like", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIn(List<String> values) {
            addCriterion("category_cn in", values, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotIn(List<String> values) {
            addCriterion("category_cn not in", values, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnBetween(String value1, String value2) {
            addCriterion("category_cn between", value1, value2, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotBetween(String value1, String value2) {
            addCriterion("category_cn not between", value1, value2, "categoryCn");
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