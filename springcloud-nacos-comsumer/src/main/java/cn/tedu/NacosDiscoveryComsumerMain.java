package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryComsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryComsumerMain.class);
    }
}
