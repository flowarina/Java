package week02;

import org.junit.Assert;
import org.junit.Test;
import week02.Task01_02;

public class Task01_02Test {



    @Test
    public void testTask() {
        Assert.assertEquals(11,Task01_02.getSum(5,6));
    }
}

