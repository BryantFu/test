package com.example.test.entity.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenu {
        private long id;

        private long roleId;
        private long operationId;
        private long menuId;
        private int menuType;


        public RoleMenu(Long roleId , Long menuId){
                this.roleId = roleId;
                this.menuId = menuId;
        }

}
