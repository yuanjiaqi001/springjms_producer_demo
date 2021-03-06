package com.offcn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_jms_producer.xml")
public class TestTopic {

    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void test(){
        topicProducer.sentMessage("洗浴中心大酬宾活动开始了！！");
    }
}
