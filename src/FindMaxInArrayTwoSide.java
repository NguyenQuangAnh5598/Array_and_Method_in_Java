import java.util.Scanner;

public class FindMaxInArrayTwoSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng 2 chiều ");
        int row = scanner.nextInt();
        System.out.print("Nhập số phần tử cho mỗi hàng ");
        int num = scanner.nextInt();

        double[][] array = new double[row][num];
        for (int i = 0; i < row;i++) {
            for (int j = 0;j < num;j++) {
                System.out.print("Nhập phần tử tại hàng " + i +" vị trí " + j + ": " );
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Mảng có dạng sau : " );
        for (int i = 0; i < row;i++) {
            for (int j = 0;j < num;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        findMax(array);
    }
    public static void findMax(double[][] arr) {
        double max = arr[0][0];
        int row = 0;
        int num = 0;
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[0].length;j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i+1;
                    num = j+1;
                }
            }
        }
        System.out.println("Vậy giá trị lớn nhất của mảng 2 chiều là " + max + " tại vị trí hàng " + row + " phần tử thứ " + num);
    }
}
