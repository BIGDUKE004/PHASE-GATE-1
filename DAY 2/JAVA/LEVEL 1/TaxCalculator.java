import java.util.Scanner;
public class TaxCalculator{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter price: ");
int num = input.nextInt();

int cal = (10 / 100) * num;
int sum = num + cal;

System.out.printf("your price plus tax is %d ", sum);
}
}
