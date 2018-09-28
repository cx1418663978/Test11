package com.hy.ssm.mapper;

import com.hy.ssm.bean.Student;

import java.util.List;

public interface StudentMapper {

    /***
    * @Description:  (查询学生信息)
    * @Param: []
    * @return: java.util.List<com.hy.ssm.bean.Student>
    * @Author: Mr.Cui
    * @Date: 2018/9/12
    */
    public List<Student> queryAllStudent();
}
