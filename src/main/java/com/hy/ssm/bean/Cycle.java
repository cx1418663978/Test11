package com.hy.ssm.bean;

import java.util.Date;

/**
 * @ClassName: Cycle
 * @Description :TODO(周期)
 * @Author: Xu Xin
 * @Date :2018/9/17 9:36
 * @Version 1.0
 **/
public class Cycle {
    private Integer cid;

    private Date time;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}