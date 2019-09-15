import java.util.Scanner;

public class Variables {

		
	//Numerated variables
	byte myByte = 1; //137
	short myShort =1; //32000
	int i = 2;
	long l = 2;
	float ff = 0.5f;
	double myD = 1.1; //More precise then a float
	
	//alphabetical
	char c= 'a';
	String msg = "Hello";
	
	
	//conditionals
	boolean isTrue = false; //or true only
	
	
	public static void Calculator() {
		//Math
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1 + num2);
	}
}
