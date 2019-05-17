package cn.yswg.codemall.service;

import cn.yswg.codemall.common.api.CommonResult;

/**
 * @Auther: zch
 * @Date: 2019/5/17 09:33
 * @Description: 会员管理
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
