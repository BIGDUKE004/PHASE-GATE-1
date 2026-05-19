import java.util.Scanner;
public class LargestNumber{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("enter number: ");
int num = input.nextInt();

System.out.print("enter number: ");
int numtwo = input.nextInt();

int largest = num;

if(largest < numtwo){
largest = numtwo;
} 

System.out.println("the largest is : " + largest);

}
}
