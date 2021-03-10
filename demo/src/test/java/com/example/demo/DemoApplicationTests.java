package com.example.demo;

import com.example.demo.mapper.OrderMapper;

import com.example.demo.pojo.Brand;
import com.example.demo.pojo.Order;

import com.example.demo.pojo.PageResult;
import com.example.demo.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)

public class    DemoApplicationTests {
@Autowired
OrderMapper orderMapper;
@Autowired
BrandService brandService;
	@Test
 public void LoadUser() {
		Order order = orderMapper.selectByPrimaryKey(1048108312895295488L);
		System.out.println(order);
	}
@Test
	public  void queryOrderByPage(){
		PageResult<Brand> brandPageResult = brandService.queryOrderByPage(1, 2, "name", true, "海");
		System.out.println(brandPageResult.toString());
	}
}
