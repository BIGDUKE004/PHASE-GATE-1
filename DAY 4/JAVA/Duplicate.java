// duplicating arrays
// compare and store
// CREATE TWO LOOPS, ONE TO START FROM THE FIRST ELEMENT AND THE SECOND ONE SHOULD START FROM THE  SECOND ELEMENT
// if the first one is not equal to the second one, add it to the new array
import java.util.Arrays;
public class Duplicate{

    public static int [] removingDuplicates(int [] list){

        int [] num = new int [list.length];
        int count = 0;

    
        for(int firstcount = 0; firstcount < list.length; firstcount++ ){
 
           for(int secondcount = 0; secondcount < num.length; secondcount++){

                if(num[secondcount]!= list[firstcount]  ){

                num[secondcount] = list[firstcount];

}

    }    

            }
return num;
        }



    
   public static void main(String[] args){
int [] list = {9, 5, 1, 9, 4, 5, 1, 7};
System.out.println(Arrays.toString(removingDuplicates(list)));

}
}


