package com.hpdxay.xmly.entitis;

import java.util.List;

/**
 * Created by hpd on 2016/1/21.
 */
public class BulletAreaEntity {

    private String title;
    private Boolean hasMore;
    private List<BulletEntity> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<BulletEntity> getList() {
        return list;
    }

    public void setList(List<BulletEntity> list) {
        this.list = list;
    }
}
