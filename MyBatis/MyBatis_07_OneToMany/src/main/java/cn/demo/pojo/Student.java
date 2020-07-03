package cn.demo.pojo;

/**
 * @Classname Student
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 17:58
 * @Version V1.0.0
 * @Since 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer tid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "{\"Student\":{"
                + "\"sid\":\"" + sid + "\""
                + ", \"sname\":\"" + sname + "\""
                + ", \"tid\":\"" + tid + "\""
                + "}}";
    }
}
