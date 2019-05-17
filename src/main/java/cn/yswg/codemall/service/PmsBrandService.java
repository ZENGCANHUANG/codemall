package cn.yswg.codemall.service;

import cn.yswg.codemall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Auther: zch
 * @Date: 2019/5/16 08:54
 * @Description:
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
