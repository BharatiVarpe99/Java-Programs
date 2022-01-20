package mcs;
import java.util.Scanner; //import Scanner Class
public class Fibonacci {
	
	public static void main(String[] args)
	{
	  int n1=0,n2=1,n3;
	 int i;
      Scanner myobj=new Scanner(System.in);
      System.out.println("enter the number");
      int number=myobj.nextInt();
     
      System.out.println("Fibonacci series is"); 
     System.out.println(+n1);
     System.out.println(+n2);
     
      for(i=2;i<number;i++)
      {
    	n3=n1+n2;
    	System.out.println(n3);
    	
    	n1=n2;
    	n2=n3;
      }
	}

}
