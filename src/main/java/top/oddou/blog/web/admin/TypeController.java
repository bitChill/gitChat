package top.oddou.blog.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.oddou.blog.po.Type;
import top.oddou.blog.service.TypeService;



@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * 访问分类管理页面
     * @param pageable
     * @param model
     * @return
     */
    @GetMapping("/types")
    public String types(@PageableDefault(size = 10,sort = {"typeId"},direction = Sort.Direction.DESC)
                                Pageable pageable, Model model){

        model.addAttribute("page",typeService.listType(pageable));
        return "admin/admin_types";
    }

    /**
     * 分类添加页面
     * @return
     */
    @GetMapping("/types/input")
    public String input(){
        return "admin/admin_type_input.html";
    }

    @PostMapping("/type_post")
    public String post(Type type){
      Type t = typeService.saveType(type);
      if(t == null){

      }else{

      }
      return "redirect:/admin/types";
    }
}
