import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Laurie on 28 May 2017.
 */
public class Exam {

    @Test
    public void testEven(){

        /*
            Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

            sum28([2, 3, 2, 2, 4, 2]) -> true
            sum28([2, 3, 2, 2, 4, 2, 2]) -> false
            sum28([1, 2, 3, 4]) -> false
        */

        Assert.assertEquals(true, Sum.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        Assert.assertEquals(false, Sum.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        Assert.assertEquals(false, Sum.sum28(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(true, Sum.sum28(new int[]{2, 2, 2, 2}));
        Assert.assertEquals(true, Sum.sum28(new int[]{1, 2, 2, 2, 2, 4}));
        Assert.assertEquals(false, Sum.sum28(new int[]{}));
        Assert.assertEquals(false, Sum.sum28(new int[]{2}));
        Assert.assertEquals(false, Sum.sum28(new int[]{8}));
        Assert.assertEquals(false, Sum.sum28(new int[]{2, 2, 2}));
        Assert.assertEquals(false, Sum.sum28(new int[]{2, 2, 2, 2, 2}));
        Assert.assertEquals(true, Sum.sum28(new int[]{1, 2, 2, 1, 2, 2}));
        Assert.assertEquals(true, Sum.sum28(new int[]{5, 2, 2, 2, 4, 2}));
    }

    @Test
    public void testLottery(){

        /*
            You have a blue lottery ticket, with ints a, b, and c on it.
            This makes three pairs, which we'll call ab, bc, and ac.
            Consider the sum of the numbers in each pair.

            If any pair sums to exactly 10, the result is 10.
            Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
            Otherwise the result is 0.

            blueTicket(9, 1, 0) ? 10
            blueTicket(9, 2, 0) ? 0
            blueTicket(6, 1, 4) ? 10
        */

        Assert.assertEquals(10, Lottery.blueTicket(9,1,0));
        Assert.assertEquals(0, Lottery.blueTicket(9,2,0));
        Assert.assertEquals(10, Lottery.blueTicket(6,1,4));
        Assert.assertEquals(0, Lottery.blueTicket(6,1,5));
        Assert.assertEquals(10, Lottery.blueTicket(10,0,0));
        Assert.assertEquals(5, Lottery.blueTicket(15,0,5));
        Assert.assertEquals(10, Lottery.blueTicket(5,15,5));
        Assert.assertEquals(5, Lottery.blueTicket(4,11,1));
        Assert.assertEquals(5, Lottery.blueTicket(13,2,3));
        Assert.assertEquals(0, Lottery.blueTicket(8,4,3));
        Assert.assertEquals(10, Lottery.blueTicket(8,4,2));
        Assert.assertEquals(0, Lottery.blueTicket(8,4,1));
    }

    @Test
    public void testTriangle(){

        /*
            We have triangle made of stars.
            The topmost row has 1 stars,
            the next row down has 2 stars, the next row has 3 stars, and so on.
            Compute recursively (no loops or multiplication) the total number of stars in such a triangle with the given number of rows.

            Sample Triangle with 1 row
            *

            Sample Triangle with 2 rows
             *
            * *
            Sample Triangle with 3 rows
              *
             * *
            * * *

            countStar(0) -> 0
            countStar(1) -> 1
            countStar(2) -> 3
            countStar(3) -> 6
        */

        Assert.assertEquals(0, Triangle.countStar(0));
        Assert.assertEquals(1, Triangle.countStar(1));
        Assert.assertEquals(3, Triangle.countStar(2));
        Assert.assertEquals(6, Triangle.countStar(3));
        Assert.assertEquals(10, Triangle.countStar(4));
        Assert.assertEquals(15, Triangle.countStar(5));
        Assert.assertEquals(21, Triangle.countStar(6));
        Assert.assertEquals(28, Triangle.countStar(7));
    }
}
