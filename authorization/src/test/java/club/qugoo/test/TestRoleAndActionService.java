package club.qugoo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import www.qugoo.club.service.IRoleAndActionService;

/**
 * 不通过远程调用
 * Sring Autowired进行调用
 * 测试成功
 */
@ContextConfiguration(locations = {"classpath:META-INF/spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRoleAndActionService {
    @Autowired
    private IRoleAndActionService roleAndActionService;
    @Test
    public void testLogin(){
        System.out.println(this.roleAndActionService.get("admin"));
    }
}
