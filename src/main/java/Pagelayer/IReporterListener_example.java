package Pagelayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IReporterListener_example {

    @Test(groups = "priority1")
    public void t1()
    {
        Assert.assertTrue(true);
        System.out.println("t1 passed");
    }
    @Test(groups = "priority1")
    public void t2()
    {
        Assert.assertTrue(false);
        System.out.println("t2 failed");

    }
    @Test(groups="priority2")
    public void t3()
    {

        Assert.assertTrue(true);
        System.out.println("t3 passed");
    }
    @Test(groups = "priority1")
    public void t4()
    {
        Assert.assertTrue(false);
        System.out.println("t4 failed");
    }
    @Test(groups = "priority1")
    public void t5()
    {
        Assert.assertTrue(true);
        System.out.println("t5 passed");
    }
    @Test(groups="priority2")
    public void t6()
    {

        Assert.assertTrue(false);
        System.out.println("t6 failed");
    }
}
