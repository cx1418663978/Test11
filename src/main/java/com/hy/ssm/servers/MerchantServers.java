package com.hy.ssm.servers;

import com.hy.ssm.bean.Merchant;
import com.hy.ssm.mapper.MerchantMapper;
import com.hy.ssm.servers.Imp.IMerchantServers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: MerchantServers
 * @Description :TODO(描述一个这个类的作用)
 * @Author: 崔鑫
 * @Date :2018/9/18 9:47
 * @Version 1.0
 **/
@Service(value = "merchantServers")
@Transactional
public class MerchantServers implements IMerchantServers {

    @Resource(name = "merchantMapper")
    public MerchantMapper merchantMapper;

    public MerchantMapper getMerchantMapper() {
        return merchantMapper;
    }

    public void setMerchantMapper(MerchantMapper merchantMapper) {
        this.merchantMapper = merchantMapper;
    }

    /***
    * @Description:  (查询所有商家信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Merchant>
    * @Author: Mr.Cui
    * @Date: 2018/9/18
    */
    public List<Merchant> queryAllMerchant() {
        return merchantMapper.queryAllMerchant();
    }
}
