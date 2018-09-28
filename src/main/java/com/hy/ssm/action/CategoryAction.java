package com.hy.ssm.action;

import com.alibaba.fastjson.JSON;
import com.hy.ssm.bean.Category;
import com.hy.ssm.bean.LayTable;
import com.hy.ssm.bean.Venues;
import com.hy.ssm.servers.CategoryServers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @ClassName: CategoryAction
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/17 11:41
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/category")
public class CategoryAction {

    @Resource(name="categoryServers")
    public CategoryServers categoryServers;

    public CategoryServers getCategoryServers() {
        return categoryServers;
    }

    public void setCategoryServers(CategoryServers categoryServers) {
        this.categoryServers = categoryServers;
    }

    @RequestMapping(value = "/queryAllCategory.action")
    @ResponseBody
    public List<Category> queryAllCategory() {
        return categoryServers.queryAllCategory();
    }

    @RequestMapping(value = "/queryAllVenuesId.action")
    @ResponseBody
    public String queryAllVenuesId(Integer id, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain;charset=utf-8");
        List<Venues> list=categoryServers.queryAllCategoryId(20180101);

        LayTable layTable=new LayTable();
        layTable.setCode(0);
        layTable.setMsg("");
        layTable.setCode(0);
        layTable.setData(list);

        PrintWriter out=resp.getWriter();

        String json= JSON.toJSONString(layTable);

        out.write(json);
        return null;
    }
}
