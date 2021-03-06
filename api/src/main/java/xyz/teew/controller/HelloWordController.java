package xyz.teew.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * hello word controller
 * @author youchao.wen
 * @date 2020/5/2.
 */
@ApiIgnore
@RestController
@RequestMapping(value = "/hello")
public class HelloWordController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public Object world() {
        return "Hello World";
    }
}
