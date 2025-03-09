package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void loginfunctionality() {
        Assert.assertTrue(false);
    }
        @Test(dependsOnMethods =" loginfunctionality" )
                public void  veriifyhomePage(){
            System.out.println("Home Page Validate");
        }
        @Test
    public void onboarding(){
            System.out.println("onboarding");
        }
    }

