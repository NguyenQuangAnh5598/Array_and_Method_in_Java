import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter Array of the size: ");
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("Size does not exceed 50");
            }
        } while (size > 50);
        int[] array = new int[size];
        for (int i = 0; i < array.length ;i++) {
            System.out.print("Enter element in " + i + " : ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i< array.length;i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min of Array is " + min);
    }
}
