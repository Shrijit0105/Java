public class MultilevelInheritance {
    void display(){
        System.out.println("This is the base class.");
    }

    class A extends MultilevelInheritance{
        void show(){
            System.out.println("This the first level derived class.");
        }
    }

    class B extends A{
        void next(){
            System.out.println("This is the second level derived class.");
        }

     class C extends B{
        void last(){
            System.out.println("This is the third level derived class.");
        }   
    }

    public static void main(String[] args) {
        
        MultilevelInheritance obj = new MultilevelInheritance();
        MultilevelInheritance.A obj1 = obj.new A();
        MultilevelInheritance.B obj2 = obj1.new B();
        MultilevelInheritance.B.C obj3 = obj2.new C();

        obj.display();
        obj1.show();
        obj2.next();
        obj3.last();
    }

}
}





