package www.qugoo.club.authz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import www.qugoo.club.authz.dao.IActionDao;
import www.qugoo.club.authz.dao.IRoleDao;
import www.qugoo.club.service.IRoleAndActionService;

import java.util.HashMap;
import java.util.Map;

@Service
public class RoleAndActionServiceImpl implements IRoleAndActionService {
    @Autowired
    private IRoleDao roleDao;
    @Autowired
    private IActionDao actionDao;
    @Override
    public Map<String, Object> get(String mid) {
        Map<String,Object> result= new HashMap<>();
        result.put("allRoles",this.roleDao.findAllByMember(mid));
        result.put("allActions",this.actionDao.findAllByMember(mid));
        return result;
    }

}
