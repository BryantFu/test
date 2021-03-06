package com.example.test.entity.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

        private long id;

        private long parentId;

        private String menuName;

        private String menuPath;

        private int menuSort;

        private int status;

        private Date createTime;

        private Date updateTime;

        private List<Menu> menuList;

}
