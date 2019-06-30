package club.qugoo.test;

import club.qugoo.service.ILoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import www.qugoo.club.vo.Member;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestLoginService {
    @Autowired
    private ILoginService loginService ;
    @Test
    public void testLogin() {
        System.out.println("我是不是null:"+loginService);
        Member info = new Member() ;
        info.setMid("admin");
        info.setPassword("mldn");
        System.out.println(this.loginService.login(info));
    }
}
