package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Bob Esponja";
        LocalDate today = LocalDate.now();
        Locale brazil = Locale.of("pt", "BR");
        String dateOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil);
        String saudacao;
        LocalDateTime rightNow = LocalDateTime.now();

        if (rightNow.getHour() >= 0 && rightNow.getHour() < 12){
            saudacao = "Bom dia";
        } else if (rightNow.getHour() >= 12 && rightNow.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (rightNow.getHour() >= 18 && rightNow.getHour() < 24){
            saudacao = "Boa noite";
        } else {
            saudacao = "Bye bye";
        }

        System.out.printf("%s, %s. Hoje é %s.%n",saudacao, name, dateOfWeek);
    }
}
