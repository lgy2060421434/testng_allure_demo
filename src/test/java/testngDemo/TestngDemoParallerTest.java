package testngDemo;

import com.sun.javafx.css.CalculatedValue;
import org.testng.annotations.Test;


public class TestngDemoParallerTest {
    @Test(threadPoolSize = 2,invocationCount = 10,timeOut = 60000)
    public void countTest() {
        int result = 2;
        long id=Thread.currentThread().getId();
        System.out.println("线程id："+id+"计算"+result);
    }
    @Test(threadPoolSize = 2,invocationCount = 10,timeOut = 60000)
    public void countTest1() {
        int result = 9;
        long id=Thread.currentThread().getId();
        System.out.println("线程id："+id+"计算"+result);
    }
}
