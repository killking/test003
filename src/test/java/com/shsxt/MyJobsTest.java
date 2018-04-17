package com.shsxt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by kingkill on 2018/4/17.
 */
public class MyJobsTest {
   /* @Test
    public void test(){
         new ClassPathXmlApplicationContext("spring.xml");
    }*/
    public static void main (String []args){
        new ClassPathXmlApplicationContext("spring.xml");
    }
}