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
/*
IMPORTANT QUESTIONS

Q.1
Can we achieve METHOD OVERLOADING by changing the RETURN TYPE of function
Ek kaam krte hai code krke hi dekh lete hai


class Animal{
    public void display(){
        System.out.println("Hello with return type void");
    }

    public String display(){
        System.out.println("Hello with return type String");
    }
    public static void main(String[] args) {
        System.out.println("Main Hoon Animal class!!");
        Animal a1 = new Animal();
        a1.display();
    }
}

OUTPUT --> java: method display() is already defined in class Animal
AMBIGUITY ERROR aa rha hai

CONCLUSION -> In java, METHOD OVERLOADING is NOT POSSIBLE by changing the return type of method


Q.2
Can we overload main() method??

chaliye same cheez, code krke check krte hai

class Animal{
    public static void main(String[] args) {
        System.out.println("I am normal main method");
        //creating object
        Animal a2 = new Animal();
        a2.main(33);
    }
    //overloading the main() method by passing different type argument
    public void main(int num){
        System.out.println("I am the Overloaded main method");
        System.out.println("Integer value : "+num);
    }
}

OUTPUT -->
I am normal main method
I am the Overloaded main method
Integer value : 33

CONCLUSION -> Yes,hamare paas different number of overloaded main methods ho sakte hai, because JVM hamesha sabse pehle main(String[] args) iss method ko call krta hai
so agar humne bhi different types of parameters ke main method banaye we can call them by CREATING THEIR OBJECT

SPECIAL CASES in METHOD OVERLOADING

1 - AUTOMATIC TYPE PROMOTION
basically jab hum method ke andar aise type ka argument pass karte hai jiska type kisi bhi existing method se match nhi krta than in that case
JAVA AUTOMATIC TYPE PROMOTION perform krta hai so that TYPE PROMOTION ke baad agar kisi bhi existing method ke saath agar DATA TYPE match ho toh usko call lag jaaye

Ek program example se samajhte hai
public class Main
{
    public void display(String a){
        System.out.println("String method");
    }
    public void display(int a){
        System.out.println("int method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.display('a');//passed parameter is of TYPE CHARACTER
	}
}

OUTPUT --> int method {automatic type promotion hua char ka int mei and usne int parameter wale method ko call kiya}


OBJECT METHOD ko call lagti hai agar argument ka datatype match nhi hota kisi bhi method se
//CODE EXAMPLE
public class Main
{
    public void display(String a){
        System.out.println("String method");
    }
    public void display(Object a){
        System.out.println("Object method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.display('a');//passed parameter is of TYPE CHARACTER
	}
}

OUTPUT --> Object method

Object class is PARENT CLASS of all the classes in java

NOTE --> But agar hamare paas aise do methods hai jisme ek mei Object parameter hai and ek mei String hai
so agar humne string type ka argument pass kiya toh PRIORITY hamesha child ko hi milegi means String parameter wala method will be executed

//CODE EXAMPLE
public class Main
{
    public void display(String a){
        System.out.println("String method");
    }
    public void display(Object a){
        System.out.println("Object method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.display("abcd");
	}
}

OUTPUT --> String method

AMBIGUITY BETWEEN string and stringbuffer
public class Main
{
    public void display(StringBuffer a){
        System.out.println("StringBuffer method");
    }
    public void display(String a){
        System.out.println("String method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.display("abc");
		m.display(new StringBuffer("def"));
		m.display(null);//ambiguity arise hoga because do same level pe hai
	}
}

AMBIGUITY BETWEEN string and stringbuffer and OBJECT
public class Main
{
    public void display(StringBuffer a){
        System.out.println("StringBuffer method");
    }
    public void display(String a){
        System.out.println("String method");
    }
    public void display(Object a){
        System.out.println("Object method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		m.display("abc");
		m.display(new StringBuffer("def"));
		m.display(null);//still ambiguity
	}
}


 ~ AMBIGUITY error iss case mei bhi arise hota hai jab hum ek method aisa banate hai
 jisme ek parameter doosre parameter ka AUTOMATIC TYPE PROMOTION ho
 ek example se samjhte hai

 public class Main
{
    public void display(int a,float b){
        System.out.println("Int and Float method");
    }
    public void display(float a,int b){
        System.out.println("Float and Int method");
    }
	public static void main(String[] args) {
		Main m = new Main();
		//first wala method call type promotion ke ambiguity ko darshata hai
		m.display(20,20);//output --> error: reference to display is ambiguous , both method display(int,float) in Main and method display(float,int) in Main match
		//upar waala method jab call karoge, tab woh confuse ho jaayega ki mai AUTOMATIC PROMOTION karke  display(float a,int b) isko call karu yaa phir display(int a,float b)
		// means m.display(20,20) mei se first waale 20 ko float mei convert karu yaa phir second wale ko

		//m.display(20.2f,20.2f);//output --> no suitable method found for display(float,float)
		m.display(20,20.2f);
		m.display(20.2f,20);
	}
}

varags as a parameter in POLYMORPHISM

public class Main
{
    public void callInt(int a){
        System.out.println("Single argument of int can be taken!!");
    }
    public void callInt(int... a){
        System.out.println("Multiple arguments passed!!");
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Main m = new Main();
		m.callInt(23);
		m.callInt(34,23,'f');//yaha dekho humne toh character pass kiya but woh khudka type promotion krke int mei convert ho jaayega
		m.callInt(34,23,"apple");//output -> error: method callInt in class Main cannot be applied to given types;
		m.callInt(34,23,89,31);
		m.callInt();// because a varargs parameter can also handle zero arguments, woh intetnally zero size ka array create kaega iss case mein
	}
}

Main class wale code you can easily run here --> https://www.onlinegdb.com/online_java_compiler
*/
