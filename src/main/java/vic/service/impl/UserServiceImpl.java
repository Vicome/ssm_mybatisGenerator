package vic.service.impl;

import vic.mybatis.entity.User;
import vic.mybatis.mapper.UserMapper;
import vic.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userDao")
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
