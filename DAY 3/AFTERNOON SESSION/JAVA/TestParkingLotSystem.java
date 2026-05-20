import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestParkingLotSystem{

    @Test
        public void TestThatTheresTwentySpaceInTheParkingLotContainingZero(){
        int [] array = new int[20];
        int lot = 7;
        int [] expected = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int [] actual = ParkingLotSystem.aCarCanPark(array, lot);
        assertArrayEquals(actual, expected);
}


}
