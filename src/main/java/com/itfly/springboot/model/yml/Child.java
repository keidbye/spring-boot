package com.itfly.springboot.model.yml;

import lombok.Data;

import java.util.List;

@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friend;
}
