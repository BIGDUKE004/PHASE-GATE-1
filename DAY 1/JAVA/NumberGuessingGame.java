// this is a number guessing game and it has a lot of features that will be embedded in it to meet what we need

// first off we will need to generate random numbers which the user will be guessing based on and it will be between 1 and 100 and produce different numbers everytime it goes again === DONE

// allow the user up to 5 attempts to guess the number === DONE

// if the user input is greater than the random number display it and if otherwise display it (then the program should iterate again) === DONE

//if the userinput is equal to the random number, the program should break === DONE

// if the user enters a non number, it should show an error

// and if the user input is lesser than 1 and greater than 100 continue

// for tracking and rating, if the user won at one go it should display legendary, if two = excellent, if three - four = good, if between 5 = close, if no win at the fifth time = better luck next time

// display the correct number, attempt used and rating

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{

    public static void main(String[] args){

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

// first off we will need to generate random numbers which the user will be guessing based on and it will be between 1 and 100
        int number = rand.nextInt(100);

        int attempt = 1;
        int userinput = 0;

        while (true){

        System.out.print("Enter a number: ");
        userinput = input.nextInt();
 
       if(userinput > number){
        System.out.println("it is higher....try again");

}       else if(userinput < number){
        System.out.println("it is lower....try again");

}       else if(userinput == number){
        System.out.println("correct!!!");
        break;

}
        if(attempt == 5){
        break;
}

        if(userinput < 1 && userinput > 100){
System.out.println("invalid input");
continue;
}

        attempt++;
}

System.out.println("The number is: " + number);
System.out.println("your attempt is: " + attempt);

    if(attempt == 1 && userinput == number){
    System.out.println("legendary");
} else if(attempt == 2 && userinput == number ){
System.out.println("Excellent");
} else if(attempt >= 3 && attempt <= 4 && userinput == number){
System.out.println("Good");
} else if(attempt == 5 && userinput == number ){
System.out.println("close");
} else if(attempt == 5 && userinput != number ){
System.out.println("Better luck next time");
}

      


}

}



