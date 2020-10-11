package Encapsulation;

public class mainClass {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(30);
        obj.setName("Tariqul Islam");
        System.out.println("Age: "+obj.getAge() +" name: "+obj.getName());
    }
}
