package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudRpcProvider8832Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRpcProvider8832Main.class);
        System.out.println("aaaa");
        System.out.println("bbb");
    }
}
