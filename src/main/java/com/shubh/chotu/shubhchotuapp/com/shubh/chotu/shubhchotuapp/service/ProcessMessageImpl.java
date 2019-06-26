package com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Challenge;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class ProcessMessageImpl implements ProcessMessage{
    @Override
    public Message convertStringToMessage(String str) {
        ObjectMapper mapper = new ObjectMapper();
        Message message = null;
        try {
            message = mapper.readValue(str, Message.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return message;
    }

    @Override
    public Challenge convertStringToChallenge(String str) {
        ObjectMapper mapper = new ObjectMapper();
        Challenge challenge = null;
        try {
            challenge = mapper.readValue(str, Challenge.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return challenge;
    }

    @Override
    public String processMessages(String str) {
        log.info("Message"+ str);
        Message message = convertStringToMessage(str);
        Challenge challenge = convertStringToChallenge(str);

        if(message != null){
            log.info("Message"+ message.getName() + "Address:"+ message.getAddress());
            String s= "Message"+ message.getName() + "Address:"+ message.getAddress();
            return s;
        } else if(challenge != null) {
            log.info("Challenge"+ challenge.getChallenge());
            String s= "Challenge"+ challenge.getChallenge();
            return challenge.getChallenge();
        }
        return "Invalid message";

    }
}
