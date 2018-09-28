package com.hy.ssm.servers;

import com.hy.ssm.bean.Student;
import com.hy.ssm.mapper.StudentMapper;
import com.hy.ssm.servers.Imp.IStudentServers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: StudentServers
 * @Description :TODO(描述一个这个类的作用)
 * @Author: Xu Xin
 * @Date :2018/9/12 15:25
 * @Version 1.0
 **/
@Service(value = "studentServers")
@Transactional
public class StudentServers implements IStudentServers {

    @Resource(name = "studentMapper")
    public StudentMapper studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    /***
    * @Description:  (查询学生信息)
    * @Param: []
    * @return: java.util.List<java.lang.Object>
    * @Author: Mr.Cui
    * @Date: 2018/9/12
    */
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

}
