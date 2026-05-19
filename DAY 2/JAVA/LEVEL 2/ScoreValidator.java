import java.util.Scanner;
public class ScoreValidator{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter score: ");
int num = input.nextInt();

if(num >= 50){
System.out.println("pass");
} else {
System.out.println("fail");
}

}
}
