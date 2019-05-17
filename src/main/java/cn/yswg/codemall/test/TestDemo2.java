package cn.yswg.codemall.test;

import com.alibaba.fastjson.JSON;
import org.springframework.cglib.beans.BeanCopier;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Auther: zch
 * @Date: 2019/5/16 15:31
 * @Description:
 */
public class TestDemo2 {
    public static void main(String[] args) {
//        AccountEntity po = new AccountEntity();
//        po.setId(1);
//        po.setCreateTime(new Timestamp(10043143243L));
//        po.setBalance(BigDecimal.valueOf(4000L));
//        BeanCopier copier = BeanCopier.create(AccountEntity.class, AccountDto.class, false);
//        AccountDto dto = new AccountDto();
//        copier.copy(po, dto, null);


        /*********使用conver**************/
        AccountEntity po = new AccountEntity();
        po.setId(1);
        po.setCreateTime(Timestamp.valueOf("2014-04-12 16:16:15"));
        po.setBalance(BigDecimal.valueOf(4000L));
        BeanCopier copier = BeanCopier.create(AccountEntity.class, AccountDto.class, true);
        AccountConverter converter = new AccountConverter();
        AccountDto dto = new AccountDto();
        copier.copy(po, dto, converter);

        System.out.println("po: "+JSON.toJSONString(po));
        System.out.println("dto: "+JSON.toJSONString(dto));



    }
}
