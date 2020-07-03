package cn.demo.mapper;

import cn.demo.pojo.Employer;

import java.util.List;
import java.util.Map;

/**
 * @Classname IEmployerMapper
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 2:00
 * @Version V1.0.0
 * @Since 1.0
 */
public interface IEmployerMapper {
    List<Employer> findEmployerAll();
    List<Employer> findEmployerByCondition(Map<String,Object> conditionMap);
    int insertEmployer(Employer employer);
}
