
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest(){
        int input = 2;
        
        String expected = "2 x 1 = 2\n
                           2 x 2 = 4\n
                           2 x 3 = 6\n
                           2 x 4 = 8\n
                           2 x 5 = 10\n
                           2 x 6 = 12\n
                           2 x 7 = 14\n
                           2 x 8 = 16\n
                           2 x 9 = 18\n
                           2 x 10 = 20";
        String actual = "*insert main function call with user input*";

        Assert.assertEquals(expected, actual);
    }
}
