package top.oddou.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BlogController {

    /**
     * 访问博客管理页面
     * @return
     */
    @GetMapping("/blogs")
    public String list(){
        return "admin/admin_blog";
    }
}
