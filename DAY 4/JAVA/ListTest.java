import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    
    public void testThatTheFunctionIsWorking(){
        int [] number = {14, 9, 6, 5, 8, 10};
        int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] actual =  List.listOfNumbers(number);
        assertArrayEquals(expected, actual);

    }

}
