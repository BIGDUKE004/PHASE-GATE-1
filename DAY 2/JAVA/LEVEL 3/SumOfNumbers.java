public class SumOfNumbers{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("enter a number: ");
int userinput = input.nextInt();
int sum = 0;
for(int count = 1; count <= userinput; count++){
     sum += count; 
}
System.out.println(sum);
}
}
