import java.text.NumberFormat;
import java.util.Random;

public class Main {
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }

    public static void task1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("%nСумма трат за месяц составила %s.%n", numberFormat.format(sum));
    }

    private static void task2(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s. Максимальная сумма трат за день составила %s.%n", numberFormat.format(min), numberFormat.format(max));
    }

    private static void task3(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        float avg = (float) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s.%n", numberFormat.format(avg));
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        int i = 0;
        int j = fullName.length;
        while (i < fullName.length) {
            fullName[i++] = reverseFullName[--j];
        }
        for (char c : fullName) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}