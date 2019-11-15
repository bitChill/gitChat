package top.oddou.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.oddou.blog.dao.UserRepository;
import top.oddou.blog.po.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User userCheck(String userName, String password) {
        User  user = userRepository.findByUserNameAndPassword(userName,password);
        return user;
    }
}
