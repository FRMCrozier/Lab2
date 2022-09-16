
import java.util.*;
import java.util.stream.IntStream;

public class Java2 {

    /**
     * Первое задание под вариантом 26 (номер по писку 3, номер группы 191):
     *В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному значению К.
     */
    private static void First() {
        Random rnd = new Random();
        int n = rnd.nextInt(1,20);
        int k = rnd.nextInt(1,10);
        int[] A = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextInt(1,1000);
        }
        System.out.println("Your Array A:");
        System.out.println(Arrays.toString(A));
        System.out.println("Elements from the array A that are multiples of the number " + k + ":");
        for (int i = 0; i < n; i++) {
            if (A[i]%k == 0){
                System.out.println(A[i]);
                sum += A[i];
            }
        }
        System.out.println("The sum of these elements = " + sum);
    }

    /**
     * Второе задание под вариантом 53 (номер по писку 3, номер группы 191):
     * Определить, сколько процентов от всего количества элементов последовательности целых чисел составляют нечетные числа.
     */
    private static void Second() {
        Random rnd = new Random();
        int n = rnd.nextInt(1,20);
        int[] A = new int[n];
        float odd = 0;
        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextInt();
            if(A[i]%2 != 0){
                odd += 1;
            }
        }
        float l = A.length;
        System.out.println("Your Array A:");
        System.out.println(Arrays.toString(A));
        System.out.printf("Percentage of odd numbers in array A: %.2f percent\n", ((odd*100)/l));
    }

    /**
     * Третье задание под вариантом 76 (номер по писку 3, номер группы 191):
     * Дана последовательность натуральных чисел а1, а2,..., а20.
     * Определить, есть ли в последовательности хотя бы  одно число, оканчивающееся цифрой 7.
     * В случае положительного ответа определить порядковый номер первого из таких чисел.
     */
    private static void Third() {
        Random rnd = new Random();
        int[] A = new int[20];
        var NoNum = true;

        for (int i = 0; i < 20; i++) {
            A[i] = rnd.nextInt(1, 1000);
         }
        System.out.println("Your Array A:");
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < 20; i++) {
            if(A[i] > 10 && A[i] % 10 == 7){
                System.out.println("There is at least one number ending with 7. And this element № " + (i+1) + " number " + A[i]);
                NoNum = false;
                break;
            }
        }
        if (NoNum){
            System.out.println("There are no numbers ending with 7!");
        }
    }

    /**
     * Четвертое задание под вариантом 101 (номер по писку 3, номер группы 191):
     * Удалить элемент одномерного массива вещественных чисел, который меньше среднего арифметического элементов массива.
     * Если таких элементов несколько, удалить последний из найденных.
     */
    private static void Fourth() {
        Random rnd = new Random();
        int n = rnd.nextInt(1,20);
        float[] A = new float[n];
        float[] result = new float[n-1];
        float sum = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextFloat(-10,10);
            sum += A[i];
        }
        System.out.println("Your Array A:");
        System.out.println(Arrays.toString(A));
        float average = sum/A.length;
        for (int i = 0; i < n; i++) {
            if(A[i] < average) {
                index = i;
            }
        }
        System.out.println("Arithmetic average of array elements: " + average);
        if(index == -1){
            System.out.println("There are not elements less than the average");
        }
        else{
            System.arraycopy(A,0,result,0,index);
            System.arraycopy(A,index+1,result,index,A.length-index-1);
            System.out.println("Your new Array with the last element less than the average removed:");
            System.out.println(Arrays.toString(result));
        }
    }

    /**
     * Пятое задание под вариантом 126 (номер по писку 3, номер группы 191):
     * Даны вещественные числа а1, а2,..., аn
     * Найти max(a1 + a2n, a2 + a2n-1,..., an + an+1)
     */
    private static void Fifth() {
        Random rnd = new Random();
        int n = rnd.nextInt(1,20);
        float[] A = new float[n];
        float[] result = new float[2*n];
        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextFloat(-10,10);
        }
        System.out.println("Your Array A:");
        System.out.println(Arrays.toString(A));
        float max = A[0] + A[A.length-1];
        for (int i = 1; i < A.length/2; i++){
            if((A[i] + A[A.length - i - 1]) > max){
                max = A[i] + A[A.length - i - 1];
            }
        }
        System.out.println("Max sum: max(a1 + a2n, a2 + a2n-1,..., an + an+1) = " + max);
    }

    public static void main(String[] args) {
        System.out.println("TASK 26");
        First();
        System.out.println("\nTASK 53");
        Second();
        System.out.println("\nTASK 76");
        Third();
        System.out.println("\nTASK 101");
        Fourth();
        System.out.println("\nTASK 126");
        Fifth();
    }
}
