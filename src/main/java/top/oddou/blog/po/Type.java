package top.oddou.blog.po;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 博客类型表
 */
@Entity
@Table(name="t_type")
public class Type {

    @Id
    @GeneratedValue
    private Long typeId;//类型Id
    private String typeName;//类型名称

    /*--------------外表关联建----------------*/
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
