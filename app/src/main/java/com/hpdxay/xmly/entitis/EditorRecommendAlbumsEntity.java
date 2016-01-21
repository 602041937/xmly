package com.hpdxay.xmly.entitis;

import java.util.List;

/**
 * Created by hpd on 2016/1/21.
 */
public class EditorRecommendAlbumsEntity {
    private String title;
    private Boolean hasMore;
    private List<EditorRecommendAlbumEntity> list;

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

    public List<EditorRecommendAlbumEntity> getList() {
        return list;
    }

    public void setList(List<EditorRecommendAlbumEntity> list) {
        this.list = list;
    }
}
