public class Employee {
    String Name;
    String designation;
    String Address;
    String Dept;
    int Age;
    double Salary;

    public void setName(String name){
       System.out.println("Your name is:"+name);
    }

    public void setDesignation(String desig){
        System.out.println("Your designation is:"+desig);


    }
    public void setAge(int Age){
        System.out.println("Your age is:"+Age);
    }
    public void setAddress(String address){
        System.out.println("Your Address is:"+address);

    }

    public void setDept(String Dept){
        System.out.println("Your Department is:"+Dept);
    }

    public class main{
        public static void main(String args[]){
        Employee emp=new Employee();
        emp.setName("John");
        emp.setDesignation("Manager");
        emp.setAge(30);
        emp.setAddress("123 Main St");
        emp.setDept("Sales");
    }
    
    }
}

