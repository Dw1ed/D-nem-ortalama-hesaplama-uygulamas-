
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args)  {
        int mat,fizik,turkce,kimya,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        mat=inp.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik=inp.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turkce=inp.nextInt();
        System.out.println("kimya notunuzu giriniz: ");
        kimya=inp.nextInt();
        System.out.println("müzik notunuzu giriniz:");
        muzik=inp.nextInt();
        double avarage =(mat+fizik+turkce+kimya+muzik)/5;
        if (avarage >= 55 && avarage <= 100){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşürüz");
        }
        else if (avarage < 55 && avarage >= 00)  {
            System.out.println("Tebrikler,sınıfı geçtiniz");
        }
        else{
            System.out.println("Your average have to be between 0 and 100");
        }
        System.out.println("Ortalamanız: "+avarage);
    }
}
