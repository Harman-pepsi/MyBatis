package cn.demo.pojo;

/**
 * @Classname Student
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 11:12
 * @Version V1.0.0
 * @Since 1.0
 */
public class Student {
   private Integer id;
   private String username;
   private Integer tid;

   private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "{\"Student\":{"
                + "\"id\":\"" + id + "\""
                + ", \"username\":\"" + username + "\""
                + ", \"tid\":\"" + tid + "\""
                + ", \"teacher\":" + teacher
                + "}}";
    }
}
