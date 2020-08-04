/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;
import java.util.Scanner;


/**
 *
 * @author ARUMUGASAMY
 */
public class prime {
    public static void main (String[] args) {
        int i, n, flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an integer");
        n=obj.nextInt();
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
            else
                flag=0;
            
                
        }    
        
        if(flag==0)
            System.out.println("prime number");
        else
            System.out.println("Not a prime number");
        
        
    }
    
    
}
