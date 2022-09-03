package cn.tedu.controller;

import cn.tedu.sentienlreturn.SentinelReturn;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SentinelController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @SentinelResource(value = "resource", blockHandler = "fallbackTesta")
    public String testA() {
        return "testA";
    }

    public String fallbackTesta(BlockException e) {
        return this.getClass().getName() + "不可用" + e.getMessage();
    }


    @RequestMapping(value = "/testb", method = RequestMethod.GET)
    @SentinelResource(value = "testb",
                      blockHandlerClass = SentinelReturn.class //指定提示的类
                     ,blockHandler = "testB") //指定提示的方法
    public String testB() throws InterruptedException {
        Thread.sleep(1000);
        return "testB";
    }
}
