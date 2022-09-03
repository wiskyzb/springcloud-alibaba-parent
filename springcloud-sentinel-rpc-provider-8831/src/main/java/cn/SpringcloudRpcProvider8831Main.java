package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudRpcProvider8831Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRpcProvider8831Main.class);
    }
}
