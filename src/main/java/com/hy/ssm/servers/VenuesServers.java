package com.hy.ssm.servers;

import com.hy.ssm.bean.Venues;
import com.hy.ssm.mapper.VenuesMapper;
import com.hy.ssm.servers.Imp.IVenuesServers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName: VenuesServers
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 16:12
 * @Version 1.0
 **/
@Service(value = "venuesServers")
@Transactional
public class VenuesServers implements IVenuesServers {

    @Resource(name = "venuesMapper")
    public VenuesMapper venuesMapper;

    public VenuesMapper getVenuesMapper() {
        return venuesMapper;
    }

    public void setVenuesMapper(VenuesMapper venuesMapper) {
        this.venuesMapper = venuesMapper;
    }

    /***
    * @Description:  (根据id查询场馆信息)
    * @Param: [vid]
    * @return: com.hy.ssm.bean.Venues
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    public Venues queryAllVenuesId(Integer vid) {
        return venuesMapper.queryAllVenuesMapperId(vid);
    }
}
