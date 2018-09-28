package com.hy.ssm.mapper;

import com.hy.ssm.bean.Merchant;

import java.util.List;

/**
 * @ClassName: MerchantMapper
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 9:35
 * @Version 1.0
 **/
public interface MerchantMapper {

    /***
    * @Description:  (查询所有商家信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Merchant>
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    public List<Merchant> queryAllMerchant();
}