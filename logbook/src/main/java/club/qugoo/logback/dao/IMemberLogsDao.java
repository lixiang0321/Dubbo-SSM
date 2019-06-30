package club.qugoo.logback.dao;

import www.qugoo.club.vo.Memberlogs;

public interface IMemberLogsDao {
    /**
     * 日志数据增加
     * @param log
     * @return
     */
    public boolean doCreate(Memberlogs log);
}
