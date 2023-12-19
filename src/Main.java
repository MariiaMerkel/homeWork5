import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // task 1
        int[] array = generateRandomArray(-15, 15, 12);
        int indexOfMaxNmumber = 0;
        for (int i = 0; i < 12; i++) {
            indexOfMaxNmumber = array[indexOfMaxNmumber] > array[i] ? indexOfMaxNmumber : i;
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Максимальный элемент %d в последний раз встречается на позиции %d%n", array[indexOfMaxNmumber], indexOfMaxNmumber);

        // task 2
        array = generateRandomArray(0, 1, 11);
        for (int i = 0; i < 11; i++) {
            array[i] = (int) Math.round(Math.random());
        }
        int amountZero = 0;
        int amountUnit = 0;
        for (int i = 0; i < 11; i++) {
            if (array[i] == 0) amountZero++;
            else amountUnit++;
        }
        System.out.printf("%n" + Arrays.toString(array));
        if (amountUnit > amountZero)
            System.out.printf("%nЧаще в этом массиве встречается единица (%d раз)%n", amountUnit);
        else if (amountUnit == amountZero) System.out.println("-1");
        else System.out.printf("%nЧаще в этом массиве встречается ноль (%d раз)%n", amountZero);

        // task 3
        System.out.println();
        int[][] twoDimensionalArray = new int[8][5];
        for (int i = 0; i < 8; i++) {
                twoDimensionalArray[i] = generateRandomArray(10, 99, twoDimensionalArray[i].length);
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }

        // task 4
        System.out.println();
        twoDimensionalArray = new int[5][8];
        for (int i = 0; i < 5; i++) {
                twoDimensionalArray[i] = generateRandomArray(-99, 99, twoDimensionalArray[i].length);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }

        int maxElement = -99;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (twoDimensionalArray[i][j] > maxElement) maxElement = twoDimensionalArray[i][j];
            }
        }
        System.out.printf("Максимальный элемент массива = %d%n", maxElement);

        // task 5
        System.out.println();
        twoDimensionalArray = new int[7][4];
        for (int i = 0; i < 7; i++) {
            twoDimensionalArray[i] = generateRandomArray(-5, 5, twoDimensionalArray[i].length);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
        int productCurrentLine = 1;
        int maxProduct = 0;
        int indexLineOfMaxProduct = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                productCurrentLine *= twoDimensionalArray[i][j];
            }
            if (productCurrentLine > maxProduct) {
                maxProduct = productCurrentLine;
                indexLineOfMaxProduct = i;
            }
            productCurrentLine = 1;
        }
        System.out.printf("Максимальное произведение элемнтов в строке №%d = %d%n", indexLineOfMaxProduct + 1, maxProduct);

        // task 6
        System.out.println();
        twoDimensionalArray = new int[6][7];
        for (int i = 0; i < 6; i++) {
            twoDimensionalArray[i] = generateRandomArray(0, 9, twoDimensionalArray[i].length);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }

        int maxElementOfLine = 0;
        int indexOfMaxElementOfLine = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (twoDimensionalArray[i][j] > maxElementOfLine) {
                    maxElementOfLine = twoDimensionalArray[i][j];
                    indexOfMaxElementOfLine = j;
                }
            }
            if (indexOfMaxElementOfLine != 0) {
                twoDimensionalArray[i][0] += twoDimensionalArray[i][indexOfMaxElementOfLine];
                twoDimensionalArray[i][indexOfMaxElementOfLine] = twoDimensionalArray[i][0] - twoDimensionalArray[i][indexOfMaxElementOfLine];
                twoDimensionalArray[i][0] -= twoDimensionalArray[i][indexOfMaxElementOfLine];
            }
            maxElementOfLine = 0;
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
    }

    private static int[] generateRandomArray(int min, int max, int size) {
        Random random = new Random();
        int bound = max + 1 - min;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(bound) + min;
        }
        return result;
    }
}