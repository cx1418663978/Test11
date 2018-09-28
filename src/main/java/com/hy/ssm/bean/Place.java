package com.hy.ssm.bean;

/**
 * @ClassName: Place
 * @Description :TODO(场地)
 * @Author: Xu Xin
 * @Date :2018/9/17 9:35
 * @Version 1.0
 **/
public class Place {
    private Integer pid;

    private String pname;

    private Integer panumberof;

    private Integer pstate;

    private Integer cid;

    private Integer tid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPanumberof() {
        return panumberof;
    }

    public void setPanumberof(Integer panumberof) {
        this.panumberof = panumberof;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}