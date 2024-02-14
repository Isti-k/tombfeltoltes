/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

public class ParosViszgalat {
    public static void main(String[] args) {
        final int DB = (int)(Math.random()*(25-15+1)+15);
        int[] paratlanok = new int[DB];
        
        /* kiíras: */
        for (int i = 0; i < DB; i++) {
            System.out.println(paratlanok[i] + " ");
        }
        System.out.println("");
    }
}
