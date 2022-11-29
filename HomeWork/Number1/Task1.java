package HomeWork.Number1;

import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введи число");
        int num = iScanner.nextInt();
        int result = 1;
        for (int index = 1; index < num+1; index++) {
            result = result * index;
          
        }
        System.out.printf("произведение чисел от 1 до %d равна %d", num, result);
        iScanner.close();
    }

    
}
