package com.baomidou.springmvc.mapper.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.common.SuperMapper;
import com.baomidou.springmvc.model.system.User;
import org.apache.ibatis.annotations.Param;

import java.sql.Wrapper;
import java.util.List;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends SuperMapper<User> {

    List<User> getUserList(@Param("page") Page<User> page, @Param("wrapper") Wrapper wrapper);
}
