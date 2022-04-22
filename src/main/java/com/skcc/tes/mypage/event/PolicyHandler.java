package com.skcc.tes.mypage.event;

import com.skcc.tes.mypage.event.kafka.KafkaProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){
        // 카프카 이슈 해결
        System.out.println("eventString = " + eventString);
    }
}