package com.yiliu.sth.service;

import com.yiliu.sth.entity.UserAccountInfo;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * User service
 *
 */
public interface UserService {

    //获取所有账户信息
    @Cacheable(cacheNames = {"info"})
    List<UserAccountInfo> getAcList();

    //修改密码
    void alterPasswd(String accountId,String oldPasswd,String newPasswd);

}
