//package com.pm.stream.publisher;
//
//import com.pm.stream.publisher.model.User;
//import java.util.logging.Logger;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.messaging.Sink;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.handler.annotation.Payload;
//
//@Configuration
//@EnableBinding(Sink.class)
//public class KafkConsumer {
//
//    private Logger logger = Logger.getLogger(KafkConsumer.class.getName());
//
//    @StreamListener("input")
//    public void consumer(@Payload User user){
//        logger.info("message received {}"+user);
//
//    }
//}
