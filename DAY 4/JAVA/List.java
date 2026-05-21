import java.util.Arrays;
public class List{

    public static int highest(int [] number){

int largest = number[0];

for(int count = 0; count < number.length ; count++){
    if(largest < number[count]){
        largest = number[count];
}
}

return largest;
}

    public static int lowest(int [] number){
int lowest = number[0];
for(int count = 0; count < number.length ; count++){
    if(lowest > number[count]){
        lowest = number[count];
}
}
return lowest;
}

public static int [] listOfNumbers(int [] number){
int [] newArray = new int[10];

int start = lowest(number);
int stop = highest(number);

int counter = 0;
    for(int count = start ; count <= stop; count++ ){
            newArray[counter++] = count;
}
return newArray;
}

public static void main(String[] args){
int [] number = {14, 9, 6, 5, 8, 10};

System.out.println(Arrays.toString(listOfNumbers(number)));
System.out.println(lowest(number));
System.out.println(highest(number));

}
}
