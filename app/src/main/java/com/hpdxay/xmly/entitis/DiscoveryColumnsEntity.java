package com.hpdxay.xmly.entitis;

import java.util.List;

/**
 * Created by hpd on 2016/1/21.
 */
public class DiscoveryColumnsEntity {

    private String title;
    private int locationInHotRecommend;
    private List<DiscoveryColumnEntity> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLocationInHotRecommend() {
        return locationInHotRecommend;
    }

    public void setLocationInHotRecommend(int locationInHotRecommend) {
        this.locationInHotRecommend = locationInHotRecommend;
    }

    public List<DiscoveryColumnEntity> getList() {
        return list;
    }

    public void setList(List<DiscoveryColumnEntity> list) {
        this.list = list;
    }
}
