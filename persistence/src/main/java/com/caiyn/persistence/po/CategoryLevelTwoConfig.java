package com.caiyn.persistence.po;

import javax.persistence.*;

@Table(name = "category_level_two_config")
public class CategoryLevelTwoConfig {
    @Id
    private String id;

    @Column(name = "category_en")
    private String categoryEn;

    @Column(name = "category_cn")
    private String categoryCn;

    @Column(name = "parent_category")
    private String parentCategory;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return category_en
     */
    public String getCategoryEn() {
        return categoryEn;
    }

    /**
     * @param categoryEn
     */
    public void setCategoryEn(String categoryEn) {
        this.categoryEn = categoryEn;
    }

    /**
     * @return category_cn
     */
    public String getCategoryCn() {
        return categoryCn;
    }

    /**
     * @param categoryCn
     */
    public void setCategoryCn(String categoryCn) {
        this.categoryCn = categoryCn;
    }

    /**
     * @return parent_category
     */
    public String getParentCategory() {
        return parentCategory;
    }

    /**
     * @param parentCategory
     */
    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }
}