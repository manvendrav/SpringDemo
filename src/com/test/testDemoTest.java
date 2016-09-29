package com.test;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by mave0216 on 9/29/2016.
 */
public class testDemoTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    //performance testing
    @Test(timeout = 10)
    public void setMessage2() throws Exception {
        for(int i=0;i<1000;i++){
            double random = Math.random();
            System.out.println(random);
        }
    }
    //performance testing
    @Test(timeout = 1000)
    public void setMessage() throws Exception {
        for(int i=0;i<100;i++){
            double random = Math.random();
            System.out.println(random);
        }
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

}