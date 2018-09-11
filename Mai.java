package pack;
import java.util.*;
import pack1.*;
import pack2.*;
import pack3.*;
class Mai{
	public static void main(String args[]){
	Current z=new Current();
	Dist y=new Dist();
	Times x=new Times();
	int ch;
	Scanner s=new Scanner(System.in);
	System.out.println("1.cur\n2.dis\n3.tim");
	System.out.println("enter your choice");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:
		System.out.println("Currency conversion");
		z.cur();
		break;
		case 2:
		System.out.println("Distance conversion");
		y.dis();
		break;
		case 3:
		System.out.println("time conversion");
		x.tim();
		break;
		default:
			System.out.println("enter correct option");
	}
	}
}		