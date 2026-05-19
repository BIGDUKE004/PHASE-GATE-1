import java.util.Scanner;
public class TaxOfPrice{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter price: ");
int num = input.nextInt();

int sum = 10 % 100 ;
//int tax = num + sum;

System.out.printf("the price after adding tax is %d ", sum);
}
}
