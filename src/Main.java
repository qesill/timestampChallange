import java.util.Date;

public class Main {
    public static void main(String[] args) {



     /*
            1. Stwórz datę w przyszłości korzystając z timestamp,
               dodaj do aktualnej daty 3 dni, 10 godzin i 25 minut
			2. W date wywołaj getTime() aby uzyskać ilość milisekund
			   od 1 stycznia 1970r (1000 milisekund = 1 sekunda).
			   To jest Twój timestamp
			3. Oblicz potrzebną ilość milisekund które musisz
			   dodać do aktualnego timestamp.
			   Np jedna godzina to 60 * 1000 * 60
			4. Stwórz nowy obiekt Date i do jego konstruktora przekaż
			   powiększony timestamp, wyświetl nową datę.

         */

    Date date = new Date();
    long timestamp = date.getTime(); // 1000 milisekung = 1 sekunda

        long hour = 60 * 1000 * 60; //1h w milisekundach
        long day = 60 * 1000 * 60 * 24;
        long minut = 60 * 1000;
        long futureTimestamp = timestamp + 3*day + 10*hour + 25 *minut;

        Date futureDate = new Date(futureTimestamp);
        System.out.println(futureDate);


    }
}
