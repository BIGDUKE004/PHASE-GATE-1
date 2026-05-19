public class TotalCalculator{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

int sum = 0;

while (true){

System.out.print("enter a number: ");
int userinput = input.nextInt();
     sum += userinput; 

if(userinput == 0){
break;
}

}
System.out.println(sum);
}
}
