import java.util.Scanner;

public class Tong_duong_cheo_chinh_mang_2_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột muốn của Ma trận hình vuông ");
        int column = scanner.nextInt();

        int[][] array = new int[column][column];
        for (int i = 0; i < column;i++) {
            for (int j = 0;j < column;j++) {
                System.out.print("Nhập phần tử tại hàng " + i +" vị trí " + j + ": " );
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng có dạng sau : " );
        for (int i = 0; i < column;i++) {
            for (int j = 0;j < column;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < column;i++ ) {
            sum += array[i][i];
        }
        System.out.println("Tổng của các phần tử trong đường chéo chính = " + sum);
    }
}
