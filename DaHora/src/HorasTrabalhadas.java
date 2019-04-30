import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HorasTrabalhadas {
       private static void CheckIn() {
       	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
   }
   private static void CheckOut() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
   } 
   private static void CalculoHoras() {
       
      // horastrabalhadas = CheckOut() - CheckIn();
     // return horastrabalhadas;
        
   } 
    
}
