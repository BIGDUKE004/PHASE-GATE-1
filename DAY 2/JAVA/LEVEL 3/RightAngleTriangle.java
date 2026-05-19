public class RightAngleTriangle{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("enter a number");
int num = input.nextInt();

for(int space = 1; space <= num; space++){
    for(int star = 1; star <= space; star++){
System.out.print("*");
}
System.out.println();
}
}
}
