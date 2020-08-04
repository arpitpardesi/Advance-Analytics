package com.zensar.day2.classes;

public class ex2 {
    int x = 20;
    String name = "Zensar";

 

    public static void main(String[] args) {
        ex2 obj1 = new ex2();
        System.out.println(obj1.x);
        System.out.println(obj1.name);
        System.out.println("***************");
        ex2 obj2 = new ex2();
        obj2.x = 30;
        obj2.name = "Microsoft";
        System.out.println(obj2.x);
        System.out.println(obj2.name);
    }

 

}