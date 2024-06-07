//create java file with Animal.java

//public class Animal {
//    public void eat(){
//        System.out.println("Animal is Eating");
//    }
//    public static void main(String[] args) {
//        Animal dog = new Animal();
//        dog.eat();
//        sleep();
//        Bird kabootar = new Bird();
//        kabootar.fly();
//    }
//    public static void sleep(){
//        System.out.println("I am sleeping, GOOD NIGHT!!");
//    }
//}
//NOTE --> Since humne jo methods banaye inside the class woh static keywords ka use krke nhi banaye so isiliye hume har ek method
//ko execute krne ke liye Animal class ka object create krna pada
//aur wahi SLEEP() method mei since humne static keyword ka use kiya so in that case hume OBJECT CREATION ki need nhi padi


//maan lo we are creating another class BIRD and uske methods ko mujhe execute krna hai
//so kyunki ye ek doosri class hai, we will have to create the object of this class in main method
//class Bird{
//    public void fly(){
//        System.out.println("GO KABOOTAR GO!!");
//    }
//}


// ------------------- OBJECT INITIALIZATON / OBJECT PROPERTIES INITIALIZATION -----------------------
//Method - 1 (Using Reference variables)
//class Animal{
//    String color;
//    float weight;
//
//    public static void main(String[] args) {
//        Animal dog = new Animal();
//        dog.color = "black";
//        dog.weight = 15.66f;
//        System.out.println("Color of Dog : "+dog.color);
//        System.out.println("Color of Dog : "+dog.weight);
//    }
//}

//METHOD - 2 {USING METHOD}
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
    }
}

