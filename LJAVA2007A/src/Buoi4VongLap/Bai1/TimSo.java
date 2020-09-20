package Buoi4VongLap.Bai1;

public class TimSo {
    public static void main(String[] args) {
        for (int i = 20; i <= 200; i++){
            if((i%7==0)&&(i%5!=0))
                System.out.println(i);
        }
    }
}
