package cn.demo.pojo;

/**
 * @Classname User
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 22:12
 * @Version V1.0.0
 * @Since 1.0
 */
public class User {
    private Integer uid;
    private String name;
    private String pwd;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "{\"User\":{"
                + "\"uid\":\"" + uid + "\""
                + ", \"name\":\"" + name + "\""
                + ", \"pwd\":\"" + pwd + "\""
                + "}}";
    }
}
