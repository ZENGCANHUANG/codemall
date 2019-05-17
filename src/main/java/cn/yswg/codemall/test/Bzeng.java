package cn.yswg.codemall.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: zch
 * @Date: 2019/5/16 14:32
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bzeng {

    private String id;
    private String name;

  //  @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date aTime;

    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;
    private BigDecimal d;
    private BigDecimal e;
    private BigDecimal f;
    private BigDecimal g;
    private BigDecimal h;
    private BigDecimal i;
    private BigDecimal j;
    private BigDecimal k;
}
