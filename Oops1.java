//Run the java code by creating their respective .java files
public class Animal {
   public void eat(){
       System.out.println("Animal is Eating");
   }
   public static void main(String[] args) {
       Animal dog = new Animal();
       dog.eat();
       sleep();
       Bird kabootar = new Bird();
       kabootar.fly();
   }
   public static void sleep(){
       System.out.println("I am sleeping, GOOD NIGHT!!");
   }
}
//NOTE --> Since humne jo methods banaye inside the class woh static keywords ka use krke nhi banaye so isiliye hume har ek method
//ko execute krne ke liye Animal class ka object create krna pada
//aur wahi SLEEP() method mei since humne static keyword ka use kiya so in that case hume OBJECT CREATION ki need nhi padi


//maan lo we are creating another class BIRD and uske methods ko mujhe execute krna hai
//so kyunki ye ek doosri class hai so static method declaration se kaam nhi chalega we will have to create the object of this class in main method
//class Bird{
//    public static void fly(){
//        System.out.println("GO KABOOTAR GO!!");
//    }
//}


// ------------------- OBJECT INITIALIZATON / OBJECT PROPERTIES INITIALIZATION -----------------------
//APPROACH 1 - (Using Reference variables)
class Animal{
   String color;
   float weight;

   public static void main(String[] args) {
       Animal dog = new Animal();
       dog.color = "black";
       dog.weight = 15.66f;
       System.out.println("Color of Dog : "+dog.color);
       System.out.println("Color of Dog : "+dog.weight);
   }
}

//APPROACH 2 - {USING METHOD}
class Animal{
    String color;
    float weight;
    public void setValue(String c,float w){
        color = c;
        weight = w;
    }
    public void display(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.setValue("Moti",23.44f);
        a.display();
        Employee e1 = new Employee("Aman",22);
        Employee e2 = new Employee("Vishal",22);
        System.out.println("Employee 1 : "+e1.name+" age : "+e1.age);
    }
}

//METHOD 3 - USING CONSTRUCTOR
// CONSTRUCTOR basically ek method hi hai, but ye ek special kind of method hai which has name same as that of the CLASS NAME
//now basically ab ye question arise hota hai ki hume kyu OBJECT INTIALIZATION ke liye constructor ka use krna chahiye
// basically ye isliye hai kyunki agar humne APPROACH 1 yaa 2 mei se koi bhi use kiya toh uss case mei hume agar 1000 objects ki value ko initialize karana hai than
// hume 1000 lines ko code likhna padega har baar ek new object ko create krne ke liye and if we consider ki hume 'N' number of INSTANCE VARIABLES ki values ko initialize karana hai
// than hume 1000*N number of lines extra likhni padegi which opposes DRY{DON'T REPEAT YOURSELF} principle

// so basically we can do it using PARAMETERIZED CONSTRUCTOR
class Employee{
    String name;
    int age;
    Employee(String n,int i){
        this.name = n;
        this.age = i;
    }

}

//waise generally we have 3 types of constructors
// 1 - DEFAULT CONSTRUCTOR {which is created by COMPILER and it assigns default values in it}
// CODE EXAMPLE
//create karo java file with Main.java

public class Main
{
    String name;
    int age;
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main m = new Main();
        System.out.println(m.name);
        System.out.println(m.age);
    }
}

// 2 - No Arguments constructor {which is craeted by user only but no arguments are passed for INSTANCE VARIABLE INITIALIZATION}
// CODE EXAMPLE
//create karo java file with Main.java
public class Main
{
    String name;
    int age;
    public Main(){
        // this.name = "Raaju";
        // this.age = 45;
        //note ye jo values upar initialize kiya hai woh agar nhi karenge toh DEFAULT VALUES hi set ho jaayengi
        System.out.println("Constructor Called!!");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main m = new Main();
        System.out.println(m.name);
        System.out.println(m.age);
    }
}

// 3rd type is PARAMETERISED CONSTRUCTOR jo upar already dekh chuke hai
