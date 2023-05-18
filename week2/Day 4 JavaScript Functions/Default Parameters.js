const fs = require('fs');
const input = fs.readFileSync('input.txt').toString();
const trimmedInput = input.trim();
const inputArray = trimmedInput.split("\n");

const calculateSimpleInterest = (principal, time, rate) => (principal * time * rate) / 100;

if (inputArray.length === 2) {
  console.log(calculateSimpleInterest(inputArray[0], inputArray[1], 5));
} else {
  console.log(calculateSimpleInterest(inputArray[0], inputArray[1], inputArray[2]));
}