/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoa1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author erica
 */
public class Temperatura {
    public static void Temperatura()
    {
        Scanner sc = new Scanner(System.in);
        double f, c;
        
        System.out.print("F - ");
        f = sc.nextDouble();
        
        c = (5.0/9.0)*(f-32.0);
        System.out.printf("C - %.1f %n", c);
        
        for(double i=50; i<=150; i++)
        {
            c = (5.0/9.0)*(i-32.0);
           System.out.printf("F - %.1f    | C - %.1f %n", i, c);
        }
        
    }
    
}
