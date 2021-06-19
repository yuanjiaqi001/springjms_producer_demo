package com.offcn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 发布订阅的生产者
 */
@Component
public class TopicProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Destination textTopicDesination;


    public void sentMessage(final String text){
         jmsTemplate.send(textTopicDesination, new MessageCreator() {
             @Override
             public Message createMessage(Session session) throws JMSException {
                 return session.createTextMessage(text);
             }
         });
    }
}
