package cn.yswg.codemall.service.impl;

import cn.yswg.codemall.service.UmsMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UmsMemberServiceImplTest {

    @Autowired
    private UmsMemberService memberService;


    @Test
    public void generateAuthCode() {
        System.out.println( memberService.generateAuthCode("10086"));
    }


    @Test
    public void verifyAuthCode() {
        String tel = "10086";
        String authCode = "473628";
        System.out.println(memberService.verifyAuthCode(tel,authCode));
    }
}