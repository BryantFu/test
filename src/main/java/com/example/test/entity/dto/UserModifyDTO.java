package com.example.test.entity.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModifyDTO {

    private Long userId;

    private String userName;

    private String account;

    private String password;

    private Integer status;

    private String userToken;

    private String lastLoginIp;

    private Date createTime;

    private Date updateTime;

    private Date lastLoginTime;


}
