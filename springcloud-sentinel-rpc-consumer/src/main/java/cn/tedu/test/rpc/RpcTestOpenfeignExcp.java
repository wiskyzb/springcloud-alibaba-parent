package cn.tedu.test.rpc;

import org.springframework.stereotype.Component;
@Component
public class RpcTestOpenfeignExcp implements RpcTestOpenfegin {
    @Override
    public String getTest() {
        return "md报错了,垃圾接口";
    }
}
