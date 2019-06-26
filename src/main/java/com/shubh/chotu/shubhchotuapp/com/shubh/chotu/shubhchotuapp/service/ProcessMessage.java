package com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.service;

import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Challenge;
import com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model.Message;
import org.springframework.stereotype.Service;


public interface ProcessMessage {
    Message convertStringToMessage(String str);
    Challenge convertStringToChallenge(String str);
    String processMessages(String str);

}
