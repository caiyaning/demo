package com.caiyn.persistence.po;

import javax.persistence.*;

@Table(name = "news_data_source_config")
public class NewsDataSourceConfig {
    @Id
    private Integer id;

    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "source_nm")
    private String sourceNm;

    @Column(name = "home_link")
    private String homeLink;

    @Column(name = "source_st")
    private String sourceSt;

    @Column(name = "page_limit")
    private Integer pageLimit;

    @Column(name = "pagination_link")
    private String paginationLink;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return category_id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return source_nm
     */
    public String getSourceNm() {
        return sourceNm;
    }

    /**
     * @param sourceNm
     */
    public void setSourceNm(String sourceNm) {
        this.sourceNm = sourceNm;
    }

    /**
     * @return home_link
     */
    public String getHomeLink() {
        return homeLink;
    }

    /**
     * @param homeLink
     */
    public void setHomeLink(String homeLink) {
        this.homeLink = homeLink;
    }

    /**
     * @return source_st
     */
    public String getSourceSt() {
        return sourceSt;
    }

    /**
     * @param sourceSt
     */
    public void setSourceSt(String sourceSt) {
        this.sourceSt = sourceSt;
    }

    /**
     * @return page_limit
     */
    public Integer getPageLimit() {
        return pageLimit;
    }

    /**
     * @param pageLimit
     */
    public void setPageLimit(Integer pageLimit) {
        this.pageLimit = pageLimit;
    }

    /**
     * @return pagination_link
     */
    public String getPaginationLink() {
        return paginationLink;
    }

    /**
     * @param paginationLink
     */
    public void setPaginationLink(String paginationLink) {
        this.paginationLink = paginationLink;
    }
}