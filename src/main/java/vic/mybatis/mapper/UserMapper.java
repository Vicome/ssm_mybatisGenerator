package vic.mybatis.mapper;

import java.util.List;
import vic.mybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}