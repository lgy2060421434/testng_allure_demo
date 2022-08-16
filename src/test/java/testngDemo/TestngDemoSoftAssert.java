package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngDemoSoftAssert {
    @Test
    //硬断言
    void addTest() {
        int result01 = 4+3;
        Assert.assertEquals(result01,7);
        System.out.println(result01);
        int result02=4+2;
        Assert.assertEquals(result02,4);
        System.out.println(result02);
        int result03=4+4;
        Assert.assertEquals(result03,8);
        System.out.println(result03);
    }
    @Test
//    软断言
    void softAddTest() {
        SoftAssert softAssert=new SoftAssert();
        int result01 = 4+3;
        softAssert.assertEquals(result01,7);
        System.out.println(result01);
        int result02=4+2;
        softAssert.assertEquals(result02,4);
        System.out.println(result02);
        int result03=4+4;
        softAssert.assertEquals(result03,8);
        System.out.println(result03);
        softAssert.assertAll();
    }
}
