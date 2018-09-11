import java.util.*;
class St4{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n,i,j;
	System.out.println("enter the number");
	n=s.nextInt();
	for(i=0;i<=n;i++)
	{
	for(j=n;j>i;j--)
	{ 	
		System.out.print(+j);
	}
	System.out.println(" ");
	}
    }
}