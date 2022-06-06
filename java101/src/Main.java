import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // değişkenleri oluştur
       int mat,fizik,kimya,turkce,tarih,muzik;
        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
         //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.println("Fizik Notunu:");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz:");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat+ fizik+ kimya+ turkce+ tarih+ muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalamaniz:" + sonuc);

        String str = sonuc < 60 ? "Sinifta Kaldiniz" : "Sinifi Gectiniz";
        System.out.println(str);


    }
}
