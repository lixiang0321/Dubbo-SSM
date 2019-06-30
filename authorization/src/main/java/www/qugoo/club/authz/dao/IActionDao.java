package www.qugoo.club.authz.dao;

import java.util.Set;

public interface IActionDao {
    /**
     * 根据用户编号获取对应的权限
     * @param mid
     * @return
     */
    public Set<String> findAllByMember(String mid);
}
