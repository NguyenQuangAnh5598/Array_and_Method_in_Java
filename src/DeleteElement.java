import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size of Array " );
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("Size should not exceed 50");
            }
        } while (size > 50);
        int[] aray = new int[size];
        for (int i = 0; i < size;i++) {
            System.out.print("Enter element in " + i + ": " );
            aray[i] = scanner.nextInt();
        }

        System.out.print("Enter the element you want to delete: ");
        int delete = scanner.nextInt();
        for (int i = 0;i < size;i++) {
            if (aray[i] == delete) {
                System.out.println("The element you want to delete is in " + i);
            }
        }
        System.out.println("Array befor delete elemant " + delete +" is:");
        for (int i = 0;i < size;i++){
            System.out.print(aray[i] + "\t");
        }
        System.out.println("\n");
        int a ,b;
        for (a=0,b=0;a < size;a++) {
            if (aray[a] != delete) {
                aray[b] = aray[a];
                b++;
            }
        }
        size = b;
        System.out.println("Array after delete element " + delete + " is");
        for (int i= 0;i < size;i++) {
            System.out.print(aray[i] + "\t");
        }
    }
}
