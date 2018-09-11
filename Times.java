package pack3;
import java.util.*;
public class Times{
	public void tim(){
		Scanner s=new Scanner(System.in);
		int choice;
		double k,k1,l,l1,m,m1,n,n1;
		System.out.println("1.HR TO MIN\n2.HR TO SEC\n3.MIN TO HR\n4.SEC TO HR");
		System.out.println("enter the choice");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("enter the HR value");
		k=s.nextDouble();
		k1=k*60;
		System.out.println("the hr to min value is" +k1);
		break;
		case 2:
		System.out.println("enter the HR value");
		l=s.nextDouble();
		l1=l*3600;
		System.out.println(" hr to sec value is" +l1);
		break;
		case 3:
		System.out.println("enter the MIN value");
		m=s.nextDouble();
		m1=m*0.016;
		System.out.println("min to hr value is" +m1);
		break;
		case 4:
		System.out.println("enter the SEC value");
		n=s.nextDouble();
		n1=n*0.0002;
		System.out.println("the sec to hr value is" +n1);
		break;
		default:
			System.out.println("enter the correct option");
		}
	}
}