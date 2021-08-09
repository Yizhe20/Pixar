package com.yiliu.sth.service.impl;

import com.yiliu.sth.dao.UserMapper;
import com.yiliu.sth.entity.UserAccountInfo;
import com.yiliu.sth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Impl
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 获取所有账号信息
     * @return  List
     */
    @Override
    public List<UserAccountInfo> getAcList() {
        return userMapper.getAccountList();
    }

    /**
     * 更改密码
     * @param accountId  账号
     * @param oldPasswd  原密码
     * @param newPasswd  修改后密码
     */
    @Override
    public void alterPasswd(String accountId, String oldPasswd, String newPasswd) {
        userMapper.alterPasswd(accountId,oldPasswd,newPasswd);
    }


}
