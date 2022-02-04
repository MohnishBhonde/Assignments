package com.company;

	class SingletonInheritanceCheck{
    private SingletonInheritanceCheck(){
        System.out.println("Hii, I am a statement inside the singleton class");
    }
}

class SingleDerivedClass extends SingletonInheritanceCheck{
    public SingleDerivedClass(){
        super();
        System.out.println("Hii, I am a statement inside the derived class");
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {

    }
}

class SingletonInheritanceCheck{

    private static SingletonInheritanceCheck X = null;

    private SingletonInheritanceCheck(){
        System.out.println("HI, I am a statement inside the singleton class");
    }

    public static SingletonInheritanceCheck getInstance(){
        if (X== null)
            X = new SingletonInheritanceCheck();

        return X;
    }
}

public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck x = SingletonInheritanceCheck.getInstance();


        SingletonInheritanceCheck y = SingletonInheritanceCheck.getInstance();

        SingletonInheritanceCheck z = SingletonInheritanceCheck.getInstance();

        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        if (x == y && y == z) {

            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
