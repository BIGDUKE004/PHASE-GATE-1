import java.util.Scanner;
public class AverageOfNumbers{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum = 0;

for(int count = 1; count <= 3; count++){
System.out.print("enter price: ");
int num = input.nextInt();
sum += num;
}
int ave = sum / 3 ;


System.out.printf("the average is %d ", ave);
}
}
