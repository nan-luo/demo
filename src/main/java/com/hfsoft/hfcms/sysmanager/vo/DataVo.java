package com.hfsoft.hfcms.sysmanager.vo;


import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @author 花折
 * @date 2020/9/14 18:57
 * @Description
 */

public class DataVo {

    private Long id;
    private String title;
    private List<T> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

    public DataVo(Long id, String title, List<T> children) {
        this.id = id;
        this.title = title;
        this.children = children;
    }

    @Override
    public String toString() {
        return "DataVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", children=" + children +
                '}';
    }
}
