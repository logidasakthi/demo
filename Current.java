package pack1;
import java.util.*;
public class Current{
	public void cur(){
	Scanner s=new Scanner(System.in);
	int choice;
	double a,a1,b,b1,c,c1,d,d1,e,e1,f,f1;
	System.out.println("1.D TO INR\n2.E TO INR\n3.Y TO INR\n4.INR TO D\n5.INR TO E\n6.INR TO Y");
	System.out.println("enter the choice");
	choice=s.nextInt();
	switch(choice){
		case 1:
		System.out.println("enter the dollar value");
		a=s.nextDouble();
		a1=a*69.84;
		System.out.println("dollar to inr is" +a1);
		break;
		case 2:
		System.out.println("enter the euro value");
		b=s.nextDouble();
		b1=b*79.76;
		System.out.println("euro to inr is" +b1);
		break;
		case 3:
		System.out.println("enter the yen value");
		c=s.nextDouble();
		c1=c*0.63;
		System.out.println("yen to inr is" +c1);
		break;
		case 4:
		System.out.println("enter the inr value");
		d=s.nextDouble();
		d1= d*0.014;
		System.out.println("dollar value is" +d1);
		break;
		case 5:
		System.out.println("enter the inr value");
		e=s.nextDouble();
		e1=e*0.013;
		System.out.println("the euro value is "+e1);
		break;
		case 6:
		System.out.println("enter the inr value");
		f=s.nextDouble();
		f1=f*1.59;
		System.out.println("the yen value is" +f1);
		break;
		default:
			System.out.println("enter the correct option");
		}
	}
}
