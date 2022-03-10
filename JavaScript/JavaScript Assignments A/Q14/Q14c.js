let arr=[1,4,7,2,3,9,16,15,91,4,52,34,76,4];
let Evencount=0;
let OddCount=0;
for (let i = 0; i< arr.length; i++)
     if(arr[i]%2==0){
         Evencount=Evencount+1
     }
     else{
         OddCount=OddCount+1;
     }
     
     if (Evencount>OddCount){
        console.log("Event Count is greater" +" " +Evencount)
     }
else{
console.log("Odd Count=" + OddCount)
}