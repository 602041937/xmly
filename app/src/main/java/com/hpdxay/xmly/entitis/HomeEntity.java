package com.hpdxay.xmly.entitis;

/**
 * Created by hpd on 2016/1/21.
 */
public class HomeEntity {

    private DiscoveryColumnsEntity discoveryColumns;
    private EditorRecommendAlbumsEntity editorRecommendAlbums;
    private HotRecommendsEntity hotRecommends;
    private FocusImagesEntity focusImages;
    private BulletAreaEntity bulletArea;

    public DiscoveryColumnsEntity getDiscoveryColumns() {
        return discoveryColumns;
    }

    public void setDiscoveryColumns(DiscoveryColumnsEntity discoveryColumns) {
        this.discoveryColumns = discoveryColumns;
    }

    public EditorRecommendAlbumsEntity getEditorRecommendAlbums() {
        return editorRecommendAlbums;
    }

    public void setEditorRecommendAlbums(EditorRecommendAlbumsEntity editorRecommendAlbums) {
        this.editorRecommendAlbums = editorRecommendAlbums;
    }

    public HotRecommendsEntity getHotRecommends() {
        return hotRecommends;
    }

    public void setHotRecommends(HotRecommendsEntity hotRecommends) {
        this.hotRecommends = hotRecommends;
    }

    public FocusImagesEntity getFocusImages() {
        return focusImages;
    }

    public void setFocusImages(FocusImagesEntity focusImages) {
        this.focusImages = focusImages;
    }

    public BulletAreaEntity getBulletArea() {
        return bulletArea;
    }

    public void setBulletArea(BulletAreaEntity bulletArea) {
        this.bulletArea = bulletArea;
    }
}
