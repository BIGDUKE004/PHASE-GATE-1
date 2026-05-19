public class Functions{
    public static int addSum(int numberone, int numbertwo){
   int total = numberone + numbertwo;
return total;
}

    public static boolean isEven(int number){
if(number % 2 == 0){
return true;
} else {
return false;
}
}

    public static int squareOfNumber(int number){
int square = number * number;
return square;
}

    public static int celsiusToFahrnheight(int number){
int total = (number * (9/5)) + 32;
return total;
}

    public static boolean isPrime(int number){
int counter = 0;
for(int count = 1; count <= number; count++){
    if(number % count == 0){
counter++;
}
}
if(counter == 2){
return false;
} else {
return true;
}
}

    public static int largestOfThreeNumbers(int numberone, int numbertwo, int numberthree){

int largest = numberone;

if(numbertwo > largest){
largest = numbertwo;
} else if(numberthree > largest){
largest = numberthree;
}
return largest;
}

    public static int simpleInterest(int principal, int rate, int time){
int  simpleinterest = (principal * rate * time) / 100;
return simpleinterest;
}
    

    public static int areaOfRectangle(int length, int width){
int area = length * width;
return area;
}


    public static int reversedNumber(int number){
int reverse = 0;
while(number > 0){
int rev = number % 10;
reverse = (reverse * 10) + rev;
number = number / number;
}
return reverse;
}


    public static void main(String[] args){

System.out.println(addSum(2, 4));
System.out.println(isEven(4)); 
System.out.println(squareOfNumber(4));
System.out.println(celsiusToFahrnheight(45));
System.out.println(isPrime(4));
System.out.println(largestOfThreeNumbers(4, 15, 6));
System.out.println(simpleInterest(12, 54, 75));
System.out.println(areaOfRectangle(4, 5));
System.out.println(reversedNumber(1234));


}


}
