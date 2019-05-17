package cn.yswg.codemall.bolang;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PageReqVo {

    @JSONField(serialize = false)
	protected Integer start = 0;

	/**
	 * 条数
	 */
    @JSONField(serialize = false)
	protected Integer limit = 20;

	/**
	 * 页码
	 */
    @JSONField(serialize = false)
	protected Integer pageNum = 1;


	public Integer getStart() {
		return (pageNum - 1) * limit;
	}



}
