package vic.controller;

import vic.mybatis.entity.User;
import vic.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource(name = "userService")
    IUserService userService;

    @RequestMapping(value = "/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.selectAll();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "/list", produces = {"application/json; charSet=utf-8"})
    public List<User> findAll() {
        return userService.selectAll();
    }

}
