package Buoi4VongLap.Bai1;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu nhien n: ");
        n = scanner.nextInt();
        for(int i = 2; i < n; i++){
            int dem = 0;
            for (int j = 2; j<=i; j++ ){
                if(i%j==0) dem++;
            }
            if (dem == 1) System.out.println(i);


        }
    }
}
