package Buoi4VongLap.Bai1;

import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    public static void giaiPTBac1(float a, float b){
        if(a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        }else{
            System.out.println("Phuong trinh co nghiem x = "+(-b/a));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap he so a:");
        float aNum = scan.nextFloat();
        System.out.println("Nhap he so b:");
        float bNum = scan.nextFloat();
        System.out.println("Nhap he so c:");
        float cNum = scan.nextFloat();
        System.out.println("Phuong trinh bac 2 co dang: "+aNum+"x^2"+bNum+"x"+cNum);
        giaiPTBac2(aNum, bNum, cNum);
        System.out.println("Phuong trinh bac 2 co dang: "+aNum+"x"+bNum);
        giaiPTBac1(aNum, bNum);
        
    }
}
