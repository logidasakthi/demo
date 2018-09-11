import java.io.*;
import java.util.*;
class Test
{
     static void validate(int arr)throws MyException
     {
         if(arr<18)
         throw new MyException("not valid");
         else 
         System.out.println("welcome to vote");
      }
            public static void main(String args[]) 
           {
                 Scanner s=new Scanner(System.in);
                 int arr[]=new int[5];
                 for(int i=0;i<5;i++)
                  }
	      System.out.println("Enter age:");
	      arr[i]=s.nextInt();
                 }
                for(int i=0;i<5;i++)
                {
	      try 
	     {
	             validate(arr[i]);
	     }
	    catch(Exception m)
 	   {
 	           System.out.println("Exception occured"+m);
 	   }
               }
       }
}

