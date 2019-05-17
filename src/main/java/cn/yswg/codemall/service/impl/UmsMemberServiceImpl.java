package cn.yswg.codemall.service.impl;

import cn.yswg.codemall.common.api.CommonResult;
import cn.yswg.codemall.service.RedisService;
import cn.yswg.codemall.service.UmsMemberService;
import cn.yswg.codemall.common.util.RandomCodeUtils;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther: zch
 * @Date: 2019/5/17 09:34
 * @Description:
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    /**
     * 生成验证码
     *
     * @param telephone
     * @return
     */
    @Override
    public CommonResult generateAuthCode(String telephone) {

        String code = RandomCodeUtils.getNumberCode2Six();
        //验证码绑定手机号并存储到Redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone,code);
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(code, "获取验证码成功");
    }

    /**
     * 对输入的验证码进行校验
     *
     * @param telephone
     * @param authCode
     * @return
     */
    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isBlank(authCode)) {
            return CommonResult.failed("请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return CommonResult.success(null, "验证码校验成功");
        } else {
            return CommonResult.failed("验证码不正确");
        }
    }
}
