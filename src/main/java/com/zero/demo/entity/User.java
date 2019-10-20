package com.zero.demo.entity;

import lombok.Data;

/**
 * 用户实体
 */
@Data
public class User {

    private String id;

    private String name;

    private String addr;

    private String phone;

    private String password;

    public void setId(){
        id = "sdadada";
    }
}
