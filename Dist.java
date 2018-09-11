package pack2;
import java.util.*;
public class Dist{
	public void dis(){
	Scanner s=new Scanner(System.in);
	int choice;
	double g,g1,h,h1,i,i1,j,j1;
	System.out.println("1.M TO KM\n2.MILES TO KM\n3.KM TO M\n4.KM TO MILES");
	System.out.println("enter the choice");
	choice=s.nextInt();
	switch(choice)
	{
		case 1:
		System.out.println("enter the m value");
		g=s.nextDouble();
		g1=g*0.001;
		System.out.println("M TO KM IS" +g1);
		break;
		case 2:
		System.out.println("enter the miles value");
		h=s.nextDouble();
		h1=h*1.609;
		System.out.println("MILES TO KM IS" +h1);
		break;
		case 3:
		System.out.println("enter the KM value");
		i=s.nextDouble();
		i1=i*1000;
		System.out.println("KM TO M IS" +i1);
		break;
		case 4:
		System.out.println("enter the KM value");
		j=s.nextDouble();
		j1=j*0.621;
		System.out.println(" KM TO MILES IS" +j1);
		break;
		}
	}
}
