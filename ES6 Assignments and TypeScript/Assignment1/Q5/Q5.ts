let addValue= (val=5)=>{
console.log(val);

};

addValue();
addValue(25);
var names=["Mohnish","Axel","Kai"];
let userFriends=(username:any, ...friends:any)=>{
    console.log(username);
    for (let friend of friends) {
        console.log(friend);
    }
    
}
var username="Mohnish";
userFriends(username,names);
let printCapitalName=(...names:any)=>{
    for(let name of names){
        console.log(name.toUpperCase());
        
    }
}
printCapitalName(...names);