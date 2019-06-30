package www.qugoo.club.authc.dao;


import www.qugoo.club.vo.Member;

public interface IMemberDao  {
    /**
     * 根据Mid查询相关数据
     * @param mid
     * @return
     */
    public Member findById(String mid);
}
