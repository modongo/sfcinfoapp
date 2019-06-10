package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

public class News {

    private int id;
    private String newsitems;
    private int newscategoryid;
    private String newstitle;

    public int getNewscategoryid() {
        return newscategoryid;
    }

    public void setNewscategoryid(int newscategoryid) {
        this.newscategoryid = newscategoryid;
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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news = (News) o;
        return getId() == news.getId() &&
                getDeptid() == news.getDeptid() &&
                getNewsitems().equals(news.getNewsitems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNewsitems(), getDeptid());
    }
}
