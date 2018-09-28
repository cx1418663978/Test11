package com.hy.ssm.servers.Imp;

import com.hy.ssm.bean.Category;
import com.hy.ssm.bean.Venues;

import java.util.List;

/**
 * @ClassName: ICategoryServers
 * @Description :TODO(Servers场馆接口)
 * @Author: 崔鑫
 * @Date :2018/9/17 11:35
 * @Version 1.0
 **/
public interface ICategoryServers {

    /***
    * @Description:  (描述一个这个方法的作用)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Category>
    * @Author: Mr.Cui
    * @Date: 2018/9/17
    */
    public List<Category> queryAllCategory();
    /***
    * @Description:  (根据类别id查询所属场馆信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Venues>
    * @Author: Mr.Cui
    * @Date: 2018/9/19
    */
    public List<Venues> queryAllCategoryId(Integer id);
}