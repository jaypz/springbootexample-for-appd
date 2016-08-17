package com.jaypease.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class HelloController {

    //this is really dumb code but it is to test java8 specific bytecode in appd
    @RequestMapping("/")
    public String index() {
        Map test = new ImmutableMap.Builder<String, String>()
                .put("Testing", "HelloWorld!")
                .build();

        return (String) test.keySet().stream().filter(e -> e.equals("Testing")).collect(Collectors.joining());


    }

}
