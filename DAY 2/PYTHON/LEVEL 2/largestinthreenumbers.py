num = int(input("enter number: "));
numtwo = int(input("enter number: "));
numthree = int(input("enter number: "));
 
largest = num

if(largest < numtwo):
    largest = numtwo
elif(largest < numthree):
    largest = numthree
print(f"the largest is {largest}")

