package cn.yswg.codemall.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UmsAdminLoginParam {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    @NotEmpty(message = "密码不能为空")
    private String password;


}
