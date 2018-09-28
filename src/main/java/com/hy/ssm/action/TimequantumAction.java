package com.hy.ssm.action;

import com.hy.ssm.bean.Timequantums;
import com.hy.ssm.servers.TimequantumServers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: TimequantumAction
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/19 15:26
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/timequantum")
public class TimequantumAction {

    @Resource(name="timequantumServers")
    public TimequantumServers timequantumServers;

    public TimequantumServers getTimequantumServers() {
        return timequantumServers;
    }

    public void setTimequantumServers(TimequantumServers timequantumServers) {
        this.timequantumServers = timequantumServers;
    }
    /***
    * @Description:  (查询所有时间断段表的所有信息)
    * @Param: []
    * @return: java.lang.String
    * @Author: Mr.Cui
    * @Date: 2018/9/19
    */
    @RequestMapping(value = "/queryAllTimequantumServers.action")
    @ResponseBody
    public String queryAllTimequantumServers(HttpServletRequest request){
        HttpSession session=request.getSession();

        List<Timequantums> list=timequantumServers.queryAlltimequantum();

        session.setAttribute("list",list);

        return null;
    }
}
