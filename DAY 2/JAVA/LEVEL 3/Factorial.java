public class Factorial{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("enter a number: ");
int userinput = input.nextInt();

int multi = userinput;


for(int down = 1; down <= userinput-1; down++){
        multi = multi *  down; 
}
System.out.println(multi);
}
}
