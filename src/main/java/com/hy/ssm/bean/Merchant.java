package com.hy.ssm.bean;

/**
 * @ClassName: Merchant
 * @Description :TODO(商家)
 * @Author: Xu Xin
 * @Date :2018/9/17 9:34
 * @Version 1.0
 **/
public class Merchant {
    private Integer mid;

    private String mname;

    private String msite;

    private String mphone;

    private Float mprice;

    private Integer vid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMsite() {
        return msite;
    }

    public void setMsite(String msite) {
        this.msite = msite == null ? null : msite.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public Float getMprice() {
        return mprice;
    }

    public void setMprice(Float mprice) {
        this.mprice = mprice;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}