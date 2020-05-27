package input;

import java.util.Scanner;

public class InputUtil {

	private static Scanner sc = new Scanner(System.in);
	
	private InputUtil() {}
	private static InputData input; 
	public static InputData getInputFromUser(){
		
		System.out.println("Pls press 1 for Photo or press 2 for page:");
		
		
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Please enter the link for the instagaram photo: ");
			input = new InputBean(getUrl(), InputType.PHOTO); 
			return input;
		}
		case 2: {
			System.out.println("Please enter the link for the instagaram page: ");
			input = new InputBean(getUrl(), InputType.PAGE); 
			return input;
		}
		default:
			throw new IllegalArgumentException("Unexpected value!!");
		}
	}
	
	
	private static String getUrl() {
		sc.nextLine();
		String url =  sc.nextLine();
		sc.close();
		return url;
	}
	
	
	
}
