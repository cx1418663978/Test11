package com.hy.ssm.bean;

/**
 * @ClassName: Student
 * @Description :TODO(描述一个这个类的作用)
 * @Author: Xu Xin
 * @Date :2018/9/10 16:50
 * @Version 1.0
 **/
public class Student {

    private Integer sId;
    private String sName;
    private String sSex;
    private Integer sAge;
    private Integer cId;
    private Classes classes;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
