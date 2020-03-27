package vic.service;

import vic.mybatis.entity.User;

import java.util.List;

public interface IUserService {
    //显示用户列表
    List<User> selectAll();
}
