package club.qugoo.logback.listener;

import club.qugoo.logback.service.IMemberlogssService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import www.qugoo.club.vo.Memberlogs;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MemberlogsListener implements MessageListener {
    @Autowired
    private IMemberlogssService memberlogsService ;
    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage text = (TextMessage) message ; // 实例向下转型
            try {
                Memberlogs log = JSONObject.parseObject(text.getText(), Memberlogs.class) ;
                this.memberlogsService.add(log) ;
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
