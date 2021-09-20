import java.util.Scanner;

public class Tong_cac_so_cua_1_cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng 2 chiều ");
        int row = scanner.nextInt();
        System.out.print("Nhập số phần tử cho mỗi hàng ");
        int num = scanner.nextInt();

        int[][] array = new int[row][num];
        for (int i = 0; i < row;i++) {
            for (int j = 0;j < num;j++) {
                System.out.print("Nhập phần tử tại hàng " + i +" vị trí " + j + ": " );
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng có dạng sau : " );
        for (int i = 0; i < row;i++) {
            for (int j = 0;j < num;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int num1;
        do {
            System.out.print("Nhập số cột muốn tính tổng: ");
            num1 = scanner.nextInt();
            if (num1 > num) {
                System.out.println("Không có cột muốn cộng");
            }
        } while (num1 > num);
        int sum = 0;
        for (int i = 0; i < num;i++) {
            sum += array[i][num1-1];
        }
        System.out.println("Tổng của các phần tử trong cột " + num1 + " là : " + sum);
    }
}
