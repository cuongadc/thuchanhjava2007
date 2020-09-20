package Buoi4VongLap.Bai1;

import java.util.Scanner;

public class TinhGiaiThua {
    public static double GiaiThua(int n){
        double S = 1;
        for(int i = 1; i<n; i++){
            S = S * i;
        }
        return S;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n:");
        int n = scan.nextInt();
        System.out.println(n+"! = "+GiaiThua(n));

    }
}
