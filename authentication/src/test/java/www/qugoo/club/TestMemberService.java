package www.qugoo.club;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import www.qugoo.club.service.IMemberService;
import www.qugoo.club.vo.Member;

/**
 * 这是Spring测试  ---一通过测试
 */
@ContextConfiguration(locations = {"classpath:META-INF/spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {
    @Autowired
    private IMemberService memberService ;
    @Test
    public void testLogin() {
        System.out.println(memberService+":我是不是null");
        Member vo = new Member();
        vo.setMid("admin");
        vo.setPassword("mldn");
        Member login = this.memberService.login(vo);
        System.out.println(login);
    }
}
