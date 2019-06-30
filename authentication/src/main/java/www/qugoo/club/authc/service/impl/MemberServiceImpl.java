package www.qugoo.club.authc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yootk.util.encrypt.TestMD5;
import org.springframework.beans.factory.annotation.Autowired;
import www.qugoo.club.authc.dao.IMemberDao;
import www.qugoo.club.service.IMemberService;
import www.qugoo.club.vo.Member;

@Service
public class MemberServiceImpl implements IMemberService {
    @Autowired
    private IMemberDao memberDao;

    @Override
    public Member login(Member info) {
        Member user = this.memberDao.findById(info.getMid());
        /**
         * 通过当前的用户去查询响应的用户，如果当前用户不存在，
         * 返回null。
         */
        System.out.println("我是查出来的user");
        if(TestMD5.BaseMD5(info.getPassword()).equals(user.getPassword()) && user.getLocked().equals(0)){
            return user;
        }
        return null;
    }
}
