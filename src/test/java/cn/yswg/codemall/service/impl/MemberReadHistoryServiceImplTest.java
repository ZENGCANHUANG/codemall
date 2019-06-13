package cn.yswg.codemall.service.impl;

import cn.yswg.codemall.nosql.mongodb.document.MemberReadHistory;
import cn.yswg.codemall.service.MemberReadHistoryService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberReadHistoryServiceImplTest {

    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @Test
    public void create() {
        MemberReadHistory memberReadHistory = MemberReadHistory.builder().memberIcon("123").memberId(123L).memberNickname("第一个")
                .productId(123L).productName("airpods2").productPic("123").productPrice("1000").productSubTitle("无线蓝牙")
                .createTime(new Date()).build();
        System.out.println(JSON.toJSONString(memberReadHistory));
        try {
            memberReadHistoryService.create(memberReadHistory);
        }catch (Exception e) {
            System.out.println("挂。。。");
        }
    }

    @Test
    public void delete() {
    }

    @Test
    public void list() {
        List<MemberReadHistory> list = memberReadHistoryService.list(123L);
        System.out.println(JSON.toJSONString(list));
    }
}