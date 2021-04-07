package com.taikang.nacos.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderController {
    @GetMapping("/service")
    public String service(){
        log.info("provider invoke");
     return "provider invoke";
    }
}
