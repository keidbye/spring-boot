package com.itfly.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data           //get set
@AllArgsConstructor  //全参构造
public class User {

    private long id;
    private String name;

}
