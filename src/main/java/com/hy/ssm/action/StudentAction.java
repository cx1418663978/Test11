package com.hy.ssm.action;

import com.hy.ssm.bean.Student;
import com.hy.ssm.servers.StudentServers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: StudentAction
 * @Description :TODO(描述一个这个类的作用)
 * @Author: Xu Xin
 * @Date :2018/9/12 16:08
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/student")
public class StudentAction {

    @Resource(name="studentServers")
    public StudentServers studentServers;

    public StudentServers getStudentServers() {
        return studentServers;
    }

    public void setStudentServers(StudentServers studentServers) {
        this.studentServers = studentServers;
    }

    @RequestMapping(value = "/queryAllStudent.action")
    @ResponseBody
    public List<Student> queryAllStudent(){
        System.out.println("进来了");
        return studentServers.queryAllStudent();
    }
}
