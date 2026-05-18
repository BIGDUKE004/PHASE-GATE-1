#// this is a number guessing game and it has a lot of features that will be embedded in it to meet what we need
#
#// first off we will need to generate random numbers which the user will be guessing based on and it will be between 1 and 100 and produce different numbers everytime it goes again 
#
#// allow the user up to 5 attempts to guess the number === DONE
#
#// if the user input is greater than the random number display it and if otherwise display it (then the program should iterate again)
#
#//if the userinput is equal to the random number, the program should break 
#
#// if the user enters a non number, it should show an error
#
#// and if the user input is lesser than 1 and greater than 100 continue
#
#// for tracking and rating, if the user won at one go it should display legendary, if two = excellent, if three - four = good, if between 5 = close, if no win at the fifth time = better luck next time
#
#// display the correct number, attempt used and rating
#
import random;

#// first off we will need to generate random numbers which the user will be guessing based on and it will be between 1 and 100
number = random.randint(1,100);
attempt = 1;
userinput = 0;

while True:
    userinput = int(input("Enter a number: "))
    
    if userinput < 1 or userinput > 100:
        print("invalid input")
        continue
    elif userinput > number:
        print("it is higher....try again")
    elif userinput < number:
        print("it is lower....try again")
    elif userinput == number:
        print("correct!!!")
        break

    if attempt == 5:
        print("Out of attempts!")
        break
    
    attempt += 1


print("The number is: ", number);
print("your attempt is: ", attempt);

if(attempt == 1 and userinput == number):
        print("legendary");
elif(attempt == 2 and userinput == number ):
        print("Excellent");
elif(attempt >= 3 and attempt <= 4 and userinput == number):
        print("Good");
elif(attempt == 5 and userinput == number ):
        print("close");
elif(attempt == 5 and userinput != number ):
        print("Better luck next time");


      





































































