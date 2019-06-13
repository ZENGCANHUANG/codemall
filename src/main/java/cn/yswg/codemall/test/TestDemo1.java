package cn.yswg.codemall.test;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zch
 * @Date: 2019/5/16 14:33
 * @Description:
 */
public class TestDemo1 {

    public static void main(String[] args) {
        BeanCopier beanCopier = BeanCopier.create(Azeng.class, Bzeng.class, false);
        BeanCopier beanCopier2 = BeanCopier.create(Bzeng.class, Azeng.class, false);
        BeanCopier beanCopier3 = BeanCopier.create(Bzeng.class, Azeng.class, true);
        /****************情况1**************************/
//        long s1 = System.currentTimeMillis();
//        Azeng a1 = getAzeng();
//        Bzeng b1 = new Bzeng();
//        beanCopier.copy(a1,b1,null);
//        System.out.println("a1: "+JSON.toJSONString(a1, SerializerFeature.WriteMapNullValue));
//        System.out.println("b1: "+JSON.toJSONString(b1, SerializerFeature.WriteMapNullValue));
//        System.out.println("相差："+ (System.currentTimeMillis() - s1));

        /****************情况2**************************/
//        long s2 = System.currentTimeMillis();
//        Bzeng b2 = getBzeng();
//        Azeng a2 = new Azeng();
//        beanCopier2.copy(b2,a2,null);
//        System.out.println("a2: "+ JSON.toJSONString(a2, SerializerFeature.WriteMapNullValue));
//        System.out.println("b2: "+JSON.toJSONString(b2, SerializerFeature.WriteMapNullValue));
//        System.out.println("相差："+ (System.currentTimeMillis() - s2));

        /*******************情况3和BeanUtils.copyProperties比较时间****************************/
        //每个方法调用1000次
//        beanCopierCopy(1000);
//        beanUtilsCopy(1000);

        /*********************情况4 类型不一样，属性名称一样，但是需要进行转换，比如 Date to String ****************************************************************/
        Bzeng b3 = getBzeng();
        Azeng a3 = new Azeng();
        //b3的 aTime 转出 a3的 aTime
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        /**
         * 匿名内部类改成lambda写法 内部类写法参考AccountConvert.class
         */
        beanCopier3.copy(b3, a3, (value,targer,contex)->{
            if (value instanceof Integer) {
                return (Integer) value;
            } else if (value instanceof Date) {
                Date date = (Date) value;
                return sdf.format(date);
            } else if (value instanceof BigDecimal) {
                BigDecimal bd = (BigDecimal) value;
                return bd.toPlainString();
            } else if (value instanceof String) {
                return "" + value;
            }
            return null;
        });
        System.out.println("a3: "+ JSON.toJSONString(a3));
        System.out.println("b3: "+JSON.toJSONString(b3));
    }


    /**
     * 循环调用BeanCopier copy方法
     * @param num
     */
    private static void beanCopierCopy(int num){
        long s1 = System.currentTimeMillis();
        BeanCopier beanCopier = BeanCopier.create(Azeng.class, Bzeng.class, false);
        for (int i = 0; i < num; i++) {
            Azeng a = getAzeng();
            Bzeng b = new Bzeng();
            beanCopier.copy(a,b,null);
        }
        System.out.println("相差："+ (System.currentTimeMillis() - s1));
    }


    /**
     * 循环调用BeanUtils copy方法
     * @param num
     */
    private static void beanUtilsCopy(int num){
        long s1 = System.currentTimeMillis();
        BeanCopier beanCopier = BeanCopier.create(Azeng.class, Bzeng.class, false);
        for (int i = 0; i < num; i++) {
            Azeng a = getAzeng();
            Bzeng b = new Bzeng();
            BeanUtils.copyProperties(a,b);
        }
        System.out.println("相差："+ (System.currentTimeMillis() - s1));
    }



    private static Azeng getAzeng(){
        return Azeng.builder().age(1).id("1").name("曾灿煌").remark("呵呵").build();
    }

    private static Bzeng getBzeng(){
        return Bzeng.builder().aTime(new Date()).id("123").name("逼仔").build();
    }
}
