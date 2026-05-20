// FUNCTION 1 - CHECK THAT THE ARRAY CONTAINS 20 SPOT FILLED WITH O [THE DEFAULT VALUE OF INT IS 0]
// FUNCTION 2 - CHECK THAT A CAR CAN PARK INTO ANY SPACE
// FUNCTION 3 - CHECK THAT A CAR CANT PARK IN A NON EMPTY SPACE
// FUNCTION 4 - CHECK THAT A CAR CAN LEAVE IT SPOT 
//FUNCTION 5 - CHECK THAT THE WHOLE FUNCTION WORKS
import java.util.Arrays;
public class ParkingLotSystem{

    public static int [] aCarCanPark(int [] space){
int slot = 0;
for (int count = 0; count < space.length; count++) {
        if (space[count] == 0) {
            slot++;
}
}
return slot;
}


}
