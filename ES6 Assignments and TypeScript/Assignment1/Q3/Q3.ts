var order={
    id:2,
    title:"Hello",
    price:4560,

    printOrder:function () {
            return this.id+" "+this.title+" "+this.price;
    
    },
    getPrice:function () {
        return this.price;
    }
}

let order2=Object.assign({},order);
console.log(order);
console.log(order2);