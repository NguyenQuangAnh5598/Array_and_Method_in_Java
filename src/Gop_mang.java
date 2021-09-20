import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size of the Array : ");
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("Size should not exceed 50");
            }
        } while (size > 50);
        int[] aray = new int[size];
        for (int i = 0;i < size;i++) {
            System.out.print("Enter element in " + i + " : ");
            aray[i] = scanner.nextInt();
        }

        int size2;
        do {
            System.out.print("Enter size of the Array2 : ");
            size2 = scanner.nextInt();
            if (size2 > 50) {
                System.out.println("Size should not exceed 50");
            }
        } while (size2 > 50);
        int[] aray2 = new int[size2];
        for (int i = 0;i < size2;i++) {
            System.out.print("Enter element in " + i + " : ");
            aray2[i] = scanner.nextInt();
        }
        System.out.println("Mảng sau khi gộp : ");
        addArray(aray,aray2);
    }
    public static void addArray(int[] ar, int[] arr) {
        int[] array = new int[ar.length + arr.length];
        for (int i = 0;i < ar.length;i++) {
            array[i] = ar[i];
        }
        for (int i = 0 ;i < arr.length;i++) {
            array[i + ar.length ] = arr[i];
        }
        for (int x : array) {
            System.out.print(x + "\t");
        }
    }
}
