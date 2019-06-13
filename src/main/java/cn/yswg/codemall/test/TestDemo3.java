package cn.yswg.codemall.test;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: zch
 * @Date: 2019/5/22 10:17
 * @Description:
 */
public class TestDemo3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "1", "3", "4", "5");
        Set<String> sets = new HashSet<>(strings);
        System.out.println(JSON.toJSONString(sets));
    }
}
