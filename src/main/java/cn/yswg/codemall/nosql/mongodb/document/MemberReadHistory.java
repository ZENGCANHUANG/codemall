package cn.yswg.codemall.nosql.mongodb.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Auther: zch
 * @Date: 2019/6/13 15:45
 * @Description: 用户商品浏览历史记录
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberReadHistory {


    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;

}
