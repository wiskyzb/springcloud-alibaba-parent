package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
//@RefreshScope 实现配置自动更新：
@RefreshScope
public class ConfigTestController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/test")
    public String getConfigInfo(){
        return configInfo;
    }

}
