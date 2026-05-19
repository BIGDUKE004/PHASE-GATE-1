public class SumOfFiveNumbers{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

int sum = 0;

for(int count = 1; count <= 5; count++){

System.out.print("enter a number: ");
int userinput = input.nextInt();

     sum += userinput; 
}
System.out.println(sum);
}
}
