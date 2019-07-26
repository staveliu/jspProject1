package entity;

import java.io.Serializable;
import java.util.Date;

public class NewsTitle implements Serializable {
    private Integer id;
    private String titlename;
    private String creator;
    private Date createtime;

    public NewsTitle() {
    }

    @Override
    public String toString() {
        return "NewsTitle{" +
                "id=" + id +
                ", titlename='" + titlename + '\'' +
                ", creator='" + creator + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public NewsTitle(Integer id, String titlename, String creator, Date createtime) {
        this.id = id;
        this.titlename = titlename;
        this.creator = creator;
        this.createtime = createtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
