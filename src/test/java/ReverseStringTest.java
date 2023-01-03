import junit.framework.TestCase;

import java.util.Arrays;

public class ReverseStringTest extends TestCase {

    public void testProfit1(){
        char[] s = {'h','e','l','l','o'};
        Main.Solution.reverseString(s);
        char[] expectedString = {'o','l','l','e','h'};
        assertEquals(Arrays.toString(expectedString), Arrays.toString(s));
    }

    public void testProfit2(){
        char[] s = {'H','a','n','n','a','h'};
        Main.Solution.reverseString(s);
        char[] expectedString = {'h','a','n','n','a','H'};
        assertEquals(Arrays.toString(expectedString), Arrays.toString(s));
    }
}
