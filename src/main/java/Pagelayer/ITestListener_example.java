package Pagelayer;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listenerclass_layer.Listenertest.class)
public class ITestListener_example {

    @BeforeClass
    public void setup()
    {
        System.out.println("before class:started");
    }

    @Test
    public void t1()
    {
        Assert.assertTrue(false);

    }
    @Test
    public void t2()
    {
        Assert.assertTrue(true
        );

    }
    @Test
    public void t3()
    {
       throw new SkipException("skipping test");

    }





}
