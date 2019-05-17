package cn.yswg.codemall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zch
 * @Date: 2019/5/16 08:42
 * @Description: MyBatis配置类
 */

@Configuration
@MapperScan("cn.yswg.codemall.mbg.mapper")
public class MyBatisConfig {
}
