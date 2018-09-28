package com.hy.ssm.servers.Imp;

import com.hy.ssm.bean.Timequantums;

import java.util.List;

/**
 * @ClassName: ICategoryServers
 * @Description :TODO(Servers场馆接口)
 * @Author: 崔鑫
 * @Date :2018/9/17 11:35
 * @Version 1.0
 **/
public interface ITimequantumServers {

    /***
    * @Description:  (查询所有时间段表的所有时间)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Timequantums>
    * @Author: Mr.Cui
    * @Date: 2018/9/19
    */
    public List<Timequantums> queryAlltimequantum();

}