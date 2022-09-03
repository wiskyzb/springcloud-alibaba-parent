package cn.tedu.test.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "springcloud-sentinel-rpc-provider",fallback = RpcTestOpenfeignExcp.class)
public interface RpcTestOpenfegin {

    @GetMapping("/test/test")
    public String getTest();
}
