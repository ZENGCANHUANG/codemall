package cn.yswg.codemall.common.util;

import java.util.Random;

/**
 * @Auther: zch
 * @Date: 2019/5/17 10:01
 * @Description: 随机码工具类
 */
public class RandomCodeUtils {

    /**
     * 获取6位数字随机数
     * @return
     */
    public static String getNumberCode2Six() {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
