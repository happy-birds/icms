package com.happybirds.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.happybirds.domain.User;

/**
 * Created by Administrator on 2017/1/9.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);
}
