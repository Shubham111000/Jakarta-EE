package mypack;

public class Logic 
{
	String s;
	public void setS(String s) 
	{
		this.s=s;
		System.out.println(s);
		
	}
	public String getAdvice() 
	{
		if(s.equalsIgnoreCase("B.E"))
			return "You should do CDAC";
		else
			return "Dont Understand Your Qualification";
	}

}
