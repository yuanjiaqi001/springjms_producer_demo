package com.offcn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_jms_producer.xml")
public class TestQueue {
    @Autowired
    private QueueProducer queueProducer;

    @Test
    public void test(){

        //queueProducer.sendMessage("欢迎你的到来");
        queueProducer.sendMessage();
    }

}
