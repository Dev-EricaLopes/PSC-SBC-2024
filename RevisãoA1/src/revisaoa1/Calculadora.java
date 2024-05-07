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
public class Calculadora {
    
    public void Calcula()
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2, op;

        System.out.print("Digite um numero");
        num1 = sc.nextInt();
        
        System.out.println("Digite outro numero:");
        num2 = sc.nextInt();
        
        System.out.println("Digite 1-soma 2-sub 3-div 4-mult: ");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Soma - " + (num1+num2));
                break;
            case 2:
                System.out.println("Sub - " + (num1-num2));
                break;
            case 3:
                System.out.println("Div - " + (num1/num2));
                break;
            case 4:
                System.out.println("Mult - " + (num1*num2));
                break;
            default:
                System.out.println("Operação Inválida!!");
        }
    }
    
    
}
