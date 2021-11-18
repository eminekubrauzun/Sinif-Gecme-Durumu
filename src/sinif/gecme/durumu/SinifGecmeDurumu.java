/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinif.gecme.durumu;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class SinifGecmeDurumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat,fizik,turkce,kimya,muzik;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Matematik notunuz:");
        mat= input.nextInt();
        
        System.out.print("fizik notunuz:");
        fizik= input.nextInt();
        
        System.out.print("Türkçe notunuz:");
        turkce= input.nextInt();
        
        System.out.print("Kimya notunuz:");
        kimya= input.nextInt();
        
        System.out.print("Muzik notunuz:");
        muzik= input.nextInt();
        
        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if (avarage <=55 && avarage>0) {
            System.out.println("Sınıfta kaldınız ,seneye tekrar görüşmek üzere!"); 
            System.out.println("Ortalamanız:" + avarage);
            
        }else if (avarage<101) {
            System.out.println("Tebrikler, sınıf geçtiniz!");
       
        System.out.println("ortalamanız:"+ avarage);
        
        }else {
        System.out.print("0-100 arası bir değer giriniz");
                }
               
        
        
          
            
           
        }
        
        
    }
    

