package com.hy.ssm.bean;

/**
 * @ClassName: Category
 * @Description :TODO(场馆类别)
 * @Author: Xu Xin
 * @Date :2018/9/17 9:32
 * @Version 1.0
 **/
public class Category {
    private Integer cid;

    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}