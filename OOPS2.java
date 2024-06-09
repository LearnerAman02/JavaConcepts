
public class OOPS2 extends Human{
    //isme hum samjhenge INHERITANCE ko in java
    //INHERITANCE --> jab ek child class apne parent class ke properties and methods ko inherit krti hai than use hum INHERITANCE kehte hai
    //CODE EXAMPLE
    //NOTE --> hamari yaha pe parent class hai Human and child class hai OOPS2
    //and INHERITANCE ke liye hum {EXTENDS} keyword ka use krte hai
    //and so now eat() method OOPS2 ke object ka bhi method ho jaayega
    public static void main(String[] args) {
        OOPS2 obj1 = new OOPS2();
        obj1.eat();
    }
}

class Human{
    public void eat(){
        System.out.println("I am eating!!");
    }
}

//TYPES OF INHERITANCE
/*
1 - SINGLE INHERITANCE
2 - MULTILEVEL INHERITANCE
3 - MULTIPLE INHERITANCE
4 - HIERARCHICAL INHERITANCE
5 - HYBRID INHERITANCE

j

//code example
1 - SINGLE INHERITANCE
run in filename Main.java
public class Main extends ClassA
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m = new Main();
		m.say();
	}
}

class ClassA{
    public void say(){
        System.out.println("Hello Duniya from class A !!");
    }
}


//code example
2 - MULTI LEVEL INHERITANCE

run in filename Main.java
public class Main extends ClassA
{
    public void sayHii(){
        System.out.println("Hii from Main class!!");
    }
	public static void main(String[] args) {
	    System.out.println("Class Main inherits ClassA");
		Main m = new Main();
		m.say();//inherited from ClassA
		System.out.println("Class B inherits Main class as well as ClassA");
		ClassB b1 = new ClassB();
		b1.say();//inherited from ClassA
		b1.sayHii();//inherited from class Main
		b1.sayB();//method of classB itself
	}
}

class ClassA{
    public void say(){
        System.out.println("Hello Duniya from class A !!");
    }
}

class ClassB extends Main{
    public void sayB(){
        System.out.println("Hello Duniya from class B !!");
    }
}

// 3 - Hierarchical INHERITANCE

run in filename Main.java
public class Main extends ClassA
{
    public void sayHii(){
        System.out.println("Hii from Main class!!");
    }
	public static void main(String[] args) {
	    System.out.println("Hierarchical Inheritance");
	    //ClassC inherits properties and methods from ClassA and ClassB
	    ClassC c1 = new ClassC();
	    c1.sayA();
	    //c1.sayB();ClassB ke method ko inherit nhi kar sakta
	    c1.sayC();
	    ClassB b1 = new ClassB();
	    b1.sayA();
	    b1.sayB();
	    //b1.sayC();ClassC ke n=method ko inherit nhi kiya hai
	}
}

class ClassA{
    public void sayA(){
        System.out.println("Hello Duniya from class A !!");
    }
}

class ClassB extends ClassA{
    public void sayB(){
        System.out.println("Hello Duniya from class B !!");
    }
}

class ClassC extends ClassA{
    public void sayC(){
        System.out.println("Hello Duniya from class C !!");
    }
}

NOTE --> Jab inheritance hota hai tab class A ke constructor ko aur uske private methods and properties ko inherit nhi karega class B

*/
