import java.util.Scanner;
public class Celsius{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter a number in celsius: ");
int num = input.nextInt();

double sum = (num * (9/2) + 32);

System.out.printf("the fahrenheit is %f ", sum);
}
}
