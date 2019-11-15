package top.oddou.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 博客标签
 */
@Entity
@Table(name="t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long tagId;
    private String tagName;

    /*--------------外表关联建----------------*/
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}
