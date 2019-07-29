package com.rumos.courses;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

public class CoursesProducer {

    @Configuration
    public class MessagesMQController {

        @Value("${activemq.broker-url}")
        private String brokerURL;


        @Bean
        public Queue queue() {
            return new ActiveMQQueue("courses.queue");
        }

        @Bean
        public ActiveMQConnectionFactory activeMQConnectionFactory() {
            ActiveMQConnectionFactory mqFactory = new ActiveMQConnectionFactory();
            mqFactory.setBrokerURL(brokerURL);
            return mqFactory;
        }


    }
}