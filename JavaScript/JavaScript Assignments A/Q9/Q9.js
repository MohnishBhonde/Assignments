let arr1 = ["a","b","c"];
let arr2 = [1,2,3];
let run = 0, first = 0, second = 0;
let newArr = [];
while(run < arr1.length + arr2.length){
   if(first > second){
      newArr[run] = arr2[second];
      second++;
   }else{
      newArr[run] = arr1[first];
      first++;
   }
   run++;
};
console.log(newArr);