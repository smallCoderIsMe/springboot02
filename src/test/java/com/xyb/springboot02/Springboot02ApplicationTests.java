package com.xyb.springboot02;

import com.xyb.springboot02.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot的单元测试
 * 可以进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
