package com.hpdxay.xmly.entitis;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "EDITOR_RECOMMEND_ALBUM_ENTITY".
 */
public class EditorRecommendAlbumEntity {

    private Long albumId;
    private String coverLarge;
    private String title;
    private String tags;
    private Integer tracks;
    private Integer playsCounts;
    private Integer isFinished;
    private Integer serialState;
    private Integer trackId;
    private String trackTitle;

    public EditorRecommendAlbumEntity() {
    }

    public EditorRecommendAlbumEntity(Long albumId) {
        this.albumId = albumId;
    }

    public EditorRecommendAlbumEntity(Long albumId, String coverLarge, String title, String tags, Integer tracks, Integer playsCounts, Integer isFinished, Integer serialState, Integer trackId, String trackTitle) {
        this.albumId = albumId;
        this.coverLarge = coverLarge;
        this.title = title;
        this.tags = tags;
        this.tracks = tracks;
        this.playsCounts = playsCounts;
        this.isFinished = isFinished;
        this.serialState = serialState;
        this.trackId = trackId;
        this.trackTitle = trackTitle;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getCoverLarge() {
        return coverLarge;
    }

    public void setCoverLarge(String coverLarge) {
        this.coverLarge = coverLarge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getTracks() {
        return tracks;
    }

    public void setTracks(Integer tracks) {
        this.tracks = tracks;
    }

    public Integer getPlaysCounts() {
        return playsCounts;
    }

    public void setPlaysCounts(Integer playsCounts) {
        this.playsCounts = playsCounts;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public Integer getSerialState() {
        return serialState;
    }

    public void setSerialState(Integer serialState) {
        this.serialState = serialState;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

}
