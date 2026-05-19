import java.util.Scanner;
public class SquareOfNumber{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter a number: ");
int num = input.nextInt();

int sum = num * num;

System.out.printf("the square is %d ", sum);
}
}
