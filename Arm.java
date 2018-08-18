import java.util.*;
class Arm{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n;
	int x,y;
	int sum=0;
	System.out.println("enter the number");
	n=s.nextInt();
	y=n;
	while(n>0)
	{
		x=n%10;
		sum=sum+(x*x*x);
		n=n/10;
	}
	if(y==sum)
	{
		System.out.println("the no. is armstrong");
	}
	else{
		System.out.println("the no.is not armstrong");
	    }
	}
}
	
