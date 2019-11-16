package top.oddou.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.oddou.blog.po.Type;

public interface TypeService {

    /**
     * 保存类型对象
     * @return
     */
    Type saveType(Type type);

    /**
     * 查询类型对象
     */
    Type getType(Long id);

    /**
     * 分页查询
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 更新类型
     * @param id
     * @param type
     * @return
     */
    Type updateType(Long id,Type type);

    /**
     * 删除类型
     * @param id
     */
    void deleteType(Long id);
}
