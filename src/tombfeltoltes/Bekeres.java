/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombfeltoltes;

import java.util.Scanner;


public class Bekeres {

    //static Scanner sc = new Scanner(System.in, "utf-8");
    //static Scanner sc = new Scanner(System.in, "latin1");
    //static Scanner sc = new Scanner(System.in, "iso-8859-2");
    static Scanner sc = new Scanner(System.in, "windows1250");
    
    public static void main(String[] args) {
        /* 1.: programba drótozva: */
        //final int DB = 3;
        
        /* 2.: user dönti el: */
        System.out.println("név db: ");
        final int DB = sc.nextInt();
        sc.nextLine();//ENTER kiolvasása a streamből
        
        String[] nevek = new String[DB];
        /* feltöltés */
        for (int i = 0; i < DB; i++){
            System.out.printf("%d/%d név: ", DB, i+1);
            String nev = sc.nextLine();
            nevek[0] = nev;
        }
       
        /* kiírás */
        for (int i = 0; i < DB; i++){
            System.out.printf(nevek[i]);
            
        }
    }
    
}
