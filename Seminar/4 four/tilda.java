import java.util.LinkedList;
import java.util.Scanner;


public class tilda {
    public static void main(String[] args) {
       java.util.LinkedList <String> ll = new LinkedList<String>();
       String str = null;

        boolean repeat = true;
        while (repeat) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("введите строку");
            String nString = iScanner.nextLine();     
            
            iScanner.close();

            String [] sArr = "`".split(nString); 
                        
            if (sArr[0].equals("text")){
                ll.add(sArr[1], sArr[0]);
            }
            if (sArr[0].equals("print")){
                str = ll.pop();
                ll.add(sArr[1], sArr[0]);
            }


        }
        
        
        
    }
}
