/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author KocsiDorottya(SZF_20
 */
public class TombosGyakorlas {
   
    
public static void main(String[] args) {
        String[] nevek= {"Adél", "Viki", "Eszti", "Dorka"};
        int[] korok={22,19,23,19};
        int TOMB_MERET = 4;
        
        nevek= new String[TOMB_MERET];
        nevek[0] = "Adél";
        nevek[1] = "Viki";
        nevek[2] = "Eszti";
        nevek[3] = "Dorka";
        
        korok= new int[TOMB_MERET];
        korok[0]=22;
        korok[1]=19;
        korok[2]=23;
        korok[3]=19;
        
        System.out.println("KeményMagok kora:");
        int osszKor=0;
        for (int i=0; i < TOMB_MERET; i++){
            String nev=nevek[i];
            int kor=korok[i];
            System.out.printf("%5s kora: %3d év\n",nev,kor);
            osszKor+=kor;
            
        }
        double atlag=(double)osszKor/ TOMB_MERET;
        System.out.printf("A keménymagok átlag kora: %.2f év\n", atlag);
    
}
}
