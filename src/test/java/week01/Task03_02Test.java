package week02;

import org.junit.Assert;
import org.junit.Test;
import week02.Task01_02;

public class Task03_02Test {



    @Test
    public void testTask() {
        Assert.assertEquals(10,Task03_02.getSum(0,1,2,3,4));
    }
}