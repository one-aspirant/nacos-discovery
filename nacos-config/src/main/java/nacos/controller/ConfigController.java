package nacos.controller;




import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${abc}")
    private String abc;
    @Value("${extData}")
    private String extData;

    @RequestMapping("/getone")
    public String getone() {
        return abc;
    }
    @RequestMapping("/getExt")
    public String getExt() {
        return extData;
    }
}