import java.util.Scanner;
public class NumberChecker{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter number: ");
int num = input.nextInt();

if(num < 0){
System.out.println("it is a negative number");
} else {
System.out.println("it is a positive number");
}

}
}
