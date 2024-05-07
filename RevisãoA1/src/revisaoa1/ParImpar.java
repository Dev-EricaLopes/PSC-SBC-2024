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
public class ParImpar {
    public static void ParImpar()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        
        if(num%2 == 0)
            System.out.println("Numero Par");
        else 
            System.out.println("Numero Impar");
    }
    
}
