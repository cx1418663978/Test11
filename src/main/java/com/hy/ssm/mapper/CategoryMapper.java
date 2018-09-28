package com.hy.ssm.mapper;

import com.hy.ssm.bean.Category;
import com.hy.ssm.bean.Venues;

import java.util.List;

/**
 * @ClassName: CategoryMapper
 * @Description :TODO(场馆类别)
 * @Author: 崔鑫
 * @Date :2018/9/17 9:52
 * @Version 1.0
 **/
public interface CategoryMapper {

    /***
    * @Description:  (查询所有的场馆类别)
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
