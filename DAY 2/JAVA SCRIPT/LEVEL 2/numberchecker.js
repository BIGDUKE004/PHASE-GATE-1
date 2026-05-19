const prompt = require("prompt-sync")();
num = prompt("enter number ")
const number = Number(num)
if(number < 0 ){
console.log("it is a negative number") 
} else {
console.log("it is a positive number") 
}
