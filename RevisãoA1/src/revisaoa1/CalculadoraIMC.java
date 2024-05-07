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
public class CalculadoraIMC {
    public static void PesoIdeal()
    {
        //Homem  - 72.7*altura-58
        //Mulher - 62.1*altura-44.7
        
        Scanner sc = new Scanner(System.in);
        
        double Altura, peso;
        String Sexo;
        
        System.out.print("Qual o sexo? (M - Masc / F - Fem) ");
        Sexo = sc.next();
        
        System.out.print("Digite sua Altura: ");
        Altura = sc.nextDouble();
        
        if("M".equals(Sexo))
        {
            peso = 72.7*Altura-58;
        }
        else
        {
            peso = 62.1*Altura-44.7;   
        }
            
        System.out.printf("Seu Peso Idel eh: %.2f %n", peso);
        
    }
    
}
