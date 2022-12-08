// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди, 
// - dequeue() - возвращает первый элемент из очереди и удаляет его, 
// - first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Random;

public class Qvesr {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        Random rnd = new Random();
                   
            for (int i = 0; i < 10; i++) {
                int val = rnd.nextInt(-100, 100);
                ll.add(val);
            }
        System.out.println("Исходный");  
        System.out.println(ll); 
    }
}
