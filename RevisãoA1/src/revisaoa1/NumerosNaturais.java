/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoa1;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class NumerosNaturais {
    public static void NumeroNatural()
    {
        Scanner sc = new Scanner(System.in);
        int x = 99;
        int i = 0;
        int acumula = 0;
        
        while (x != 0)
        {
            System.out.print("Digite um numero Natural: ");
            x = sc.nextInt();

            if (x == 0)
                System.out.println("Media - " + (acumula/i));
            else if (x < 0)
            {
                System.out.println("Numero invalido!!");
             //   System.out.println("Contador - " + i);
             //   System.out.println("Acumula - " + acumula);
            }
            else
            {
                i++; // i = i+1;
                acumula += x; //acumula = acumula + x;
               // System.out.println("Contador - " + i);
               // System.out.println("Acumula - " + acumula);
            }    
                
                
        }
                System.out.println("*** FIM DO PROGRAMA2 ***");

    }
    
}
