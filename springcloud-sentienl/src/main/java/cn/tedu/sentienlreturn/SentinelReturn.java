package cn.tedu.sentienlreturn;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class SentinelReturn {

    public static String testA(BlockException e){
        return "自定义返回值提示";
    }
    public static String testB(BlockException e){
        return "自定义返回值提示";
    }
}
