package com.example.test.entity.po;

import com.example.test.entity.vo.RoleVo;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    private long id;

    private long roleId;

    private String roleName;

    private String remark;

    private int status;

    private Date createTime;

    private Date updateTime;

    public Role(RoleVo vo) {
        String test = vo.getRemark();
        this.id = vo.getRoleId();
        this.roleName = vo.getRoleName();
        this.remark = vo.getRemark();
        this.status = vo.getStatus();
    }

}