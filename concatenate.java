/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

/**
 *
 * @author ARUMUGASAMY
 */

    import java.util.Scanner;
/**
 *
 * @author ARUMUGACHAMY
 */
public class concatenate {
    
    public static void main(String[] args) 
    {
        int n;
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the value of n");
        n=obj.nextInt();
        String result="";
        
        for(int i=1;i<=n;i++)
        {
            result=result+i+"";
        }
        System.out.println(result);
    }
    
}

    

    

