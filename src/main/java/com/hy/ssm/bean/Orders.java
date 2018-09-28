package com.hy.ssm.bean;

import java.util.Date;

public class Orders {
    private Integer oid;

    private String oname;

    private String osite;

    private Date odate;

    private String oparticulars;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOsite() {
        return osite;
    }

    public void setOsite(String osite) {
        this.osite = osite == null ? null : osite.trim();
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public String getOparticulars() {
        return oparticulars;
    }

    public void setOparticulars(String oparticulars) {
        this.oparticulars = oparticulars == null ? null : oparticulars.trim();
    }
}