package club.qugoo.logback.service.imlp;

import club.qugoo.logback.dao.IMemberLogsDao;
import club.qugoo.logback.service.IMemberlogssService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import www.qugoo.club.vo.Memberlogs;

@Service
public class MemberLogsServiceImpl implements IMemberlogssService {
    @Autowired
    private IMemberLogsDao memberLogsDao;

    @Override
    public boolean add(Memberlogs logs) {
        return this.memberLogsDao.doCreate(logs);
    }
}
