const prompt = require("prompt-sync")();
const number = Number(prompt("enter a number"))
let sum = 0
for(let num = 1; num <= number; num++){
    sum += num
}
    console.log(sum)
