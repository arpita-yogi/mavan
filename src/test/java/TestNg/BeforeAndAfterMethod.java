package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
    @BeforeMethod
    public void Setup(){
        System.out.println("Before Method");
    }

    @Test
    public void TestCase1(){
        System.out.println("This is test 1");
    }

    @Test
    public void TestCase2(){
        System.out.println("This is test 2");
    }

    @Test
    public void TestCase3(){
        System.out.println("This is test 3");
    }

    @Test
    public void TestCase4(){
        System.out.println("This is test 4");
    }

    @Test
    public void TestCase5(){
        System.out.println("This is test 5");
    }

    @Test
    public void TestCase6(){
        System.out.println("This is test 6");
    }
        @AfterMethod
             public void Setdown(){
        System.out.println("After method");

        }


    }



