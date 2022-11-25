package Seminar.One;

public class Tow {
    public static void main(String[] args) {
        int [] arr = new int[] {1,0,1,1,0,1,1,1,0,0,1,1,1,1};
        int count = 0;
        int maxm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) { count++;  
            }
            
            else  count = 0;
            
            if (maxm < count)  {maxm = count;    
            }
            
        } 
        
        System.out.println(maxm); 

        }
    }
    