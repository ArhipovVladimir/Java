// ДЗ 2. 
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.


public class Program {
  
    public static void main(String[] args) {
        int [] array = new int [] {1,15,13,12,25,38,3,15,33,37,22,4,8,5};
        System.out.println(array);
        int length = array.length;
        int sortetPos=0;    
        int temp = 0;
        while (sortetPos<length-1)
        {
            int index=0;
            while (index<length-1-sortetPos)
            {
                if (array[index] > array[index+1])
                {
                    temp = array[index];
                    array[index] =  array[index+1];
                    array[index+1] = temp;
                    // array[index], array[index+1] = array[index+1], array[index];
                }
                index++;
            }
            sortetPos++;
            System.out.println(array);
        }
                    
        }

    }
    



// сишарп
// void SortBuble (int[] array)
// {
//     int length = array.Length;
//     int sortetPos=0;    
//     while (sortetPos<length-1)
//     {
//         int index=0;
//         while (index<length-1-sortetPos)
//         {
//             if (array[index] > array[index+1])
//             {
//                 (array[index] , array[index+1]) = (array[index+1] , array[index]);
//             }
//             index++;
//         }
//         sortetPos++;

//     }
// }