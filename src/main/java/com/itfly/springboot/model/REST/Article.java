package com.itfly.springboot.model.REST;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Article {
    private long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;

    public Article() {
    }
}
