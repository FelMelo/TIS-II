
import java.time.LocalDate;
import java.time.LocalTime;

public class HorasTrabalhadas {

    private static LocalTime entrada, saida;
    private static int horasTrabalhadas;

    static LocalTime CheckIn() {
        entrada = LocalTime.of(8, 0, 0);
        return entrada;
    }

    static LocalTime CheckOut() {
        saida = LocalTime.of(17, 0, 0);
        return saida;

    }

    static void CalculoHoras() {
        horasTrabalhadas = saida.getHour() - entrada.getHour();
        int diferencaMinutos = saida.getMinute() - entrada.getMinute();

        if (diferencaMinutos >= 45) {
            horasTrabalhadas++;
        } else if (diferencaMinutos <= 45) {
            horasTrabalhadas--;
        }

    }

}
