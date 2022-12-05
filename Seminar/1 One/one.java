package Seminar.One;
import java.time.LocalDateTime;
import java.util.Scanner;



public class one {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Как тебя зовут?");
            String name = iScanner.nextLine();
            int hour = LocalDateTime.now().getHour();
            String text = "";
            if ((hour >= 5) && (hour < 12)); text = "Доброе Утро";
            if ((hour >= 12) && (hour < 18)); text = "Добрый День";
            if ((hour >= 18) && (hour < 23)); text = "Добрый Вечер";
            if ((hour >= 23) && (hour < 5)); text = "Доброй Ночи";
            System.out.println(name);
            System.out.printf(text);
            System.out.println(hour);
            iScanner.close();
        } 

}
    

