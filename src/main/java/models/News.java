package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

public class News {

    private int id;
    private String newsitems;
    private int newscategoryid;
    private Timestamp createdate;
    private String newstitle;

    public int getNewscategoryid() {
        return newscategoryid;
    }

    public void setNewscategoryid(int newscategoryid) {
        this.newscategoryid = newscategoryid;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }



    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public News(String newsitems, int newscategoryid, String newstitle) {
        this.newsitems = newsitems;
        this.newscategoryid = newscategoryid;
        this.id = id;
        this.createdate = createdate;
        this.newstitle = newstitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsitems() {
        return newsitems;
    }

    public void setNewsitems(String newsitems) {
        this.newsitems = newsitems;
    }

    public int getDeptid() {
        return newscategoryid;
    }

    public void setDeptid(int newscategoryid) {
        this.newscategoryid = newscategoryid;
    }

    public Timestamp getCreatedAt() {
        return createdate;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdate = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news = (News) o;
        return getId() == news.getId() &&
                getDeptid() == news.getDeptid() &&
                getNewsitems().equals(news.getNewsitems()) &&
                getCreatedAt().equals(news.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNewsitems(), getDeptid(), getCreatedAt());
    }
}
