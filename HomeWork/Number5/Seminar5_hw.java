ДЗ

1. Реализуйте структуру телефонной книги с помощью HashMap,учитывая,что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", 123456);
        phoneBook.add("Ivanov", 654321);
        phoneBook.add("Petrov", 654321);
        System.out.println(phoneBook.find("Ivanov"));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(phoneBook.find("Me"));
    }}

    2. Пусть дан список сотрудников:

    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов

    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
    import java.util.*;

    public class Persons {
        public static void main(String[] args) {
                   
            String namesString = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
            
            String[] namesArray = namesString.split(", ");
    
            HashMap<String, Integer> names = new HashMap<String, Integer>();
    
            for (String name : namesArray) {
                        String[] FullName = name.split(" ");
                        if (names.containsKey(FullName[0])) {
                            names.put(FullName[0], names.get(FullName[0]) + 1);
                        } else {
                            names.put(FullName[0], 1);
                        }
                    }
            
            List<Integer> positions = new ArrayList<Integer>(names.values());
            positions.sort(Collections.reverseOrder());
    
            HashMap<String, Integer> sortedNames = new LinkedHashMap<String, Integer>();
            for (int position : positions)
            {
                for (String name : names.keySet()){
                    if (position == names.get(name)) {
                        sortedNames.put(name, position);
                     }
                }
            }     
            System.out.println(sortedNames);      
        }
    }
    
3.* Реализовать алгоритм пирамидальной сортировки (HeapSort).

	public class HeapSort {
    public static void main(String[] args) {
        int[] initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
           System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));

       heapSort(initArray, initArray.length);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }

    public static void buildTree(int[] tree, int sortLength) {
        // Для всех вершин дерева начиная с середины сортируемой части массива
        // (движемся влево до нулевого индекса)
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            int maxIndex;
            // Если у вершины два листа, выбираем больший
            if (i * 2 + 2 <= sortLength - 1) {
                if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
                else maxIndex = i * 2 + 1;
            // Иначе один лист
            } else maxIndex = i * 2 + 1;
            // Сравниваем лист с максимальным значением с вершиной, при большем значении
            // дочернего элемента меняем его местами с вершиной
            if (tree[i] < tree[maxIndex]) {
                int temp = tree[i];
                tree[i] = tree[maxIndex];
                tree[maxIndex] = temp;
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Выход из рекурсии: длина сортируемой части равна 0
        if (sortLength == 0) return;
        // Выстраивание элементов части массива в виде сортирующего дерева
        buildTree(sortArray, sortLength);
        // Замена местами первого и последнего элемента в сортируемой части
        int temp = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = temp;
        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
        heapSort(sortArray, sortLength - 1);
    }
}


4.* На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
https://habr.com/ru/post/343738/

public class Queens {
    public static void main(String[] args) {
        int[][] board = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        if (!solveNQueens(board, 0)) {
            System.out.println("No solution");
            return;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkPosition(int[][] board, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 1)
                return false;
        }
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (int i = row + 1, j = column - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

    public static boolean solveNQueens(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (checkPosition(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueens(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
}

