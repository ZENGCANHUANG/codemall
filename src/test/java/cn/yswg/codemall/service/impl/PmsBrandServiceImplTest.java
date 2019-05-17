package cn.yswg.codemall.service.impl;

import cn.yswg.codemall.mbg.model.PmsBrand;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PmsBrandServiceImplTest {

    @Autowired
    private PmsBrandServiceImpl brandService;

    @Test
    public void listAllBrand() {
        List<PmsBrand> pmsBrands = brandService.listAllBrand();
        System.out.println(JSON.toJSONString(pmsBrands));
    }
}