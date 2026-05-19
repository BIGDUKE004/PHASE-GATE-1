import java.util.Scanner;
public class Name{

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("what is your name: ");
String name = input.nextLine();

System.out.printf("hello %s ", name);
}
}
