package com.hy.ssm.mapper;

import com.hy.ssm.bean.Venues;

/**
 * @ClassName: VenuesMapper
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 16:05
 * @Version 1.0
 **/
public interface VenuesMapper {

    /***
    * @Description:  (根据id查询场馆信息)
    * @Param: [vid]
    * @return: com.hy.ssm.bean.Venues
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    public Venues queryAllVenuesMapperId(Integer vid);
}
