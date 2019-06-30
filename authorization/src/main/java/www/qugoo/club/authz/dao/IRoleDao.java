package www.qugoo.club.authz.dao;

import java.util.Set;

public interface IRoleDao {
    /**
     * 根据用户编号查询所有角色Id
     * @param mid
     * @return
     */
    public Set<String> findAllByMember(String mid);
}
