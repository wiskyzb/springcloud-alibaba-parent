package cn.tedu.test.controller;

import cn.tedu.test.rpc.RpcTestOpenfegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RpcTestOpenfegin rpcTestOpenfegin;

    @RequestMapping("/test")
    public String getTest(){
        return rpcTestOpenfegin.getTest()+"测试";
    }

}
