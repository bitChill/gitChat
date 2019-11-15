package top.oddou.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.oddou.blog.po.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserNameAndPassword(String userName,String password);
}
