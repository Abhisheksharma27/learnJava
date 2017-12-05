/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Learn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int num3;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1=keyboard.nextInt();
        System.out.print("Enter the second number:");
        num2=keyboard.nextInt();
        System.out.print("Enter the third numbeer:");
        num3=keyboard.nextInt();
        System.out.print("The smallest number is:" + smallestNumber(num1, num2, num3) +"\n");
        
    }
    public static int smallestNumber(int num1, int num2,int num3){
        return Math.min(Math.min(num2,num3),num1);
        
      
        
    }
    
}
