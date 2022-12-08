// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class ReversLinkedList {
   
    public static void main(String[] args) {
    
        LinkedList<Integer> ll = new LinkedList<>();
        Random rnd = new Random();
                   
            for (int i = 0; i < 10; i++) {
                int val = rnd.nextInt(-100, 100);
                ll.add(val);
            }
        System.out.println("Исходный");  
        System.out.println(ll);
    
         int temp = 0;
        while (temp != ll.size() - 1) {
            ll.add(ll.size()-temp, ll.getFirst());
            ll.removeFirst();
            temp++;
        }
        System.out.println("Перевертышь");
        System.out.println(ll);
    

}

}


