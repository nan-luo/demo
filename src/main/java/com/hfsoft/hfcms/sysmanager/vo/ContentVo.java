package com.hfsoft.hfcms.sysmanager.vo;



/**
 * @author 花折
 * @date 2020/9/15 11:02
 * @Description
 */
public class ContentVo {
    private Long id;
    private String title;

    public ContentVo(Long id, String title) {
        this.id = id;
        this.title = title;
    }

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

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
