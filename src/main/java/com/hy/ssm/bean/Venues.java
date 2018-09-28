package com.hy.ssm.bean;

/**
 * @ClassName: Venues
 * @Description :TODO(场馆)
 * @Author: Xu Xin
 * @Date :2018/9/17 9:35
 * @Version 1.0
 **/
public class Venues {
    private Integer vid;

    private String vname;

    private String vsite;

    private String vtexture;

    private String vresult;

    private Integer vhigh;

    private Integer pid;

    private Integer cid;

    private String vphone;

    private String vimg;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVsite() {
        return vsite;
    }

    public void setVsite(String vsite) {
        this.vsite = vsite == null ? null : vsite.trim();
    }

    public String getVtexture() {
        return vtexture;
    }

    public void setVtexture(String vtexture) {
        this.vtexture = vtexture == null ? null : vtexture.trim();
    }

    public String getVresult() {
        return vresult;
    }

    public void setVresult(String vresult) {
        this.vresult = vresult == null ? null : vresult.trim();
    }

    public Integer getVhigh() {
        return vhigh;
    }

    public void setVhigh(Integer vhigh) {
        this.vhigh = vhigh;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getVphone() {
        return vphone;
    }

    public void setVphone(String vphone) {
        this.vphone = vphone;
    }

    public String getVimg() {
        return vimg;
    }

    public void setVimg(String vimg) {
        this.vimg = vimg;
    }
}