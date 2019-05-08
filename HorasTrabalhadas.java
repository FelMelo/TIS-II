
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;


public class HorasTrabalhadas {

    private static LocalTime now2, saida;
    private static int horasTrabalhadas;

    public static LocalTime CheckIn() {
        ZoneId hora = ZoneId.of("Brazil/East");
        LocalTime now2 = LocalTime.now(hora);

       // now2 = LocalTime.of(8, 0, 0);
        return now2;
    }

    public static LocalTime CheckOut() {
       ZoneId hora = ZoneId.of("Brazil/East");
        LocalTime now2 = LocalTime.now(hora);

       // now2 = LocalTime.of(8, 0, 0);
        return now2;

    }
    
    

	 private static void CalculoHoras() {
	        horasTrabalhadas = saida.getHour() - now2.getHour();
	        int diferencaMinutos = saida.getMinute() - now2.getMinute();
	
	        if (diferencaMinutos >= 45) {
	            horasTrabalhadas++;
	        } else if (diferencaMinutos <= 45) {
	            horasTrabalhadas--;
	        }
	    }

}
