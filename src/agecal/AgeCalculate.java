package agecal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class AgeCalculate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	    Scanner s= new Scanner(System.in);
        System.out.println("enter your Dob");
        String dob=s.next();
        SimpleDateFormat sd= new SimpleDateFormat("dd-mm-yyyy");
        Date udob= sd.parse(dob);
        Date sysdate= new Date();
        long ms=System.currentTimeMillis()-udob.getTime();
        long age=(long)((long)ms/(1000.0*60*60*24*365));
        System.out.println("your current age is:"+age);
    
	}

}
