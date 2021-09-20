import java.util.Scanner;

public class Dem_ki_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 câu vào đây");
        String a = scanner.nextLine();
        System.out.println("Nhập ký tự muốn đếm vào đây");
        char e = scanner.next().charAt(0);
        byte count = 0;
        for (int i = 0;i < a.length();i++) {
            if (e == a.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Ký tự %s xuất hiện %d lần!",e,count);
    }
}
