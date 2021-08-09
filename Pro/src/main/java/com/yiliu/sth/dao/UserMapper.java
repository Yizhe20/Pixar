package com.yiliu.sth.dao;

import com.yiliu.sth.entity.UserAccountInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User's Information
 *
 */
@Mapper
public interface UserMapper {

    //获取所有账户信息
    List<UserAccountInfo> getAccountList();

    //根据用户名和旧密码更改密码
    void alterPasswd(@Param("id") String accountId,
                     @Param("old") String oldPasswd,
                     @Param("new") String newPasswd);

    //根据用户名删除用户
    void deleteAccount(String accountId);
}
