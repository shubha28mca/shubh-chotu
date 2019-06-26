package com.shubh.chotu.shubhchotuapp.controller;

import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Challenge;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Message;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.PostBody;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.service.ProcessMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ReadMessages {

    @Autowired
    private ProcessMessage processMessage;

    @PostMapping("/write")
    public ResponseEntity<String> writeMessage(
            @RequestBody String str
            ){
        log.info("Shubh"+ str);
        String returnValue = "";
        if(str!=null){

            log.info("Message is not empty");
            //log.info("data"+message.getName()+"Address:"+message.getAddress());
            returnValue = processMessage.processMessages(str);
        }

        return ResponseEntity.ok().body(returnValue);
    }


    @GetMapping("/read")
    public String readMessage(){
        return "Hello";
    }
}
