package oop;
class car{
    int wheels,headLight;
    String color;
    car(int valuew){
        wheels=valuew;
    }
    car(int wheels, String color){ //constructor overloading
        this.wheels = wheels;
        this.color = color;
        headLight = 3;
    }

}
class Cat{
    String color, breed;
    int legs,eyes;
    public void walk(){
        System.out.println("Cat can walk");
    }
    public void sleep(){
        System.out.println("Sleep now");
    }
}
class Dog{
    String head, sex, name;
    public void lafalafi(){
        System.out.println("Yes he can do");
    }
}


public class classObject {
    public static void main(String[] args) {
        int c=5,d=43;
        swap(c,d);
        System.out.println(c + " " +d); //pase by value

        Cat c1 = new Cat();
        Cat c2 = new Cat();

        car priCar = new car(4); //constructor
        System.out.println(priCar.wheels+" wheels");

        car cng = new car(3,"Green");
        System.out.println(cng.wheels +" wheels and color: "+ cng.color+" and head light "+ cng.headLight);

        c1.breed = "yes";
        c1.color = "Black&white";
        c1.sleep();
        System.out.println("He has a breed: "+ c1.breed +" Color is: "+ c1.color+" and good");


    }
    public static void swap(int a, int b){ //method
        int temp = a;
        a = b;
        b = temp;
        return;
    }

}
