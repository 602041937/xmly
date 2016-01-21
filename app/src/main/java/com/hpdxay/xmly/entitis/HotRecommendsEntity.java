package com.hpdxay.xmly.entitis;

import java.util.List;

/**
 * Created by hpd on 2016/1/21.
 */
public class HotRecommendsEntity {
    private String title;
    private List<HotRecommendEntity> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<HotRecommendEntity> getList() {
        return list;
    }

    public void setList(List<HotRecommendEntity> list) {
        this.list = list;
    }
}
