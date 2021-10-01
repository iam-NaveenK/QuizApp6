package test.code.practice;

import java.io.Console;

import javax.swing.JPasswordField;

public class rough {

	public static void main(String[] args) 
	{
		Console console = System.console();
		int i = 5;	
		System.out.println("Please Enter Password");
	    char[] passString = console.readPassword();
	    String pass = new String(passString );
	}

}
