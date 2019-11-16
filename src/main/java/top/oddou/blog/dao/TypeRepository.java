package top.oddou.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.oddou.blog.po.Type;

public interface TypeRepository extends JpaRepository<Type,Long> {

}
