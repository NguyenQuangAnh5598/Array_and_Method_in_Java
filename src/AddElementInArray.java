import java.util.Scanner;

public class AddElementInArray {
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
        System.out.print("Now the aray is: " );
        for (int i = 0;i < size;i++) {
            System.out.print(aray[i] + "\t");
        }

        System.out.print("Enter element you want to add in: ");
        int add = scanner.nextInt();

        System.out.print("Enter position you want to add : ");
        int a = scanner.nextInt();

        System.out.print("Now array is ");
        addElement(aray,add,a);
    }
    public static void addElement(int[] arr,int value,int index) {
        int[] newArray = new int[arr.length+1];
        for (int i = 0,j = 0;i < newArray.length;i++,j++) {
            if (i == index) {
                newArray[i] = value;
                j--;
                continue;
            }
            newArray[i] = arr[j];
        }
        for (int element : newArray) {
            System.out.print(element + "\t");
        }
    }
}
