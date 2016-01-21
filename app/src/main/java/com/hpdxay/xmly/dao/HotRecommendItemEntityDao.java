package com.hpdxay.xmly.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.hpdxay.xmly.entitis.HotRecommendItemEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HOT_RECOMMEND_ITEM_ENTITY".
*/
public class HotRecommendItemEntityDao extends AbstractDao<HotRecommendItemEntity, Long> {

    public static final String TABLENAME = "HOT_RECOMMEND_ITEM_ENTITY";

    /**
     * Properties of entity HotRecommendItemEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property AlbumId = new Property(0, Long.class, "albumId", true, "ALBUM_ID");
        public final static Property CoverLarge = new Property(1, String.class, "coverLarge", false, "COVER_LARGE");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Tags = new Property(3, String.class, "tags", false, "TAGS");
        public final static Property Tracks = new Property(4, Integer.class, "tracks", false, "TRACKS");
        public final static Property PlaysCounts = new Property(5, Integer.class, "playsCounts", false, "PLAYS_COUNTS");
        public final static Property IsFinished = new Property(6, Integer.class, "isFinished", false, "IS_FINISHED");
        public final static Property SerialState = new Property(7, Integer.class, "serialState", false, "SERIAL_STATE");
        public final static Property TrackId = new Property(8, Integer.class, "trackId", false, "TRACK_ID");
        public final static Property TrackTitle = new Property(9, String.class, "trackTitle", false, "TRACK_TITLE");
    };


    public HotRecommendItemEntityDao(DaoConfig config) {
        super(config);
    }
    
    public HotRecommendItemEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HOT_RECOMMEND_ITEM_ENTITY\" (" + //
                "\"ALBUM_ID\" INTEGER PRIMARY KEY ," + // 0: albumId
                "\"COVER_LARGE\" TEXT," + // 1: coverLarge
                "\"TITLE\" TEXT," + // 2: title
                "\"TAGS\" TEXT," + // 3: tags
                "\"TRACKS\" INTEGER," + // 4: tracks
                "\"PLAYS_COUNTS\" INTEGER," + // 5: playsCounts
                "\"IS_FINISHED\" INTEGER," + // 6: isFinished
                "\"SERIAL_STATE\" INTEGER," + // 7: serialState
                "\"TRACK_ID\" INTEGER," + // 8: trackId
                "\"TRACK_TITLE\" TEXT);"); // 9: trackTitle
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HOT_RECOMMEND_ITEM_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HotRecommendItemEntity entity) {
        stmt.clearBindings();
 
        Long albumId = entity.getAlbumId();
        if (albumId != null) {
            stmt.bindLong(1, albumId);
        }
 
        String coverLarge = entity.getCoverLarge();
        if (coverLarge != null) {
            stmt.bindString(2, coverLarge);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(4, tags);
        }
 
        Integer tracks = entity.getTracks();
        if (tracks != null) {
            stmt.bindLong(5, tracks);
        }
 
        Integer playsCounts = entity.getPlaysCounts();
        if (playsCounts != null) {
            stmt.bindLong(6, playsCounts);
        }
 
        Integer isFinished = entity.getIsFinished();
        if (isFinished != null) {
            stmt.bindLong(7, isFinished);
        }
 
        Integer serialState = entity.getSerialState();
        if (serialState != null) {
            stmt.bindLong(8, serialState);
        }
 
        Integer trackId = entity.getTrackId();
        if (trackId != null) {
            stmt.bindLong(9, trackId);
        }
 
        String trackTitle = entity.getTrackTitle();
        if (trackTitle != null) {
            stmt.bindString(10, trackTitle);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HotRecommendItemEntity readEntity(Cursor cursor, int offset) {
        HotRecommendItemEntity entity = new HotRecommendItemEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // albumId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // coverLarge
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tags
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // tracks
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // playsCounts
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // isFinished
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // serialState
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // trackId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // trackTitle
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HotRecommendItemEntity entity, int offset) {
        entity.setAlbumId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCoverLarge(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTags(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTracks(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setPlaysCounts(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setIsFinished(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSerialState(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setTrackId(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setTrackTitle(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HotRecommendItemEntity entity, long rowId) {
        entity.setAlbumId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HotRecommendItemEntity entity) {
        if(entity != null) {
            return entity.getAlbumId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
