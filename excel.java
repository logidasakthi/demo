class  sree{
	  void validate(int a) throws Exception{
	if(a>18)
	{
		System.out.println("valid to vote");
	}
	else
	{
		throw new Exception("not valid");
	}
	}
}
class excel extends sree {
	public static void main(String args[])
	{
		excel e=new excel();
		try{
			e.validate(12);
		}
		catch(Exception m)
		{
			System.out.println("exception occured" +m);
		}
		System.out.println("rest of the code");
	}
}