package club.qugoo.service;

import www.qugoo.club.vo.Member;

import java.util.Map;

public interface ILoginService {
    /**
     * Web层次用户业务登录处理
     * 首先调用分布式认证接口进行用户身份认证
     * 其次调用分布式的授权接口获取用户对应的角色与
     * 权限信息。最后将用户的登录信息通过消息组件发送给
     * 日志数据库
     * key = member val=member实例
     * key = roles val=用户角色
     * key = actions val =用户权限
     * @param info
     * @return
     */
    public Map<String,Object> login(Member info);
}
