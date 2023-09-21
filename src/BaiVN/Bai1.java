package BaiVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Hãy nhập số phần tử bạn muốn có trong mảng : ");
        System.out.println();
        int n = Integer.parseInt(sc.nextLine());
        int [] arrInt =new int [n];
        do {
            System.out.println("*****************MENU****************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m");
            System.out.println("8. Thoát");
            System.out.println("Hãy đưa ra lựa chọn : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Nhập giá trị các phần tử mảng");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("arrInt[%d] : ",i);
                        arrInt[i]= Integer.parseInt(sc.nextLine());
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Hiển thị giá trị các phần tử mảng");
                    System.out.print("Giá trị các phần tử mảng : ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%d\t",arrInt[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
                    int sum = 0;
                    //1. dung for de xet tu phan tu
                    //2. xet xem co chia het cho 2 khong
                    //3. tinh tong trong lenh if cua vong for do luon
                    //4. thong bao ket qua
                    for (int i = 0; i < n; i++) {
                        if (arrInt[i]%2==0){
                            System.out.printf("%d \t",arrInt[i]);
                            sum += arrInt[i];
                        }
                    }
                    System.out.println("tong cac so chan la :"+sum);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
                    int sumPrime = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true; // Giả định số hiện tại là số nguyên tố

                        if (arrInt[i] <= 1) {
                            isPrime = false; // Nếu số nhỏ hơn hoặc bằng 1, thì không phải số nguyên tố
                        } else {
                            for (int j = 2; j <= Math.sqrt(arrInt[i]); j++) {
                                if (arrInt[i] % j == 0) {
                                    isPrime = false; // Nếu số chia hết cho một số nào đó thì không phải số nguyên tố
                                    break;
                                }
                            }
                        }

                        if (isPrime) {
                            System.out.printf("%d \t", arrInt[i]);
                            sumPrime += arrInt[i];
                        }
                    }
                    System.out.println("Tổng các số nguyên tố là: " + sumPrime);
                    System.out.println();
                    break;

                case 5:
                    int min = arrInt[0];
                    int max = arrInt[0];
                    System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
                    for (int i = 0; i < n; i++) {

                        if (arrInt[i]<min){
                            min= arrInt[i];
                        }
                        if(arrInt[i]>max){
                            max = arrInt[i];
                        }
                    }
                    System.out.println("So lon nhat : "+ max);
                    System.out.println("So nho nhat : "+ min);
                    break;
                case 6:
                    System.out.println("6. Sắp xếp mảng giảm dần");
                    for (int i = 0; i < n-1; i++) {
                        for (int j = i+1; j < n; j++) {
                            int temp = 0;
                            if (arrInt[i]<arrInt[j]){
                                temp = arrInt[i];
                                arrInt[i]= arrInt[j];
                                arrInt[j]= temp;
                            }
                        }

                    }System.out.println("Đã sắp xếp xong mảng giảm dần");
                    break;
                case 7:
                    System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m");
                    System.out.print("Nhập vào giá trị số nguyên m : ");
                    int mSum = 0;
                    int m = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        if(arrInt[i]==m){
                            mSum++;
                        }
                    }
                    System.out.printf("Trong mảng có %d phần tử có giá trị là %d",mSum,m);
                    System.out.println();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("vui long chon lai tu 1-8");
            }
        }while (true);
    }
}
