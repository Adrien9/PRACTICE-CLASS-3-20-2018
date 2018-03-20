package Movie;
import java.util.Scanner;
public class MovieTest {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		Movie m1=new Movie("Juice","Drama",4.0);
		Movie m2=new Movie("Black Panther","Action",4.7);
		Movie m3=new Movie("Mission Impossible","Action",3.5);
		Movie m4=new Movie("IT","Horror",3.8);
		Movie m5=new Movie("The Godfather","Crime",3.9);

		System.out.println(m1.name);
		System.out.println(m1.genre);
		System.out.println(m1.rate);

		System.out.println(m2.name);
		System.out.println(m2.genre);
		System.out.println(m2.rate);

		System.out.println(m3.name);
		System.out.println(m3.genre);
		System.out.println(m3.rate);

		System.out.println(m4.name);
		System.out.println(m4.genre);
		System.out.println(m4.rate);

		System.out.println(m5.name);
		System.out.println(m5.genre);
		System.out.println(m5.rate);

		System.out.println("Do you want to search based on genre or rating?");

		String answer=scanner.nextLine();

		if(answer.equals("genre")){

			System.out.println("What genre do you want to choose?");

			String g=scanner.nextLine();

			if(g.equals(m1.genre)){

				System.out.println("The movie for you is " + m1.name);
			}

			else if(g.equals(m2.genre)){

				System.out.println("The movie for you is " + m2.name);
				System.out.println("The movie for you is " + m3.name);
			}

			else if(g.equals(m4.genre)){

				System.out.println("The movie for you is " + m4.name);
			}
			else if(g.equals(m5.genre)){

				System.out.println("The movie for you is " + m5.name);
			}
		}

		if(answer.equals("rating")){

			if(m2.rate>m1.rate && m2.rate>m3.rate && m2.rate>m4.rate && m2.rate>m5.rate){

				System.out.println("The movie for you is " + m2.name);
			}
			if(m1.rate>m2.rate && m1.rate>m3.rate && m1.rate>m4.rate && m1.rate>m5.rate){

				System.out.println("The movie for you is " + m1.name);
			}
			if(m3.rate>m1.rate && m3.rate>m2.rate && m3.rate>m4.rate && m3.rate>m5.rate){

				System.out.println("The movie for you is " + m3.name);
			}
			if(m4.rate>m1.rate && m4.rate>m3.rate && m4.rate>m2.rate && m4.rate>m5.rate){

				System.out.println("The movie for you is " + m4.name);
			}
			if(m5.rate>m1.rate && m5.rate>m3.rate && m5.rate>m4.rate && m5.rate>m2.rate){

				System.out.println("The movie for you is " + m5.name);
			}
		}
	}
}
