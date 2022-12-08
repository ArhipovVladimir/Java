
import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedArrList {
    public static void main(String[] args) {
    var s = System.currentTimeMillis();
    ArrayList<Integer> al = new ArrayList<Integer>();
    for (int i = 0; i < 1_000_000; i++) {
            al.add(i);
    }
    System.out.println(System.currentTimeMillis() - s);
    
    var s1 = System.currentTimeMillis();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    for (int i = 0; i < 1_000_000; i++) {
            ll.add(i);
    }
    System.out.println(System.currentTimeMillis() - s1);

    }
    }