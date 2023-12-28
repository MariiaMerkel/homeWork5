import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1(arr);
        task2(arr);
        task3(arr);
        task4();

        // task 1

        int[] integers = new int[3];
        for (int i = 0; i < 3; ) {
            integers[i] = ++i;
        }
        double[] doubles = {1.57, 7.654, 9.986};
        char[] chars = "Hello".toCharArray();

        System.out.println("task 2");
        for (int i = 0; i < integers.length; i++) {
            if (i < integers.length - 1) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }

        for (int i = 0; i < doubles.length; i++) {
            if (i < doubles.length - 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {
                System.out.print(chars[i] + ", ");
            } else {
                System.out.println(chars[i]);
            }
        }

        System.out.println("task 3");
        for (int i = integers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(chars[i] + ", ");
            } else {
                System.out.println(chars[i]);
            }
        }

        System.out.println("task 4");
        for (int i = 0; i < integers.length; i++) {
            integers[i] += integers[i] % 2;
        }
        System.out.println(Arrays.toString(integers));
    }

    public static void task1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("%nСумма трат за месяц составила %s.%n", numberFormat.format(sum));
    }

    private static void task2(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
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
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

