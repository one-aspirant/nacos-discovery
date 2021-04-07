package nacos.controller;


import lombok.extern.slf4j.Slf4j;
import nacos.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ConsumerController {

@Autowired
private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        log.info("Consumer invoke");
        String providerResult = providerClient.service();
        return "Consumer invoke:"+providerResult;
    }
}
