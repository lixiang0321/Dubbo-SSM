package www.qugoo.club.service;

import java.util.Map;

public interface IRoleAndActionService {
    /**
     * 获取指定的用户权限
     * key ="allRoles val=用户对应角色ID
     * keu = ”allActions“ val=用户对应的权限
     * @return  Map
     */
    public Map<String,Object> get(String mid);
}
