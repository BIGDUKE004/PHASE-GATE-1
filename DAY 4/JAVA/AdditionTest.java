import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    
    public void testThatTheFunctionIsWorking(){
        int[] list = {8, 6, 12, 4, -2};
        int digit = 6;
        int[] expected = {8, -2};
        int[] actual =  Addition.findingTheNumeral(list, digit);
        assertArrayEquals(expected, actual);

    }

}
