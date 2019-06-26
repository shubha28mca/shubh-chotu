package com.shubh.chotu.shubhchotuapp.com.shubh.chotu.shubhchotuapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Challenge implements PostBody {
    String token;
    String challenge;
    String type;
}
