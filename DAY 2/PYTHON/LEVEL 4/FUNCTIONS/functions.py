def addNumber(numberone, numbertwo):
    total = numberone + numbertwo
    return total



def isEven(number):
    if(number % 2 == 0):
            return True;
    else :
            return False;



def squareOfNumber(number):
    total = number * number
    return total



def celsiusToFahrnheight(number):
    total = (number * (9/5)) + 32
    return total



def isPrime(number):
    counter = 0
    for number in range(1, number+1):
        if(number % number == 0):
            counter += 1

    if(counter == 2):
        return False;
    else :
        return True;



def largestOfThreeNumbers(numberone, numbertwo, numberthree):
    largest = numberone;

    if(numbertwo > largest):
        largest = numbertwo;
    elif(numberthree > largest):
        largest = numberthree;
    return largest;



def  simpleInterest(principal, rate, time):
    simpleinterest = (principal * rate * time) / 100;
    return simpleinterest



def areaOfRectangle(length, width):
    area = length * width;
    return area;


print(addNumber(2, 4))
print(isEven(4))
print(squareOfNumber(4))
print(celsiusToFahrnheight(45))
print(isPrime(47))
print(largestOfThreeNumbers(2, 4, 42))
print(simpleInterest(23455, 4, 9))
print(areaOfRectangle(2, 4))
















