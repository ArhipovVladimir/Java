import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Заполнить список названиями планет Солнечной системы в 
// произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

public class Number3 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> planets = new ArrayList<String>();
        planets.add("Mеркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Mеркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        String[]SunSystem = new String[] {"Меркурий", "Венера", "Земля", "Марс"};
        for (int i = 0; i < 15; i++) {
            planets.add(SunSystem[(int)(Math.random() * 3)]);
        }
     
        System.out.println(planets);
        planets.sort(null);
        System.out.println(planets);

    
        int occurrences = Collections.frequency(Panets, planet);
            
       



        // public static int Cou (Srting planet, List planets) {
        //     return count;
        // }
    }
            

}
  

  
  


