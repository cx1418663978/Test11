package com.hy.ssm.action;

import com.hy.ssm.bean.Timequantums;
import com.hy.ssm.bean.Venues;
import com.hy.ssm.servers.TimequantumServers;
import com.hy.ssm.servers.VenuesServers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: VenuesAction
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 16:14
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/venues")
public class VenuesAction {

    @Resource(name="venuesServers")
    public VenuesServers venuesServers;

    public VenuesServers getVenuesServers() {
        return venuesServers;
    }

    public void setVenuesServers(VenuesServers venuesServers) {
        this.venuesServers = venuesServers;
    }

    @Resource(name="timequantumServers")
    public TimequantumServers timequantumServers;

    public TimequantumServers getTimequantumServers() {
        return timequantumServers;
    }

    public void setTimequantumServers(TimequantumServers timequantumServers) {
        this.timequantumServers = timequantumServers;
    }
    /***
    * @Description:  (根据id查询场馆信息)
    * @Param: [vid]
    * @return: com.hy.ssm.bean.Venues
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    @RequestMapping(value = "/queryAllVenuesId.action")
    public ModelAndView queryAllVenuesId(Integer vid , HttpServletRequest request){
        HttpSession session=request.getSession();

        Venues venues=venuesServers.queryAllVenuesId(vid);

        session.setAttribute("venues",venues);

        List<Timequantums> list=timequantumServers.queryAlltimequantum();

        session.setAttribute("list",list);

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("/appointment.jsp");

        return modelAndView;
    }


}
