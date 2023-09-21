package BaiVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong cua mang : ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("nhap so cot cua mang : ");
        int col = Integer.parseInt(sc.nextLine());
        int [][] arrInt = new int[row][col];
        do {
            System.out.println("***********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("Hãy đưa ra lựa chọn : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
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
                    System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i==0||j==0||i == row-1||j==col-1){
                                System.out.printf("%d \t",arrInt[i][j]);
                                sum += arrInt[i][j];
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
                    int sumMainDiagonal = 0;
                    int sumSecondaryDiagonal = 0;
                    // In giá trị trên đường chéo chính
                    System.out.println("Giá trị trên đường chéo chính:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == j) {
                                System.out.print(arrInt[i][j] + " ");
                                sumMainDiagonal += arrInt[i][j];
                            }
                        }
                    }
                    System.out.println();

                    // In giá trị trên đường chéo phụ
                    System.out.println("Giá trị trên đường chéo phụ:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i + j == row - 1) {
                                System.out.print(arrInt[i][j] + " ");
                                sumSecondaryDiagonal += arrInt[i][j];
                            }
                        }
                    }
                    System.out.println();

                    break;
                case 5:
                    System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
                    // Tìm giá trị lớn nhất và nhỏ nhất
                    int minValue = arrInt[0][0];
                    int maxValue = arrInt[0][0];

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arrInt[i][j] < minValue) {
                                minValue = arrInt[i][j];
                            }
                            if (arrInt[i][j] > maxValue) {
                                maxValue = arrInt[i][j];
                            }
                        }
                    }

                    // In giá trị lớn nhất và nhỏ nhất
                    System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
                    System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
                    break;
                case 6:
                    // Sắp xếp mảng theo từng cột
                    for (int j = 0; j < col; j++) {
                        for (int i = 0; i < row - 1; i++) {
                            for (int k = 0; k < row - i - 1; k++) {
                                if (arrInt[k][j] > arrInt[k + 1][j]) {
                                    // Hoán đổi giá trị của hai phần tử
                                    int temp = arrInt[k][j];
                                    arrInt[k][j] = arrInt[k + 1][j];
                                    arrInt[k + 1][j] = temp;
                                }
                            }
                        }
                    }

                    // In mảng sau khi sắp xếp
                    System.out.println("Mảng sau khi sắp xếp tăng dần theo cột:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(arrInt[i][j] + " ");
                        }
                    }
                        System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("vui long nhap tu 1-7");
            }
        }while (true);

    }
}
