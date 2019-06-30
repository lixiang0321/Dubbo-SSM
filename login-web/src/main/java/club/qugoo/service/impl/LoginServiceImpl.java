package club.qugoo.service.impl;

import club.qugoo.service.ILoginService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import www.qugoo.club.service.IMemberService;
import www.qugoo.club.service.IRoleAndActionService;
import www.qugoo.club.vo.Member;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements ILoginService {
    @Reference
    private IMemberService memberService;
    @Reference
    private IRoleAndActionService roleAndActionService;

    @Override
    public Map<String, Object> login(Member info) {
        Map<String,Object> result = new HashMap<>();
        Member loginMember = this.memberService.login(info);
        if(loginMember ==null){
            return result;
        }
        Map<String,Object> map = this.roleAndActionService.get(info.getMid());
        result.put("member",loginMember);
        result.put("roles",map.get("allRoles"));
        result.put("actions",map.get("allActions"));
        return result;
    }
}
