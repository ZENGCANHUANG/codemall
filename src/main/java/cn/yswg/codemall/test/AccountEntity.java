package cn.yswg.codemall.test;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Auther: zch
 * @Date: 2019/5/16 15:30
 * @Description:
 */
@Data
public class AccountEntity {
    private int id;
    private Timestamp createTime;
    private BigDecimal balance;
}
