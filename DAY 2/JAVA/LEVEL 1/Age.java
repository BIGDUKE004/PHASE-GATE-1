import java.util.Scanner;
public class Age{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("how old are you?: ");
int age = input.nextInt();

int add = age + 5;

System.out.printf("you will be %d in the next five years ", add);
}
}
