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
        enqueue(ll, 9);
        System.out.println("добавил элемент - 9 ");
        System.out.println("список с элементом");
        System.out.println(ll);
        System.out.println("первый элемент в очереди");
        System.out.println(dequeue(ll));
        System.out.println("список без элемента");
        System.out.println(ll);
        System.out.println(first(ll));
        System.out.println("элемент не удален");
        System.out.println(ll);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
    
    
    
    }

