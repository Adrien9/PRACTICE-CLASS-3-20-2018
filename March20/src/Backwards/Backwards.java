package Backwards;
import java.util.Scanner;
public class Backwards {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a string.");
		String s=scanner.nextLine();

		int l=s.length()-1;
		
		for(int i=l; i>=0 ;i--){

			char backwards=s.charAt(i);
			System.out.print(backwards);
		}

	}
}
