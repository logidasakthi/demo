class water{
	void p()  throws Exception
	{
		throw new Exception("hello");
	}
	void m() throws Exception
	{
		p();
	}
	void l() throws Exception
	{
		m();
	}
	public static void main(String args[])
	{
		water w=new water();
		try{
		w.l();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
}