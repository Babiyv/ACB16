package week2.day1;

public class _03LoopsIntroduce {
    public static void main(String[] args) {
        int[] nums = new int [15];   // - количество ячеек


// start  point
     int i = 0;
// condition
     while (i < nums.length) {
         nums[i] = i;  // - ячейка под номером i = числу i
// step
         i++;   // - перезаписываем число i на +1
     }


// start
     int start = 0;
// condition
     while (start < nums.length) {
         System.out.print(nums[start] + " "); // - вывод в одну строчку
// step
         start++;
     }

        System.out.println(); // - для переноса последующего вывода на другую строчку
        System.out.println("\"Hello\""); // - экранируем кавычку, для вывода ее в текст
        System.out.println("\nHello"); //  "\n"(escape последовательность) -  перенос и печать со следующей строки. Присутствует во всех языках.




    }
}
