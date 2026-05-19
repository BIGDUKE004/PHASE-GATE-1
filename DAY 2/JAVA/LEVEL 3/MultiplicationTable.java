public class MultiplicationTable{
    public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("enter a number");
int num = input.nextInt();


for(int count = 1; count <= 12; count++){

    System.out.println(count + "*" + num + "=" + (count * num));

}

}
}

