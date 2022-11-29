package HomeWork.Number1;

import java.util.Scanner;
// 3. Реализовать простой калькулятор + - / * 
// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Task3 {
    public static void main(String[] args) {
        char op;
        double result;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введи число ");
        int num1 = iScanner.nextInt();
        System.out.printf("введи операцию ");
        op = iScanner.next().charAt(0);
        System.out.printf("введи число ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        switch(op) {
            case '+': result = num1 + num2;
               break;
            case '-': result = num1 - num2;
               break;
            case '*': result = num1 * num2;
               break;
            case '/': result = num1 / num2;
               break;
            default:  System.out.printf("ошибка с оператором");
        
            return;
        }
        System.out.print("\n результат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + result);
    }


    
}