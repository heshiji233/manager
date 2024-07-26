package org.example.entity;/*
@author 何世吉
*/

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
    private int id;
    private String no;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private int roleId;
    @TableField("isvalid")
    private String isValid;
}
