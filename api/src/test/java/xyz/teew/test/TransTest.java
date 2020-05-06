package xyz.teew.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.teew.Application;
import xyz.teew.domain.Users;
import xyz.teew.service.UserService;

import java.util.Date;

/**
 * @author youchao.wen
 * @date 2020/5/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TransTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAddFamily(){
        Users parent = new Users();
        parent.setId("id1");
        parent.setUsername("dad");
        parent.setPassword("111");
        parent.setNickname("daddy");
        parent.setRealname("jim");
        parent.setFace("face");
        parent.setMobile("10086");
        parent.setEmail("mail@mail.com");
        parent.setSex(1);
        parent.setBirthday(new Date());
        parent.setCreatedTime(new Date());
        parent.setUpdatedTime(new Date());

        Users child = new Users();
        child.setId("id2");
        child.setUsername("child");
        child.setPassword("222");
        child.setNickname("jerry");
        child.setRealname("jer");
        child.setFace("face1");
        child.setMobile("10010");
        child.setEmail("mail2@mail.com");
        child.setSex(0);
        child.setBirthday(new Date());
        child.setCreatedTime(new Date());
        child.setUpdatedTime(new Date());

        userService.addFamily(parent, child);
    }
}
