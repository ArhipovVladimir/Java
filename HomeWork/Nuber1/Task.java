import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2. Вывести все простые числа от 1 до 1000 
// 3. Реализовать простой калькулятор + - / * 
// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Task {
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
