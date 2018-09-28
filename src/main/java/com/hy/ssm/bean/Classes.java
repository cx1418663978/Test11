package com.hy.ssm.bean;

import java.util.List;

/**
 * @ClassName: Classes
 * @Description :TODO(描述一个这个类的作用)
 * @Author: Xu Xin
 * @Date :2018/9/10 16:52
 * @Version 1.0
 **/
public class Classes {

    private Integer cId;
    private String cName;
    private List<Student> list;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}
