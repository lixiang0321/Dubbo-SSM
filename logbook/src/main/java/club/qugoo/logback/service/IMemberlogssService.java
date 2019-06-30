package club.qugoo.logback.service;

import www.qugoo.club.vo.Memberlogs;

public interface IMemberlogssService {
    /**
     * 日志数据库的添加
     * @param logs
     * @return
     */
    public boolean add(Memberlogs logs);

}
