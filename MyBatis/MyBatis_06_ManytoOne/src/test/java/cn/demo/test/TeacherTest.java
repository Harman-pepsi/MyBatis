package cn.demo.test;

import cn.demo.mapper.ITeacherMapper;
import cn.demo.pojo.Teacher;
import cn.demo.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname TeacherTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 12:17
 * @Version V1.0.0
 * @Since 1.0
 */
public class TeacherTest {

    @Test
    public void testTeacher(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ITeacherMapper mapper = sqlSession.getMapper(ITeacherMapper.class);
        List<Teacher> teacherAll = mapper.findTeacherAll();
        for (Teacher teacher : teacherAll) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
