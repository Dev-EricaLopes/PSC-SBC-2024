/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisaoa1;

import java.io.IOException;
import java.util.Scanner;
import static revisaoa1.CalculadoraIMC.PesoIdeal;
import static revisaoa1.NumerosNaturais.NumeroNatural;
import static revisaoa1.ParImpar.ParImpar;
import static revisaoa1.Temperatura.Temperatura;

/**
 *
 * @author erica
 */
public class RevisaoA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();
        
        int ex;
        int resp = 0;
        
        while(resp != 99)
        {


            System.out.println("*******************************");
            System.out.println("    EXERCICIOS DE REVISAO");
            System.out.println("");
            System.out.println(" 1 - Calculadora");
            System.out.println(" 2 - Calculadora Peso Ideal");
            System.out.println(" 3 - Par ou Impar");
            System.out.println(" 4 - Numeros Naturais");
            System.out.println(" 5 - Temperatura");
            System.out.println("");
            System.out.println("*******************************");

            System.out.print("Digite o numero do exercicio: ");
            ex = sc.nextInt();
/*
            if(ex == 1)
                calc.Calcula();
            if (ex == 2)
                PesoIdeal();
            if (ex == 3)
                ParImpar();
            if (ex == 4)
                NumeroNatural();
            if (ex == 5)
                Temperatura();
       */     
            switch(ex)
            {
                case 1:
                    calc.Calcula();
                    break;
                case 2:
                    PesoIdeal();
                    break;           
                case 3:
                    ParImpar();
                    break;  
                case 4:
                    NumeroNatural();
                    break;  
                case 5:
                    Temperatura();
                    break;  
                default:
                    System.out.println("Exercicio Invalido!!!");
            }
            
            
            
            System.out.print("Deseja Continuar (1- Sim/ 99-Nao) : ");
            resp = sc.nextInt();
            
        }
        
        System.out.println("*** FIM DO PROGRAMA ***");
        
    }

    private static void System(String cls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
