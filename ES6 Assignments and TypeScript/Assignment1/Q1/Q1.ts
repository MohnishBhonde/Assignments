const num1=5;
const num2=10;
let res=num1+num2;
console.log(res);
//this error is because its constant and therefore value cannot be changed
num1=10;
res=num1+num2;
console.log(res);
