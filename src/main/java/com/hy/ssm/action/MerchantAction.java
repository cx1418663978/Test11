package com.hy.ssm.action;

import com.alibaba.fastjson.JSON;
import com.hy.ssm.bean.LayTable;
import com.hy.ssm.bean.Merchant;
import com.hy.ssm.servers.MerchantServers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @ClassName: Merchant
 * @Description :TODO(商家)
 * @Author: 崔鑫
 * @Date :2018/9/18 9:54
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/merchant")
public class MerchantAction {

    @Resource(name="merchantServers")
    public MerchantServers merchantServers;

    public MerchantServers getMerchantServers() {
        return merchantServers;
    }

    public void setMerchantServers(MerchantServers merchantServers) {
        this.merchantServers = merchantServers;
    }

    /***
    * @Description:  (查询所有商家信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Merchant>
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    @RequestMapping(value = "/queryAllMerchant.action")
    @ResponseBody
    public String queryAllMerchant(HttpServletResponse resp,Integer limit,Integer page ) throws IOException {
        resp.setContentType("text/plain;charset=utf-8");

        List<Merchant>list=merchantServers.queryAllMerchant();

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
