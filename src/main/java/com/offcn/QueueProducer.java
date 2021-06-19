package com.offcn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * 点对点消息生产者
 */
@Component
public class QueueProducer {

    //1、依赖注入jmstemplate
    @Autowired
    private JmsTemplate jmsTemplate;
    //2、声明消息队列
    @Autowired
    private Destination queueTextDestination;

    public void sendMessage(){
         jmsTemplate.send(queueTextDestination, new MessageCreator() {
             @Override
             public Message createMessage(Session session) throws JMSException {
                // return session.createTextMessage(text);
                 MapMessage mapMessage=session.createMapMessage();
                 mapMessage.setString("mobile","18779239070");
                 mapMessage.setString("code","12345678909876543212345678");
                 return mapMessage;
             }
         });

    }
}
