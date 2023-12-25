import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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
}