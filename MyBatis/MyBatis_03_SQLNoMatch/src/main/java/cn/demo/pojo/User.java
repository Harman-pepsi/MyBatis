package cn.demo.pojo;

/**
 * @Classname User
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 16:47
 * @Version V1.0.0
 * @Since 1.0
 */
public class User {
    private Integer uid;
    private String username;
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{\"User\":{"
                + "\"uid\":\"" + uid + "\""
                + ", \"username\":\"" + username + "\""
                + ", \"password\":\"" + password + "\""
                + "}}";
    }
}
