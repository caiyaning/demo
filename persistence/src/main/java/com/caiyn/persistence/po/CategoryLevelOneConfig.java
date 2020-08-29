package com.caiyn.persistence.po;

import javax.persistence.*;

@Table(name = "category_level_one_config")
public class CategoryLevelOneConfig {
    @Id
    private String id;

    @Column(name = "category_en")
    private String categoryEn;

    @Column(name = "category_cn")
    private String categoryCn;

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
}