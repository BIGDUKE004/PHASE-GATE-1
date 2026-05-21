// WRITE A FUNCTION THAT TAKES AN INPUT WHICH THE FIRST ONE  IS AN ARRAY AND THE SECOND ONE IS A NORMAL INTEGER
// WRITE A FUNCTION
// CREATE TWO LOOPS, ONE TO START FROM THE FIRST ELEMENT AND THE SECOND ONE SHOULD START FROM THE  SECOND ELEMENT
//COMPARE THE BOTH: IF THE FIRST LOOP + THE SECOND LOOP IS EQUALS TO THE SECOND PARAMETER, IT SHOULD RETURN IT, ADDING IT INTO ANOTHER ARRAY
import java.util.Arrays;
public class Addition{

    public static int [] findingTheNumeral(int [] list, int digit){

        int [] num = {};
        int firstnum = 0;
        int secondnum = 0;
    
        for(int firstcount = 0; firstcount < list.length; firstcount++ ){
 
           for(int secondcount = firstcount + 1; secondcount < list.length; secondcount++){

                if(list[firstcount] + list[secondcount] == digit){
                    
                                num =  new int [] {list[firstcount], list[secondcount]};

    }    
            }

        }
return num;
    }

    public static void main(String[] args){
int [] list = {8, 6, 12, 4, -2};
System.out.println(Arrays.toString(findingTheNumeral(list,6)));

}

}
