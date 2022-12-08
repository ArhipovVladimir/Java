import java.util.LinkedList;

// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список.

import java.util.Random;

public class ReversLinkedList {
   
    
  

static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
  
     
            revLinkedList.add(llist.get(i));
        }
     
        return revLinkedList;
    }

public static void main(String[] args) {
    
        LinkedList<Integer> ll = new LinkedList<>();
        Random rnd = new Random();
                   
            for (int i = 0; i < 10; i++) {
                int val = rnd.nextInt(-100, 100);
                ll.add(val);
            }
        System.out.println("Исходный");  
        System.out.println(ll);
        
        LinkedList llrev = reverseLinkedList (ll);
      
        System.out.println("Перевертышь");
        System.out.println(llrev);
    }

}


