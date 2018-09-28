package com.hy.ssm.servers;

import com.hy.ssm.bean.Timequantums;
import com.hy.ssm.mapper.TimequantumMapper;
import com.hy.ssm.servers.Imp.ITimequantumServers;
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
@Service(value = "timequantumServers")
@Transactional
public class TimequantumServers implements ITimequantumServers {

    @Resource(name = "timequantumMapper")
    public TimequantumMapper timequantumMapper;

    public TimequantumMapper getTimequantumMapper() {
        return timequantumMapper;
    }

    public void setTimequantumMapper(TimequantumMapper timequantumMapper) {
        this.timequantumMapper = timequantumMapper;
    }
    /***
    * @Description:  (查询所有的时间表的所有信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Timequantums>
    * @Author: Mr.Cui
    * @Date: 2018/9/19
    */
    public List<Timequantums> queryAlltimequantum() {
        return timequantumMapper.queryAlltimequantum();
    }
}

