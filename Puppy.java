public class Puppy {
    int PuppyAge;


public void PuppyName(String name){
    System.out.println("the name of the puppy is:"+name);
}
public void setAge(int age){
    PuppyAge=age;
   
   System.out.println("The age of the puppy is:"+age);
}

public int getAge(){

    return PuppyAge;
}

public static void main(String args[]){
    Puppy myPuppy=new Puppy();
    myPuppy.PuppyName("tommy");
    myPuppy.setAge(3);
    System.out.println("the age of the puppy is:"+myPuppy.getAge());

}

}