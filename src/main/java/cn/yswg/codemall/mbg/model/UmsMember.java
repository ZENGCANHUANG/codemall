package cn.yswg.codemall.mbg.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* 会员表(ums_member)
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsMember implements Serializable {
    /**
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Column:    member_level_id
     * Nullable:  true
     */
    private Long memberLevelId;

    /**
     * 用户名
     *
     * Column:    username
     * Nullable:  true
     */
    private String username;

    /**
     * 密码
     *
     * Column:    password
     * Nullable:  true
     */
    private String password;

    /**
     * 昵称
     *
     * Column:    nickname
     * Nullable:  true
     */
    private String nickname;

    /**
     * 手机号码
     *
     * Column:    phone
     * Nullable:  true
     */
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     *
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 注册时间
     *
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 头像
     *
     * Column:    icon
     * Nullable:  true
     */
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     *
     * Column:    gender
     * Nullable:  true
     */
    private Integer gender;

    /**
     * 生日
     *
     * Column:    birthday
     * Nullable:  true
     */
    private Date birthday;

    /**
     * 所做城市
     *
     * Column:    city
     * Nullable:  true
     */
    private String city;

    /**
     * 职业
     *
     * Column:    job
     * Nullable:  true
     */
    private String job;

    /**
     * 个性签名
     *
     * Column:    personalized_signature
     * Nullable:  true
     */
    private String personalizedSignature;

    /**
     * 用户来源
     *
     * Column:    source_type
     * Nullable:  true
     */
    private Integer sourceType;

    /**
     * 积分
     *
     * Column:    integration
     * Nullable:  true
     */
    private Integer integration;

    /**
     * 成长值
     *
     * Column:    growth
     * Nullable:  true
     */
    private Integer growth;

    /**
     * 剩余抽奖次数
     *
     * Column:    luckey_count
     * Nullable:  true
     */
    private Integer luckeyCount;

    /**
     * 历史积分数量
     *
     * Column:    history_integration
     * Nullable:  true
     */
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}