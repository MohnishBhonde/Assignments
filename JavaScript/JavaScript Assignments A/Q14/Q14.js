let arr=[1,4,7,2,3,9,16,4,52,34,76,4];
for (let i = 0; i< arr.length; i++)
 {  for (let j = 0; j < arr.length; j++) {
     if(arr[j]>arr[j+1]){
         [arr[j],arr[j+1]]=[arr[j+1],arr[j]]
     }
     
 }
}
arr.reverse();
console.log(arr[0])