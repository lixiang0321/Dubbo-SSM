package www.qugoo.club.service;

import www.qugoo.club.vo.Member;

public interface IMemberService {
    /**
     * 管理用户登录(认证业务)
     * @param info
     * @return
     */
    public Member login(Member info);
}
