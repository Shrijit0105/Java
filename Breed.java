
class Dog{
    String breed;
    int age;
    String color;

    public void setBreed(String breed){
        this.breed=breed;

    }
    public void setAge(int age){
        this.age=age;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void printDetails(){
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}
public class Breed{
    public static void main(String[] args){
       Dog obj = new Dog();
    obj.setBreed("Beagle");
    obj.setAge(2);
    obj.setColor("Brown");
    obj.printDetails();
    }
}