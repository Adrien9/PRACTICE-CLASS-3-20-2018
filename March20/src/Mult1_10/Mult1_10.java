package Mult1_10;
import java.util.Scanner;
public class Mult1_10 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a number.");
		int n=scanner.nextInt();


		for(int i=1; i<=10;i++){

			int a=n*i;

			System.out.println(a);
		}
	}
}
