package club.qugoo.action;

import club.qugoo.service.ILoginService;
import club.qugoo.service.IMessageService;
import com.yootk.util.action.AbstractAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import www.qugoo.club.vo.Member;
import www.qugoo.club.vo.Memberlogs;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/back/admin/*")
public class LoginAction extends AbstractAction {
    @Autowired
    private ILoginService loginService;
    @Autowired
    private IMessageService messageService;
    @RequestMapping("login")
    public ModelAndView login(Member info){
        Memberlogs memberlogs = new Memberlogs();
        memberlogs.setMid(info.getMid());
        memberlogs.setLogintime(new Date());
        this.messageService.send(memberlogs);
        ModelAndView mav = new ModelAndView("index");
        info.setPassword(info.getPassword());
        Map<String,Object> map = this.loginService.login(info);
        //登录失败
        if(map.size() ==0){
            mav.setViewName("back/admin/member/member_login");
            mav.addObject("login.error","登录失败，错误的用户或密码");
        }else{//登录成功
            super.getSession().setAttribute("member",map.get("member"));
            super.getSession().setAttribute("roles",map.get("roles"));
            super.getSession().setAttribute("actions",map.get("actions"));
        }
        return mav;
    }
}
