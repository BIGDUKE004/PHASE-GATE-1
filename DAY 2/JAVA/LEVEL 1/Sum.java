import java.util.Scanner;
public class Sum{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter a number: ");
int num = input.nextInt();

System.out.print("enter a number: ");
int digit = input.nextInt();

int add = num + digit;

System.out.printf("the sum is %d  ",add);
}
}
