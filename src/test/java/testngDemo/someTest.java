package testngDemo;

import org.testng.annotations.*;

public class someTest {
    @BeforeSuite
    void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("afterSuite");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("afterMethod");
    }

    @Test(groups = {"test2"})
//    @Test(enabled = false)加上就不能被执行了
    void test1() {
        System.out.println("test1");
    }

    //dependsOnMethods依赖于某个方法
    @Test(dependsOnMethods = "test1", groups = {"test2"})
    void test4() {
        System.out.println("test4");
    }

    //groups分组可以分开执行
    @Test(groups = {"test2", "test3"})
    void test() {
        System.out.println("test2");
    }

    @Test(groups = {"test2"})
    void test3() {
        System.out.println("test3");
    }
}
