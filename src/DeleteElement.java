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



//    Cách 2
//    public static int[] deleteByIndex(int a[], int index){
////        tạo ra 1 mảng mới tên a1 (n-1) phần tử
//        int n = a.length-1;
//        int a1[] = new int[n];
////        duyệt mảng từ (0-index)
////        a1[i] = a[i]
//        for (int i = 0; i < index; i++) {
//            a1[i] = a[i];
//        }
////        duyệt mảng từ (index+1 -> length)
////        a1[i-1] = a[i]
//        for (int i = index+1; i < a.length; i++) {
//            a1[i-1]=a[i];
//        }
//        return a1;
//    }



//    Cách3
//    public static void main(String[] args) {
//        int size;
//        int[] array;
//        Scanner scanner=new Scanner(System.in);
//        do{
//            System.out.println("Enter a size:");
//            size=scanner.nextInt();
//            if(size>20){
//                System.out.println("Size should not exceed 20");
//            }
//        }while (size>20);
//        array=new int[size];
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println("Enter element "+(i+1)+':');
//            array[i]=scanner.nextInt();
//        }
//        System.out.print("Array: ");
//        for (int a:array) {
//            System.out.print(a+"\t");
//        }
//        System.out.print("\n Enter X:");
//        int X=scanner.nextInt();
//        int count=0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]==X){
//                count++;
//            }
//        }
//        if (count!=0){
//            size=size-count;
//            int[] newArray=new int[size];
//            for (int i = 0,j=0; i < array.length ; i++,j++) {
//                if(array[i]==X){
//                    j--;
//                    continue;
//                }
//                newArray[j]=array[i];
//            }
//            System.out.print("New Array: ");
//            for (int a:newArray) {
//                System.out.print(a+"\t");
//            }
//        }else {
//            System.out.println("No X:");
//        }
//    }
}
