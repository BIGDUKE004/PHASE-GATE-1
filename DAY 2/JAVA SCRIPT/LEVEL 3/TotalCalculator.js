const prompt = require("prompt-sync")();
let sum = 0
while(true){
const number = Number(prompt("enter a number"))
    sum += number
if(number == 0){
break;
}
}
    console.log(sum)
