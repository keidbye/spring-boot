package com.itfly.springboot.model.REST;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Reader {
    private String name;
    private int age;

    public Reader() {
    }
}
