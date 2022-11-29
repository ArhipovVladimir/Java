// ДЗ 2. 
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
import java.util.logging.*;
import java.io.IOException;

public class Program {

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d, ", i);

        }
    }

    static void sortyBudle(int[] array) throws SecurityException, IOException  {

        int length = array.length;
        int sortetPos = 0;
        int temp = 0;
        FileHandler fh = new FileHandler("log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        while (sortetPos < length - 1) {
            int index = 0;
            while (index < length - 1 - sortetPos) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    loger(array, fh, sFormat);
                    // array[index], array[index+1] = array[index+1], array[index];
                }
                index++;
            }
            sortetPos++;
        }

    }

           
        private static void loger(int[] array, FileHandler fh, SimpleFormatter sFormat) {
    }

        static void loger(String array, FileHandler fh, SimpleFormatter sFormat) {
        
            Logger logger = Logger.getLogger(Program.class.getName());
            logger.addHandler(fh);
            
            
            fh.setFormatter(sFormat);
                
            //logger.setLevel(Level.INFO);
            logger.log(Level.WARNING, array);
            logger.info(array);
    
        }
        


    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = new int[] { 10, 15, 13, 12, 25, 38, 3, 15, 33, 37, 22, 4, 8, 5 };

        System.out.println("Не сортирован");
        print(array);
        sortyBudle(array);
        System.out.println();
        System.out.println("сортирован");
        print(array);

    }

}

