/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author KocsiDorottya(SZF_20
 */
public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // indexek:
        // pyLista=["egy", "kettő", "három"]
        
        String[] tomb= {"egy", "kettő", "háom"};
        System.out.println("tomb= " + tomb);
        
        /*tömb mérete nem változtatható*/
        //tomb = {"nulla", "egy", "kettő", "három"}
        
        System.out.println("A tömb elemei:");
        for(int i=0; i<tomb.length; i++){ 
              System.out.printf("[%d. index] = %s\n",i,tomb[i]);
        }
        tomb= new String[4];
        System.out.printf("Az üres tömb: ");
        for(int i=0; i<tomb.length; i++){ 
              System.out.printf("[%d. index] = %s\n",i,tomb[i]);
    }
        tomb[2]="zwei";
        System.out.printf("Az üres tömb: ");
        for(int i=0; i<tomb.length; i++){ 
              System.out.printf("[%d. index] = %s\n",i,tomb[i]);
    
    }
       
        System.out.println("Teljesen angolul feltöltött tömb: ");
        tomb[0]="null";
        tomb[1]="one";
        tomb[2]="two";//
        tomb[3]="three";
        for(int i=0; i<tomb.length; i++){ 
              System.out.printf("[%d. index] = %s\n",i,tomb[i]);
        }
       }  
   }
