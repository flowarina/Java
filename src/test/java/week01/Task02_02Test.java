package week02;

import org.junit.Assert;
import org.junit.Test;

public class Task02_02Test {


    private Object a;

    @Test
    public void testTask(){
        Assert.assertEquals(4,Task02_02.abs(a));
    }
}

