package testngDemo;

import org.testng.annotations.Test;

public class testngDemoThread {
    @Test
    void test1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test1");
    }

    @Test(threadPoolSize = 5,invocationCount = 5,timeOut = 60000)
    void test2() throws InterruptedException {
        Thread.sleep(1000);
        long id=Thread.currentThread().getId();
        System.out.println("线程号"+id);
        System.out.println("test2");
    }

    @Test
    void test3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test3");
    }

    @Test
    void test4() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test4");
    }
}
