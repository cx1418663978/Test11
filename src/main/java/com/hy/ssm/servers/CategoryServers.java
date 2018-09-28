package com.hy.ssm.servers;

import com.hy.ssm.bean.Category;
import com.hy.ssm.bean.Venues;
import com.hy.ssm.mapper.CategoryMapper;
import com.hy.ssm.servers.Imp.ICategoryServers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CategoryServers
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/17 11:33
 * @Version 1.0
 **/
@Service(value = "categoryServers")
@Transactional
public class CategoryServers implements ICategoryServers {

    @Resource(name = "categoryMapper")
    public CategoryMapper categoryMapper;

    public CategoryMapper getCategoryMapper() {
        return categoryMapper;
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    /***
    * @Description:  (查询场馆类别所有信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Category>
    * @Author: Mr.Cui
    * @Date: 2018/9/17
    */
    public List<Category> queryAllCategory() {
        return categoryMapper.queryAllCategory();
    }
    /***
    * @Description:  (根据类别id查询所属场馆信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Venues>
    * @Author: Mr.Cui
    * @Date: 2018/9/19
    */
    public List<Venues> queryAllCategoryId(Integer id) {
        return categoryMapper.queryAllCategoryId(id);
    }
}
