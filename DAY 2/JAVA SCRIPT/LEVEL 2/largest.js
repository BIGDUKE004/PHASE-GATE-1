const prompt = require("prompt-sync")();

let num = Number(prompt("Enter first number: "));
let numtwo = Number(prompt("Enter second number: "));

let largest = num;

if (numtwo > largest) {
    largest = numtwo;
}

console.log("The largest is", largest);
