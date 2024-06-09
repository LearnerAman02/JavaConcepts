/*
so first of all ye samajhte hai ki POLYMORPHISM ka meaning kya hai
//isme hum samjhenge POLYMORPHISM ko

POLY - many, MORPHISM - forms
Aur basically hum yaha par methods banate hai jiske alag alag forms hote hai
eg.
public void sayHello(){
System.out.println("Hello Duniya!!");
}

public void sayHello(String name){
System.out.println("Hello "+name+"!!");
}
upar same hi method ke do alag alag forms hai - ek hai with no arguments and ek hai with argument
isiko polymorphism of methods bolenge

so java mei basically we have 2 types of POLYMORPHISM
1 - COMPILE TIME POLYMORPHISM
 ~ It is also known as STATIC POLYMORPHISM
 ~ It is handled by COMPILER
 ~ Iss type of POLYMORPHISM ko hum achieve krte hai with the help of METHOD OVERLOADING

2 - RUN TIME POLYMORPHISM
 ~ It is also known as DYNAMIC POLYMORPHISM
 ~ It is handled by JVM
 ~ Iss type of POLYMORPHISM ko hum achieve krte hai with the help of METHOD OVERRIDING


NOW METHOD OVERLOADING and METHOD OVERRIDING 2 important concepts hai related to POLYMORPHISM

--------------------- METHOD OVERLOADING ---------------------
 - Method overloading tab hota hai jab methods ka name same ho
 - ye methods same class ke andar present ho
 - Ye method ke arguments sirf differ krne chahiye {NO. OF ARGS, TYPE OF ARGS, ORDER OF ARGS}


--------------------- METHOD OVERRIDING -------------------
 - Method overloading tab hota hai jab methods ka name different ho
 - ye methods different class ke andar OVERRIDE kiye jaate hai
 - Ye method ke arguments  same args hote hai 
*/
public class OOPS3 {
    //same class ke andar ab hum different args waale methods banayenge to achieve METHOD OVERLOADING
    public void display(){
        System.out.println("No arguments wala display function hoon mai");
    }

    //now niche ke do methods honge of METHOD OVERLOADING by different types of arguments
    public void display(int num){
        System.out.println("Integer argument wala display function, int value is : "+num);
    }
    public void display(String name){
        System.out.println("String argument wala display function, String value is : "+name);
    }

    //now niche ke do methods honge of METHOD OVERLOADING by different order of arguments
    public void display(int age,String name){
        System.out.println("Method overloading by differnt order of arguments");
        System.out.println("First Argument age : "+age+", Second argument name : "+name);
    }

    public void display(String name,int age){
        System.out.println("Method overloading by differnt order of arguments");
        System.out.println("First Argument name : "+name+", Second argument age : "+age);
    }
    public static void main(String[] args) {
        //creating object of the class
        OOPS3 obj1 = new OOPS3();
        //method with no argument
        obj1.display();
        //methods with different types of parameters
        obj1.display(34);
        obj1.display("Ram");
        //methods with different order of parameters
        obj1.display(18,"Rohan");
        obj1.display("Rohan",18);
    }
}
