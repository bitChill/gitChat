package top.oddou.blog.service;

import top.oddou.blog.po.User;

public interface UserService {

    User userCheck(String userName, String password);

}
