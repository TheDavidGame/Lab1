import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int array[] = new int[5];
        ///Task 1///
        for (int i = 0; i <= array.length; i++) {
            sum += i;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("================");
        //////////////////
        ///Task 2////
        for (String a : args) {
            System.out.println(a);
        }
        ///Task 3///
        System.out.print("Вывод массива: ");
        for (double j = 1; j <= 10; j++) {
            double d = 1 / j;
            String format = String.format("%.2f", d);
            System.out.print(format + " ");
        }
        System.out.println();
        System.out.println("================");
        ///Task 4///
        int array2[] = new int[10];
        System.out.print("Вывод изначального массива: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int) (Math.random() * 100));
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.print("Вывод отсортированного массива: ");
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i]+ " ");
        }
        System.out.println();
        System.out.println("================");
        System.out.println("opa");
    }
    public static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;

    }

}

