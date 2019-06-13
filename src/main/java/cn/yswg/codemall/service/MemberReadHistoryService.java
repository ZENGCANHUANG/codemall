package cn.yswg.codemall.service;

import cn.yswg.codemall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Auther: zch
 * @Date: 2019/6/13 15:51
 * @Description:
 */
public interface MemberReadHistoryService {

    /**
     * 生产浏览记录
     * @param memberReadHistory
     * @return
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> list(Long memberId);
}
