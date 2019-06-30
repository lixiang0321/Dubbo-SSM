package www.qugoo.club.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import www.qugoo.club.service.IMemberService;
import www.qugoo.club.vo.Member;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {
    @Reference
    private IMemberService memberService ;
    @Test
    public void testLogin() {
        System.out.println("我是不是null："+memberService);
//        InetAddress localAddress = NetUtils.getLocalAddress();
//        System.out.println(localAddress.getHostAddress());
        Member vo = new Member();
        vo.setMid("admin");
        vo.setPassword("mldn");
        System.out.println(this.memberService.login(vo));
    }
}
