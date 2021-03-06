package com.example.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    private Long total;
    private  Integer totalPage;
    private List<T> items;

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}