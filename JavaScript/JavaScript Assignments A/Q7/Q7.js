console.log("1. for rupees to dollar \n2. for rupees to yen \n3.for rupees to Euro")
let option=prompt("Enter no accordingly:");
if(option==1){
    let currency=prompt("Enter amount:");
 console.log(currency/76.18 + "Dollars");   
}
if(option==2){
    let currency=prompt("Enter amount:");
 console.log(currency*1.51 + "Yen");   
}
if(option==3){
    let currency=prompt("Enter amount:");
 console.log(currency/83.93 + "Euros");   
}
else{
    console.log("Choose from above options only")
}