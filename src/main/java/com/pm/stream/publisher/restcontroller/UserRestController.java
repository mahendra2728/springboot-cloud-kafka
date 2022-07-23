package com.pm.stream.publisher.restcontroller;

import com.pm.stream.publisher.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    private MessageChannel output;

    @PostMapping("/users")
    public User sendMessage(@RequestBody User user){
        output.send(MessageBuilder.withPayload(user).build());
        return  user;
    }
}
