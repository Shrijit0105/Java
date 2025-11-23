
import java.util.*;
import java.text.*;

public class DateDemo{
  public static void main(String[] args){
    Date now= new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss a zzz");
    System.out.println("Current Date:"+ft.format(now));
  }

}