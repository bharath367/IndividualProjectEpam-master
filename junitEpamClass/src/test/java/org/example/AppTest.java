package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.jupiter.api.*;

public class AppTest {

//    @BeforeAll
//    public static void BeforeClass() {
//        System.out.println("This will run Before class");
//    }
//    @BeforeEach
//    void BeforeMethod() {
//        System.out.println("This will run Before Method");
//    }
//    @Test
//    void Test1() {
//
//        System.out.println("This will run test 1 ");
//    }
//    @Test
//    void Test2() {
//        System.out.println("This will run test2");
//    }
//    @AfterEach
//    void AfterMethod() {
//
//        System.out.println("This will run After Method");
//    }
//    @AfterAll
//    public static void AfterClass() {
//
//        System.out.println("This will run After class");
//    }

    App a = new App();
    @Test
    public void additionTest(){
        Assert.assertEquals(5, a.addition(3,2));


    }
    @Test
    public void subTest(){
        Assert.assertEquals(5,a.sub(9,4));
    }
    @Test
    public void multiplicationTest(){

        Assert.assertEquals(9,a.multiplication(3,3));

    }
    @Test
    public void divideTest() {
        Assert.assertEquals(1, a.divide(3, 3));
    }
    public void assertarrayEqulas(){
      //  Assert.assertArrayEquals();
    }

}