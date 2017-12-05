
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class square {
    public static void main(String[] args)
    {
        int num ;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter ur num:");
        num = k.nextInt();
        
        System.out.println("The square of the number is:" + square(num));
        
    }
    public static int square(int num){
        return num*num;
        
    }
    
}
