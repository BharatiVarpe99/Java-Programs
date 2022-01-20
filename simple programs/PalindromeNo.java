package mcs;
import java.util.Scanner; //import Scanner Class

public class PalindromeNo {

	public static void main(String[] args) {
 
		  int no,rev=0,temp,r;
		  
	      Scanner myobj=new Scanner(System.in);
	      System.out.println("enter the number");
	      int number=myobj.nextInt();
	      
           temp=number;
           while(number!=0)
           {
        	r=number%10;
        	rev=rev*10+r;
        	number=number/10;
           }
           
           if(temp==rev)
           {
        	   System.out.println("Given number is palindrome Number");
           }
           else
           {
        	   System.out.println("Given number is not palindrome"); 
           }
	}

}
