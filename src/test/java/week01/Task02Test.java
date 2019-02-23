package week01;

import org.junit.Assert;
import org.junit.Test;

public class Task02Test {



    @Test
    public void testGetFive() {
        Assert.assertEquals("-52 -15 6 20",Task02.getNumbers());
    }
}
