package TestNg;

import org.testng.annotations.Test;

public class TestNgGnvocaton {
    @Test(invocationCount = 10,invocationTimeOut = 2)

    public void repeating(){
        System.out.println("This is repeating Example");
    }

}
