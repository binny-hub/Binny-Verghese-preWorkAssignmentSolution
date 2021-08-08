/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Dell
 */
public class Programs {

   void palindrome()
   {
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number");
       num = sc.nextInt();
       int new_num = num;
       int n=0;
       while(num!=0) 
       { int r= num%10;
         n = n*10 + r;
         num/=10;
       }
       if (new_num == n)
           System.out.print("Palindrome");
       else
           System.out.print("Not Palindrome");
       return;
   }
   void pattern()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of lines that you want to print");
       int num = sc.nextInt();
       for(int i=num; i>=1; i--)
       { for(int j = 1; j<=i; j++)
               System.out.print('*');
           System.out.println();
       }
   }
   
   void primenumber()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int num = sc.nextInt();
       
       int i=2;
       int fl=0;
       while(i*i<=num)
       { if ( num%i ==0)
         {System.out.println("Not a prime number");
         fl=1;    
         break;}
             else 
               i +=1;
           }
       if (fl==0)
           System.out.println("Prime number");
           }
   
   void Fibonacci()
   { Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int num = sc.nextInt();
     int a=0, b=1,c=a+b;
     System.out.print(a +" "+b);
     for (int i=2; i<num; i++)
     {   c= a+b;
         System.out.print(" "+c);
        a=b;
        b=c;
       
     }
     System.out.println();
   }

           public static void main(String[] args) {
       while(true)
       {
               System.out.println("1. Palindrome number");
               System.out.println("2. Pattern");
               System.out.println("3. Prime numbers");
               System.out.println("4. Fibonacci");
               Scanner sc = new Scanner(System.in);
               System.out.println( "Enter your choice");
               int ch = sc.nextInt();
               switch(ch)
               { case 1:new Programs().palindrome();break;
                  case 2: new Programs().pattern(); break;
                  case 3: new Programs().primenumber(); break;
                 case 4: new Programs().Fibonacci(); break;
                 default : {System.out.print("Bye");
                          System.exit(0);}}
       }
      // TODO code application logic here
           }
    
}
