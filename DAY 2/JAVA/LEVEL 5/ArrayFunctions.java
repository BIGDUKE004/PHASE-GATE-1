import java.util.Arrays;
public class ArrayFunctions{

    public static int [] Zeroes(int [] numbers){

int [] list = new int [numbers.length];

for(int first = 0; first < numbers.length; first++){
    for(int second = first+1; second < numbers.length; second++){
        if(numbers[first] < numbers[second]){
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
list = numbers;
}
}
}
return list;
}


    public static int [] sortedArray(int [] digit){



for(int count = 0; count < digit.length; count++ ){
    if(digit[count] < 0){
digit[count] = 0;

}
}
return digit;
}



public static void main(String[] args){
int [] numbers = {5, 0, 3, 0, 2, 0};
int [] list = Zeroes(numbers);
System.out.print(Arrays.toString(list));


int [] digit = {5, -9, 3, -6, 2, -11};
int [] list = sortedArray(digit);
System.out.print(Arrays.toString(index));

}
}
