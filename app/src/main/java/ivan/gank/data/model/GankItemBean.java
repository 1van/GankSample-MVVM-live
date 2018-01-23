package ivan.gank.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity
public class GankItemBean {
    /**
     * _id : 5a28a661421aa90fef20358c
     * createdAt : 2017-12-07T10:24:33.438Z
     * desc : 程序员的鄙视链，你被鄙视了吗？
     * publishedAt : 2018-01-10T07:57:19.486Z
     * source : web
     * type : 拓展资源
     * url : https://mp.weixin.qq.com/s?__biz=MzU3NzA0ODQzMw==&mid=2247483747&idx=1&sn=d31acba906001a324ad9722da7eb5981
     * used : true
     * who : 陈宇明
     * images : ["http://img.gank.io/c141c075-afdf-4f8f-9d17-ec41faa10e75"]
     */

    @PrimaryKey(autoGenerate = true)
    private int key;
    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    @Ignore
    private List<String> images;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}