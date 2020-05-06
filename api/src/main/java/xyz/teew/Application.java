package xyz.teew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;
import xyz.teew.mapper.BaseMapper;

/**
 * 项目启动类
 *
 * @author youchao.wen
 * @date 2020/5/2.
 */
@SpringBootApplication
@MapperScan(basePackages = "xyz.teew.mapper", markerInterface = BaseMapper.class)
@ComponentScan(basePackages = {"xyz.teew", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
