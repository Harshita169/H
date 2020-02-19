package cognizant;

public class StringTest {
	private static final String String = null;

	public static void main(String[] args)
	{
		String city1="pune";
		String city2="mumbai";
		String city3="pune";
		String city4=new String ("pune");
		String city5=new String ("mumbai");
		String city6=new String ("pune");
		System.out.println(city1==city3);
		System.out.println(city3.equals(city6));
		System.out.println(city1==city4);
		
		
		String msg="I am an Engineer";
		String year=" of 2020";
		
		
		String h2=msg.concat(year);
		System.out.println(h2);
		int message=msg.length();
		System.out.println(message);
		char s1=msg.charAt(3);
		System.out.println(s1);
		System.out.println(msg.compareTo(year));
		System.out.println(msg.endsWith("r"));
		System.out.println(msg.equalsIgnoreCase(year));
		
	}

}
