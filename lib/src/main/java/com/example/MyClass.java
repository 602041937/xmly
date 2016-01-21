package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyClass {

    public static void main(String[] args) {

        Schema schema = new Schema(1, "com.hpdxay.xmly.entitis");
        schema.setDefaultJavaPackageDao("com.hpdxay.xmly.dao");

//                id: 2,
//                orderNum: 5,
//                title: "活动",
//                subtitle: "智慧树宝宝才艺大赛",
//                coverPath: "http://fdfs.xmcdn.com/group13/M04/E9/B1/wKgDXVad9i3hw3Z-AAAN992cbI0745.png",
//                contentType: "activity",
//                url: "",
//                sharePic: "",
//                enableShare: false,
//                isHot: true,
//                isExternalUrl: false,
//                contentUpdatedAt: 0
        Entity discoveryColumnEntity = schema.addEntity("DiscoveryColumnEntity");
        discoveryColumnEntity.addIdProperty();
        discoveryColumnEntity.addIntProperty("orderNum");
        discoveryColumnEntity.addStringProperty("title");
        discoveryColumnEntity.addStringProperty("subtitle");
        discoveryColumnEntity.addStringProperty("coverPath");
        discoveryColumnEntity.addStringProperty("contentType");
        discoveryColumnEntity.addStringProperty("url");
        discoveryColumnEntity.addStringProperty("sharePic");
        discoveryColumnEntity.addBooleanProperty("enableShare");
        discoveryColumnEntity.addBooleanProperty("isHot");
        discoveryColumnEntity.addBooleanProperty("isExternalUrl");
        discoveryColumnEntity.addIntProperty("contentUpdatedAt");


//                  albumId: 3338350,
//                coverLarge: "http://fdfs.xmcdn.com/group12/M08/D7/78/wKgDXFaAPoDQ3ee8AAKYvWnoYMU286_mobile_large.jpg",
//                title: "江山美人谋",
//                tags: "畅销书,言情",
//                tracks: 11,
//                playsCounts: 55452,
//                isFinished: 1,
//                serialState: 1,
//                trackId: 10988390,
//                trackTitle: "秦惠文王钟情的女人不是芈月?"
        Entity editorRecommendAlbumEntity = schema.addEntity("EditorRecommendAlbumEntity");
        editorRecommendAlbumEntity.addLongProperty("albumId").primaryKey();
        editorRecommendAlbumEntity.addStringProperty("coverLarge");
        editorRecommendAlbumEntity.addStringProperty("title");
        editorRecommendAlbumEntity.addStringProperty("tags");
        editorRecommendAlbumEntity.addIntProperty("tracks");
        editorRecommendAlbumEntity.addIntProperty("playsCounts");
        editorRecommendAlbumEntity.addIntProperty("isFinished");
        editorRecommendAlbumEntity.addIntProperty("serialState");
        editorRecommendAlbumEntity.addIntProperty("trackId");
        editorRecommendAlbumEntity.addStringProperty("trackTitle");


//               title: "听新闻",
//                contentType: "album",
//                isFinished: false,
//                categoryId: 1,
//                count: 1000,
//                hasMore: true,
        Entity hotRecommendEntity = schema.addEntity("HotRecommendEntity");
        hotRecommendEntity.addIdProperty().autoincrement();
        hotRecommendEntity.addStringProperty("title");
        hotRecommendEntity.addStringProperty("contentType");
        hotRecommendEntity.addBooleanProperty("isFinished");
        hotRecommendEntity.addIntProperty("categoryId");
        hotRecommendEntity.addIntProperty("count");
        hotRecommendEntity.addBooleanProperty("hasMore");

//                  albumId: 3067249,
//                coverLarge: "http://fdfs.xmcdn.com/group8/M03/85/0B/wKgDYFYfUeTBrbzNAAHyqmU1MYI426_mobile_large.jpg",
//                title: "虎扑话舌添足—爆",
//                tags: "资讯",
//                tracks: 28,
//                playsCounts: 27303,
//                isFinished: 0,
//                serialState: 0,
//                trackId: 11728684,
//                trackTitle: "中国首位一亿身价球星诞生"

        Entity hotRecommendItemEntity = schema.addEntity("HotRecommendItemEntity");
        hotRecommendItemEntity.addLongProperty("albumId").primaryKey();
        hotRecommendItemEntity.addStringProperty("coverLarge");
        hotRecommendItemEntity.addStringProperty("title");
        hotRecommendItemEntity.addStringProperty("tags");
        hotRecommendItemEntity.addIntProperty("tracks");
        hotRecommendItemEntity.addIntProperty("playsCounts");
        hotRecommendItemEntity.addIntProperty("isFinished");
        hotRecommendItemEntity.addIntProperty("serialState");
        hotRecommendItemEntity.addIntProperty("trackId");
        hotRecommendItemEntity.addStringProperty("trackTitle");

//        id: 6428,
//                shortTitle: "最让现代男人念念不忘的几类女人",
//                longTitle: "最让现代男人念念不忘的几类女人",
//                pic: "http://fdfs.xmcdn.com/group15/M0B/EC/A8/wKgDaFagp8ySEfPlAAGgWznSN5g058_android_large.jpg",
//                type: 3,
//                uid: 4429572,
//                trackId: 11661358,
//                isShare: false,
//                is_External_url: false
        Entity focusImageEntity = schema.addEntity("FocusImageEntity");
        focusImageEntity.addIdProperty();
        focusImageEntity.addStringProperty("shortTitle");
        focusImageEntity.addStringProperty("longTitle");
        focusImageEntity.addStringProperty("pic");
        focusImageEntity.addIntProperty("type");
        focusImageEntity.addIntProperty("uid");
        focusImageEntity.addIntProperty("trackId");
        focusImageEntity.addBooleanProperty("isShare");
        focusImageEntity.addBooleanProperty("is_External_url");


//              trackId: 11645582,
//                title: "心悦你：冰山脸太子居然会笑",
//                coverMiddle: "http://fdfs.xmcdn.com/group14/M03/E9/32/wKgDY1acWdLxVWBIAADMvk7mdaE860_web_large.jpg",
//                tags: "明星,太子妃升职记,sorry哥,盛一伦,访谈",
//                playPath32: "http://fdfs.xmcdn.com/group8/M04/E8/08/wKgDYVacV5Dxft_OACOxukOc7QM057.mp3",
//                playPath64: "http://fdfs.xmcdn.com/group8/M04/E8/08/wKgDYVacV5TTplo4AEdjR4HUum8393.mp3",
//                albumId: 3540447,
//                albumTitle: "sorry哥问大牌",
//                favoritesCounts: 257,
//                playsCounts: 36894,
//                commentsCounts: 280,
//                sharesCounts: 14
        Entity bulletEntity = schema.addEntity("BulletEntity");
        bulletEntity.addLongProperty("trackId").primaryKey();
        bulletEntity.addStringProperty("title");
        bulletEntity.addStringProperty("coverMiddle");
        bulletEntity.addStringProperty("tags");
        bulletEntity.addStringProperty("playPath32");
        bulletEntity.addStringProperty("playPath64");
        bulletEntity.addIntProperty("albumId");
        bulletEntity.addStringProperty("albumTitle");
        bulletEntity.addIntProperty("favoritesCounts");
        bulletEntity.addIntProperty("playsCounts");
        bulletEntity.addIntProperty("commentsCounts");
        bulletEntity.addIntProperty("sharesCounts");

        try {
            new DaoGenerator().generateAll(schema, "lib/java-gen");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
