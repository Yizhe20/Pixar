package com.yiliu.sth.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * Get user's account information for sign in~~
 *
 */
@Data
@Repository
public class UserAccountInfo {

    //唯一标识
    private String uuid;
    //账号
    private String account;
    //密码
    private String passwd;
}
