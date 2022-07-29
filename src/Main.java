import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int[] arr = new int[30];
        int sum = arr[0];
        int max = arr[0];
        double mean = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000) + 100_000;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        int min = max;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        // Task 3
        for (int j : arr) {
            mean += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (int) Math.abs(mean / 30) + " рублей");

        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(reverseFullName[i]);
            } else {
                System.out.print(reverseFullName[i]);

            }

        }
    }


}



