import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Calculator {

	
	
	  
	    public static void main(String[] args)
	    {
	        
	        double num1, num2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the numbers");
	        num1 = sc.nextDouble();
	        num2 = sc.nextDouble();
	        System.out.println("Enter the operator (*,/,+,-,%)");
	  
	        char op = sc.next().charAt(0);
	  
	        double o = 0;
	  
	        switch (op) {
	        
	        //  multiply
	        case '*':
	  
	            o = num1 * num2;
	  
	            break;
	            
	            // divide
	        case '/':
	  
	            o = num1 / num2;
	  
	            break;
	  
	        // add 
	        case '+':
	  
	            o = num1 + num2;
	  
	            break;
	  
	        // subtract 
	        case '-':
	  
	            o = num1 - num2;
	  
	            break;
	  
		   case '%':
		     		
		     o=((num1+num2)/2);
		     break;
	  
	        default:
	  
	            System.out.println(" wrong input, please enter valid input ");
	            break;
	        }
	  
	        System.out.println("The final result:");
	  
	        System.out.println();
	        System.out.println(num1 + " " + op + " " + num2
	                           + " = " + o);
	    }
	}

