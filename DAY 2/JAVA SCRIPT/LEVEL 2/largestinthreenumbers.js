const prompt = require("prompt-sync")();

let num = Number(prompt("Enter first number: "));
let numtwo = Number(prompt("Enter second number: "));
let numthree = Number(prompt("Enter second number: "));

let largest = num;

if (numtwo > largest) {
    largest = numtwo;
} else if (numthree > largest){
    largest = numthree;
}

console.log("The largest is", largest);
