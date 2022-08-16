package testngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngDemoData {
//    参数化DataProvider
    @DataProvider(name = "putInList")
    public Object[][] putInList() {
        Object[][] object;
        return object = new Object[][]{
                {"包裹1", 1, 0, 1, 0, 1},
                {"包裹2", 1, 1, 1, 0, 1}
        };
    }

    @Test(dataProvider = "putInList")
    public void test(String packeName, int anum, int bnum, int cnum, int dnum, int Enum) {
        System.out.println(packeName+"  "+anum+"  "+bnum+"  "+cnum+"  "+dnum+"  "+Enum);
    }
}
