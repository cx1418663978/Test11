package com.hy.ssm.servers.Imp;

import com.hy.ssm.bean.Venues;

/**
 * @ClassName: IVenuesServers
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 16:11
 * @Version 1.0
 **/
public interface IVenuesServers {

    /***
    * @Description:  (根据id查询场馆信息)
    * @Param: [vid]
    * @return: com.hy.ssm.bean.Venues
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    public Venues queryAllVenuesId(Integer vid);
}
