package cn.cqucc.library.service.student.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JianfeiChen
 * @date 2020/4/6 10:50
 * @Description cn.cqucc.library.service.student.dao
 */
@Mapper
public interface ICKStudentDAO {
    int isExist(@Param(value = "account")String account, @Param(value = "password") String password);
}