package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroups {
    @Test(groups = {"smoke"})
    public void loginfunctionality() {
        Assert.assertTrue(false);
    }
    @Test(dependsOnGroups ={"smoke"} )
    public void  veriifyhomePage(){
        System.out.println("Home Page Validate");
    }
    @Test(description = "verify new account created with valid test data ")
    public void onboarding(){
        System.out.println("onboarding");
    }
}
