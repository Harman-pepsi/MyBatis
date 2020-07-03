package cn.demo.pojo;

import java.util.List;

/**
 * @Classname Teacher
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 18:15
 * @Version V1.0.0
 * @Since 1.0
 */
public class Teacher {
    private Integer tid;
    private String tname;

    private List<Student> studentList;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "{\"Teacher\":{"
                + "\"tid\":\"" + tid + "\""
                + ", \"tname\":\"" + tname + "\""
                + ", \"studentList\":" + studentList
                + "}}";
    }
}
