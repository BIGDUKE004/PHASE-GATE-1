import java.util.Scanner;
public class AreaOfRectangle{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter length: ");
int length = input.nextInt();

System.out.print("enter width: ");
int width = input.nextInt();

int sum = length * width;

System.out.printf("the fahrenheit is %d ", sum);
}
}
