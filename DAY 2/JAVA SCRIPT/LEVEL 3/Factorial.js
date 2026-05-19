const prompt = require("prompt-sync")();
const number = Number(prompt("enter a number"))
let multi = number
for(let num = 1; num <= number-1; num++){
    multi = multi * num
}
    console.log(multi)
