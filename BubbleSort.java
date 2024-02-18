import java.io.File;
import java.util.Scanner;

public class BubbleSort {

    static void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("After pass " + (i + 1));
            printArray(array);
        }
    }

    static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();

            int[] array = new int[size];
            int i = 0;
            while (scanner.hasNextInt()) {
                if(i >= array.length) {
                    break;
                }
                array[i] = scanner.nextInt();
                i++;
            }

            System.out.println("given array ");
            

            sort(array);

            scanner.close();
        } catch (Exception e) {
            System.out.println("error taking the size");
        }

    }
}