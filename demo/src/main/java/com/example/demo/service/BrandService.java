package com.example.demo.service;

import com.example.demo.mapper.BrandMapper;
import com.example.demo.pojo.Brand;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandService {
    @Resource
    BrandMapper brandMapper;

    public PageResult<Brand> queryOrderByPage(int page, int rows, String sortby, boolean desc, String key) {
        PageHelper.startPage(page,rows);
        List<Brand> brands = brandMapper.queryBrands(sortby, true, key);
        PageInfo<Brand> pageInfo=new PageInfo<>(brands);
        return new  PageResult<Brand>(pageInfo.getTotal(),pageInfo.getPages(),brands);
    }
}
