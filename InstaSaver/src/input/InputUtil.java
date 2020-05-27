package input;

import java.util.Scanner;

public class InputUtil {

	
	private InputUtil() {}
	
	
	public static String getInputLinkFromUser(){
		String url = "";
		System.out.println("Please enter the instagaram link: ");
		Scanner sc = new Scanner(System.in);
		url =  sc.nextLine();
		sc.close();
		return url;
	}
	
	
}
