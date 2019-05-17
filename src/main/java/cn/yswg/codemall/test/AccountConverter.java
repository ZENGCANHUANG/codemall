package cn.yswg.codemall.test;

import org.springframework.cglib.core.Converter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @Auther: zch
 * @Date: 2019/5/16 15:32
 * @Description:
 */
public class AccountConverter implements Converter {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Object convert(Object value, Class aClass, Object o1) {
        if (value instanceof Integer) {
            return (Integer) value;
        } else if (value instanceof Timestamp) {
            Timestamp date = (Timestamp) value;
            return sdf.format(date);
        } else if (value instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal) value;
            return bd.toPlainString();
        }
        return null;
    }
}
