class Car {
          String modelname="Toyota Supra";
          double price=4000000;  
       }
     public class modifying {
      public static void main(String[] args){
          Car myCar = new Car();
           System.out.println("-----Before modifying the attributes--");
          System.out.println(myCar.modelname);
          System.out.println(myCar.price);

          //new changes or modifying the attributes

          myCar.modelname="Nissan GTR R-35";
          myCar.price=40000000;
      System.out.println("-----After modifying the attributes--");
          System.out.println(myCar.modelname);    
          System.out.println("Price:₹%.2f%n"+ myCar.price);
      }

}



    
