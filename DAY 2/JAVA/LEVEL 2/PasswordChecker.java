import java.util.Scanner;
public class PasswordChecker{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

int password = "admin123";

System.out.print("enter password: ");
int num = input.nextInt();


if (num == password){
System.out.println("password correct ");
} else {
System.out.printf("invalid password");
}


}
} 
