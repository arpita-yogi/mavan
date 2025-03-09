package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExe {
    @Test(priority = 1,groups = {"smoke"})
    public void testCaseO(){
        System.out.println("Test case O");
    }
    @Test(priority = 2)
    public void testCaseL(){
        System.out.println("Test case L");
    }
    @Test(priority = 3)
    public void testCaseN(){
        Assert.assertTrue(false);
        System.out.println("Test case N");
    }
    @Test(priority = 4,groups = {"smoke"})
    public void testCaseD(){
        Assert.assertTrue(false);
        System.out.println("Test case D");
    }
    @Test(enabled = false)
    public void testCaseK(){
        System.out.println("Test case K");
    }
    @Test(priority = 6)
    public void testCaseA(){
        System.out.println("Test case A");
    }
    @Test(priority = -7,groups = {"smoke"})
    public void testCaseP(){
        System.out.println("Test case P");
    }

}
