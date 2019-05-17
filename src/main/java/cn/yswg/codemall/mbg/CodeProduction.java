package cn.yswg.codemall.mbg;

import cn.yswg.codemall.mbg.mapper.UmsAdminMapper;
import cn.yswg.codeproduction.module.mybatisgenerator.MyGenerator;
import cn.yswg.codeproduction.module.servicepoet.MyPoetBuild;

/**
 * @Auther: zch
 * @Date: 2019/5/16 16:13
 * @Description: 代码生成
 */
public class CodeProduction {

    public static void main(String[] args) throws Exception{
        //逆向工程
        MyGenerator.doGenerator("/generatorConfig.xml");
        //生产service
        MyPoetBuild.doBuild(UmsAdminMapper.class,"cn.yswg.codemall.service");
    }
}
