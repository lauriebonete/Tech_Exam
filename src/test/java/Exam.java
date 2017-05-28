import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Laurie on 28 May 2017.
 */
public class Exam {

    @Test
    public void testEven(){

        /*
            Return the number of even ints in the given array.

            countEvens([2, 1, 2, 3, 4]) ? 3
            countEvens([2, 2, 0]) ? 3
            countEvens([1, 3, 5]) ? 0
        */

        Assert.assertEquals(3, Even.countEvens(new int[]{2, 1, 2, 3, 4}));
        Assert.assertEquals(3, Even.countEvens(new int[]{2, 2, 0}));
        Assert.assertEquals(0, Even.countEvens(new int[]{1, 3, 5}));
        Assert.assertEquals(0, Even.countEvens(new int[0]));
        Assert.assertEquals(1, Even.countEvens(new int[]{11, 9, 0, 1}));
        Assert.assertEquals(2, Even.countEvens(new int[]{2, 11, 9, 0}));
        Assert.assertEquals(1, Even.countEvens(new int[]{2}));
        Assert.assertEquals(2, Even.countEvens(new int[]{2, 5, 12}));
    }

    @Test
    public void testCigarParty(){

        /*
            When squirrels get together for a party, they like to have cigars.
            A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
            Unless it is the weekend, in which case there is no upper bound on the number of cigars.
            Return true if the party with the given values is successful, or false otherwise.

            cigarParty(30, false) ? false
            cigarParty(50, false) ? true
            cigarParty(70, true) ? true
        */

        Assert.assertEquals(false, Party.cigarParty(30, false));
        Assert.assertEquals(true, Party.cigarParty(50, false));
        Assert.assertEquals(true, Party.cigarParty(70, true));
        Assert.assertEquals(false, Party.cigarParty(30, true));
        Assert.assertEquals(true, Party.cigarParty(50, true));
        Assert.assertEquals(true, Party.cigarParty(60, false));
        Assert.assertEquals(false, Party.cigarParty(61, false));
        Assert.assertEquals(true, Party.cigarParty(40, false));
        Assert.assertEquals(false, Party.cigarParty(39, false));
        Assert.assertEquals(true, Party.cigarParty(40, true));
        Assert.assertEquals(false, Party.cigarParty(39, true));
    }

    @Test
    public void testPower(){

        /*
            Given base and n that are both 1 or more,
            compute recursively (NO LOOPS) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

            powerN(3, 1) ? 3
            powerN(3, 2) ? 9
            powerN(3, 3) ? 27
        */

        Assert.assertEquals(3, Power.powerN(3, 1));
        Assert.assertEquals(9, Power.powerN(3, 2));
        Assert.assertEquals(27, Power.powerN(3, 3));
        Assert.assertEquals(2, Power.powerN(2, 1));
        Assert.assertEquals(4, Power.powerN(2, 2));
        Assert.assertEquals(8, Power.powerN(2, 3));
        Assert.assertEquals(16, Power.powerN(2, 4));
        Assert.assertEquals(32, Power.powerN(2, 5));
        Assert.assertEquals(10, Power.powerN(10, 1));
        Assert.assertEquals(100, Power.powerN(10, 2));
        Assert.assertEquals(1000, Power.powerN(10, 3));
    }
}
