
class Person
{
    constructor(first,middle,last)
    {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
}

var per1 = new Person("Mohnish","Bhonde");
per1.middle = "Pramod";
per1.last = "Bhonde"
console.log(per1.first + " " + per1.middle + " " + per1.last);