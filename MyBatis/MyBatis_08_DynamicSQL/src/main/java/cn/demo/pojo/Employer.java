package cn.demo.pojo;

import java.util.Date;

/**
 * @Classname Employer
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 1:56
 * @Version V1.0.0
 * @Since 1.0
 */
public class Employer {
    private String id;
    private String name;
    private String gender;
    private Integer age;
    private Date intime;
    private Double wages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Double getWages() {
        return wages;
    }

    public void setWages(Double wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "{\"Employer\":{"
                + "\"id\":\"" + id + "\""
                + ", \"name\":\"" + name + "\""
                + ", \"gender\":\"" + gender + "\""
                + ", \"age\":\"" + age + "\""
                + ", \"intime\":" + intime
                + ", \"wages\":\"" + wages + "\""
                + "}}";
    }
}
