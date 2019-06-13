package cn.yswg.codemall.controller;

import cn.yswg.codemall.common.api.CommonResult;
import cn.yswg.codemall.nosql.mongodb.document.MemberReadHistory;
import cn.yswg.codemall.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: zch
 * @Date: 2019/6/13 16:10
 * @Description:
 */
@Controller
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {


    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    /**
     * 创建浏览记录
     * @param memberReadHistory
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory){
        int count = memberReadHistoryService.create(memberReadHistory);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    /**
     * 删除浏览记录
     * @param ids
     * @return
     */
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids")List<String> ids){
        int count = memberReadHistoryService.delete(ids);
        if(count > 0 ){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * 展示浏览记录
     * @param memberId
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberReadHistory>> list(Long memberId){
        System.out.println("---------进来啊------------");
        System.out.println("---------进来啊------------");
        System.out.println("---------进来啊------------");
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return CommonResult.success(memberReadHistoryList);
    }


}
