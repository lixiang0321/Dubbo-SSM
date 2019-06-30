package www.qugoo.club.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import www.qugoo.club.service.IRoleAndActionService;
import www.qugoo.club.vo.Member;

/**
 * 远程注入测试已成功
 */
@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestLoginRoleService {
    @Reference
    private IRoleAndActionService roleAndActionService ;
    @Test
    public void testLogin() {
        System.out.println("我是不是null："+roleAndActionService);
//        InetAddress localAddress = NetUtils.getLocalAddress();
//        System.out.println(localAddress.getHostAddress());
        Member vo = new Member();
        vo.setMid("admin");
        vo.setPassword("mldn");
        System.out.println(this.roleAndActionService.get("admin"));
    }
}
