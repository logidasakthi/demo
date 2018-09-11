import java.util.*;
class St3{
	public static void main(String args[]){
	int n,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for(i=n;i>0;i--)
	{
		for(j=1;j<=i;j++)
		{ 	
			System.out.print(+j);
		}
		System.out.println("  ");
	}
    }
}