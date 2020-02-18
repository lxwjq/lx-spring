package com.thislx.aop.entity;

import com.thislx.aop.annotation.Table;

/**
 * 城市类
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 11:26
 **/
@Table("city")
public class City {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
