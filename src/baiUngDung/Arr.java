package baiUngDung;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrInt = new int[5];
        do {
            System.out.println("********************MENU******************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. in ra giá trị các phần tử trong mảng");
            System.out.println("3. in ra các sóo chẵn trong mảng ");
            System.out.println("4. in ra các phẩn tử lẻ trong mảng");
            System.out.println("5. tính tổng các phần tử trong mảng");
            System.out.println("6. sắp xếp mảng tăng dần (thuật toán selection sort)");
            System.out.println("7. thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử mảng");
                    for (int i=0; i < arrInt.length;i++ ){
                        System.out.printf("nhap arrInt[%d] : ", i);
                        arrInt[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2 :
                    System.out.println("2. in ra giá trị các phần tử trong mảng");
                    for (int element: arrInt) {
                        System.out.printf("%d", element);
                        System.out.print("\t");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. in ra các sóo chẵn trong mảng :");
                    for (int i=0; i < arrInt.length;i++ ){
                        if (arrInt[i]%2==0) {
                            System.out.printf("%d\t", arrInt[i]);

                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("4. in ra các phẩn tử lẻ trong mảng");
                    for (int i=0; i < arrInt.length;i++ ){
                        if (arrInt[i]%2==1) {
                            System.out.print(arrInt[i]);
                            System.out.print("\t");
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    int count = 0;
                    System.out.println("5. tính tổng các phần tử trong mảng");
                    for (int i=0; i < arrInt.length; i++){
                       count += arrInt[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + count);
                    break;
                case 6:
                    System.out.println("6. sắp xếp mảng tăng dần (thuật toán selection sort)");
                    selectionSort(arrInt);
                    break;

                case 7:
                    System.exit(0);
                default:
                    System.err.println("vui lòng chọn từ 1-7");
            }
        }while(true);


    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}
