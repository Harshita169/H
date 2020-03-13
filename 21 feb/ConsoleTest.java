package cognizant;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console c=System.console();
		System.out.println("Enter username");
		String name=c.readLine();
		System.out.println("Enter Password");
		char ch[]=c.readPassword();
		String password=String.valueOf(ch);
	}

}
