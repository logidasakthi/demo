import java.util.*;
public class Al{
	ArrayList<String>a=new ArrayList<String>();
	ArrayList<String >ab=new ArrayList<String>();
	Scanner s=new Scanner(System.in);	
	public static void main(String args[]){
		Al t=new Al();
		int ch;
		do{
			System.out.println("1.append\n2.insert\n3.search\n4.list\n5.display\n6.exit");
			System.out.println("enter the choice");
			Scanner s=new Scanner(System.in);
			ch=s.nextInt();
			switch(ch){
				case 1:
					t.apnd();
					break;
				case 2:
					t.insert();
					break;
				case 3:
					t.search();
					break;
				case 4:
					t.list();
					break;
				case 5:
					t.display();
					break;
				case 6:
					System.out.println("incorrect");
					System.exit(0);
			}
		}while(ch<7);
	}

	public void apnd()
	{	
		System.out.println("append at the end");
		System.out.println("enter the string to append:");
		String  x=s.next();
		a.add(x);
		System.out.println("string is appended");
		display();
	}
	public void insert()
	{
		System.out.println("enter the index");
		int y=s.nextInt();
		System.out.println("enter the string");
		String z=s.next();
		a.add(y,z);
		System.out.println("the element is inserted ");
		display();
	}
	public void search()
	{
		System.out.println("enter the string to search");
	 	String st=s.next();
		if(a.contains(st))
		{
			System.out.println("string is found");
		}
		else{
			System.out.println("string is not found");
		 }
	}
	public void list()
	{
		System.out.println("enter the  character");
		String st1=s.next();
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).startsWith(st1))
			{
				ab.add(a.get(i));
			}
		}
	}
	public void display()
	{
		System.out.println("the output is");
		System.out.println(a);
		System.out.println("using loop is");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}


			
	