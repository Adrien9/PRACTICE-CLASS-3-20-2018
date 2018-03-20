package Addn;
import java.util.Scanner;
public class Addn {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a number.");
		int n=scanner.nextInt();

		int nn=n*11;
		int nnn=n*111;
				
		int a=n+nn+nnn;
		
		System.out.println(a);
	}
}