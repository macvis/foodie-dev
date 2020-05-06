package xyz.teew.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.teew.service.UserService;

/**
 * @author youchao.wen
 * @date 2020/5/3.
 */
@Api(value = "用户接口", tags = "用以注册登陆相关接口")
@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "使用id查询用户", notes = "获取一个用户")
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public String getNameById(Integer id){
        return userService.queryById(id).getUsername();
    }
}
