package cn.demo.pojo;

/**
 * @Classname Teacher
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 11:10
 * @Version V1.0.0
 * @Since 1.0
 */
public class Teacher {
   private Integer id;
   private String username;

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

    @Override
    public String toString() {
        return "{\"Teacher\":{"
                + "\"id\":\"" + id + "\""
                + ", \"username\":\"" + username + "\""
                + "}}";
    }
}
