package com.chatapp.ChatAppKafka.config;

import org.apache.camel.component.kafka.KafkaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.chatapp.ChatAppKafka.model.Message;

@Component
public class MessageListener {
	
	@Autowired
    SimpMessagingTemplate template;

    @KafkaListener(
            topics = KafkaConstants.TOPIC,
            groupId = KafkaConstants.GROUP_ID;
    )
    public void listen(Message message) {
        System.out.println("sending via kafka listener..");
        template.convertAndSend("/topic/group", message);
    }

}
