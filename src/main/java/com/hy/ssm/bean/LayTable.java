package com.hy.ssm.bean;

import java.util.List;

/**
 * @ClassName: LayTable
 * @Description :TODO(layui)
 * @Author: 崔鑫
 * @Date :2018/9/18 10:59
 * @Version 1.0
 **/
public class LayTable {

    private Integer code;
    private String msg;
    private Integer count;
    private List<?> data;

    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
