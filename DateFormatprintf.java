import java.util.Date;

public class DateFormatprintf{
    public static void main(String[] args){
        Date date= new Date();
        String str= String.format("Current Date: %tc", date);
        System.out.println(str);

    }
    
}
