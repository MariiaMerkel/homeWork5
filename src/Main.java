import java.util.Arrays;

public class Main {
    public static void main(String[] args) {   // task 4
        fillingArray(6);
        reverseArray(new int[]{6, 7, 1, 2, 1});
        reverseArrayWithoutAddArr(new int[]{1, 2, 3, 4, 5});
        findTwoNumbers(new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1});
    }
    public static void fillingArray (int a){  // task 5
        int[][] matrix = new int[a][a];
        for(int i = 0; i < a; i++ ) {
            for(int j = 0; j < a; j++) {

                matrix[i][j] = i == j ? 1 : i + j == a-1 ? 1 : 0;
            }
        }
        // первый способ вывода в консоль
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        // второй способ вывода в консоль
        Arrays.stream(matrix).forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
    public static void reverseArray(int [] array) {   // task 6
        int[] reverseArray = new int[array.length];
        int c = array.length - 1;
        for(int i = 0; i < array.length; i++) {
            reverseArray[i] = array[c--];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));
    }
    public static void reverseArrayWithoutAddArr(int [] array) {   // task 7
        System.out.println("\n" + Arrays.toString(array));

        int j = array.length - 1;
        for(int i = 0; i < array.length/2; i++) {
            int one = array[i];
            int two = array[j];
            one += two;
            two = one - two;
            one -= two;
            array[i] = one;
            array[j--] = two;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void findTwoNumbers(int[] array) {   // task 8 and 9
        int sum = 0;
        for(int i = 0; i < array.length - 1; i++) {
            for( int j = 1; j < array.length; j++) {
                sum = array[i] + array[j];
                if (sum == -2) System.out.println(array[i] + " + " + array[j] + " = " + sum);
            }
        }
    }
}