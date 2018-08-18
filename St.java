import java.util.*;
class St{
	public static void main(String args[]){
	int n=5,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for(i=0;i<=n;i++)
	{
	  for(j=0;j<=i;j++)
	  {
		System.out.print("*");
	  }
	System.out.println(" ");
	}
    }
}