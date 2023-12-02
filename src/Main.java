import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayı basamak sayısına tam bölünüyorsa o sayıya,Basamak Sever Sayı denir");
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen sayı girin");
            int sayi= klavye.nextInt();
            int sayi1=sayi*1;
            int bs=0;
            while (sayi!=0){
                int kalan=sayi%10;
                sayi=sayi-kalan;
                sayi=sayi/10;
                bs++;
            }
System.out.println("Sistemin basamak sayısı="+bs);
     if (sayi1%bs==0)  {
         System.out.println("Sayı basamak sayısına tam bölünür,Basamak Sever Sayıdır");
     }
else {
    System.out.println("Sayı basamak sayısına tam bölünmez,Basamak Sever Sayı değil");
     }
    }
}