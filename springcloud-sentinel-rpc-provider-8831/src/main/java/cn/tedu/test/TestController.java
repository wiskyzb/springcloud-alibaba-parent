package cn.tedu.test;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
        @SentinelResource(value = "test",fallback = "resource",blockHandler = "blockHandler")
    public String getTest() throws InterruptedException {
//        Thread.sleep(7000);
        int i = 1/0;
        return "测试"+port;
    }

     public String resource(){
        System.out.println("resource");
        return "resource";
    }
     public String blockHandler(BlockException e){
        System.out.println("blockHandler");
        return "blockHandler";
    }

}
