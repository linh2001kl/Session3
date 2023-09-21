package baiUngDung;

import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong cua mang : ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("nhap so cot cua mang : ");
        int col = Integer.parseInt(sc.nextLine());
        //khoi tao mang 2 chieu vs dong la row va cot la col
        int [][] arrInt = new int [row][col];
        // doWhile de tao menu:
        do {
            System.out.println("****************MENU******************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. tính tổng các phẩn tử");
            System.out.println("4. Tìm giá trị nhỏ nhất và lớn nhất trong mảng");
            System.out.println("5. thoát");
            System.out.println(" ban chon so :");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử của mảng");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrInt[%d][%d]=",i,j);
                            arrInt[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 2:
                    System.out.println("Cac phần tử của mảng 2 chiều là:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            //In dòng
                            System.out.printf("%5d",arrInt[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int sum = 0;
                    System.out.println("3. tính tổng các phẩn tử");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                           sum += arrInt[i][j];
                        }
                    }
                    System.out.println("tong cac phan tu trong mang la : "+ sum);
                    break;
                case 4 :
                    //tim so nho nhat :
                    int min = arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if ( arrInt[i][j]<min){
                                min = arrInt[i][j];
                            }
                        }
                    }
                    System.out.println("So nho nhat cua mang la :"+min);
                    //tim so lon nhat:
                    int max = arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(arrInt[i][j]>max){
                                max = arrInt[i][j];
                            }
                        }
                    }
                    System.out.println("So lon nhat trong mang la : "+max);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("vui long nhap tu 1-5");
            }
        }while (true);

    }
}
