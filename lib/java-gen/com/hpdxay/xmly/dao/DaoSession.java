package com.hpdxay.xmly.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.hpdxay.xmly.entitis.DiscoveryColumnEntity;
import com.hpdxay.xmly.entitis.EditorRecommendAlbumEntity;
import com.hpdxay.xmly.entitis.HotRecommendEntity;
import com.hpdxay.xmly.entitis.HotRecommendItemEntity;
import com.hpdxay.xmly.entitis.FocusImageEntity;
import com.hpdxay.xmly.entitis.BulletEntity;

import com.hpdxay.xmly.dao.DiscoveryColumnEntityDao;
import com.hpdxay.xmly.dao.EditorRecommendAlbumEntityDao;
import com.hpdxay.xmly.dao.HotRecommendEntityDao;
import com.hpdxay.xmly.dao.HotRecommendItemEntityDao;
import com.hpdxay.xmly.dao.FocusImageEntityDao;
import com.hpdxay.xmly.dao.BulletEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig discoveryColumnEntityDaoConfig;
    private final DaoConfig editorRecommendAlbumEntityDaoConfig;
    private final DaoConfig hotRecommendEntityDaoConfig;
    private final DaoConfig hotRecommendItemEntityDaoConfig;
    private final DaoConfig focusImageEntityDaoConfig;
    private final DaoConfig bulletEntityDaoConfig;

    private final DiscoveryColumnEntityDao discoveryColumnEntityDao;
    private final EditorRecommendAlbumEntityDao editorRecommendAlbumEntityDao;
    private final HotRecommendEntityDao hotRecommendEntityDao;
    private final HotRecommendItemEntityDao hotRecommendItemEntityDao;
    private final FocusImageEntityDao focusImageEntityDao;
    private final BulletEntityDao bulletEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        discoveryColumnEntityDaoConfig = daoConfigMap.get(DiscoveryColumnEntityDao.class).clone();
        discoveryColumnEntityDaoConfig.initIdentityScope(type);

        editorRecommendAlbumEntityDaoConfig = daoConfigMap.get(EditorRecommendAlbumEntityDao.class).clone();
        editorRecommendAlbumEntityDaoConfig.initIdentityScope(type);

        hotRecommendEntityDaoConfig = daoConfigMap.get(HotRecommendEntityDao.class).clone();
        hotRecommendEntityDaoConfig.initIdentityScope(type);

        hotRecommendItemEntityDaoConfig = daoConfigMap.get(HotRecommendItemEntityDao.class).clone();
        hotRecommendItemEntityDaoConfig.initIdentityScope(type);

        focusImageEntityDaoConfig = daoConfigMap.get(FocusImageEntityDao.class).clone();
        focusImageEntityDaoConfig.initIdentityScope(type);

        bulletEntityDaoConfig = daoConfigMap.get(BulletEntityDao.class).clone();
        bulletEntityDaoConfig.initIdentityScope(type);

        discoveryColumnEntityDao = new DiscoveryColumnEntityDao(discoveryColumnEntityDaoConfig, this);
        editorRecommendAlbumEntityDao = new EditorRecommendAlbumEntityDao(editorRecommendAlbumEntityDaoConfig, this);
        hotRecommendEntityDao = new HotRecommendEntityDao(hotRecommendEntityDaoConfig, this);
        hotRecommendItemEntityDao = new HotRecommendItemEntityDao(hotRecommendItemEntityDaoConfig, this);
        focusImageEntityDao = new FocusImageEntityDao(focusImageEntityDaoConfig, this);
        bulletEntityDao = new BulletEntityDao(bulletEntityDaoConfig, this);

        registerDao(DiscoveryColumnEntity.class, discoveryColumnEntityDao);
        registerDao(EditorRecommendAlbumEntity.class, editorRecommendAlbumEntityDao);
        registerDao(HotRecommendEntity.class, hotRecommendEntityDao);
        registerDao(HotRecommendItemEntity.class, hotRecommendItemEntityDao);
        registerDao(FocusImageEntity.class, focusImageEntityDao);
        registerDao(BulletEntity.class, bulletEntityDao);
    }
    
    public void clear() {
        discoveryColumnEntityDaoConfig.getIdentityScope().clear();
        editorRecommendAlbumEntityDaoConfig.getIdentityScope().clear();
        hotRecommendEntityDaoConfig.getIdentityScope().clear();
        hotRecommendItemEntityDaoConfig.getIdentityScope().clear();
        focusImageEntityDaoConfig.getIdentityScope().clear();
        bulletEntityDaoConfig.getIdentityScope().clear();
    }

    public DiscoveryColumnEntityDao getDiscoveryColumnEntityDao() {
        return discoveryColumnEntityDao;
    }

    public EditorRecommendAlbumEntityDao getEditorRecommendAlbumEntityDao() {
        return editorRecommendAlbumEntityDao;
    }

    public HotRecommendEntityDao getHotRecommendEntityDao() {
        return hotRecommendEntityDao;
    }

    public HotRecommendItemEntityDao getHotRecommendItemEntityDao() {
        return hotRecommendItemEntityDao;
    }

    public FocusImageEntityDao getFocusImageEntityDao() {
        return focusImageEntityDao;
    }

    public BulletEntityDao getBulletEntityDao() {
        return bulletEntityDao;
    }

}
