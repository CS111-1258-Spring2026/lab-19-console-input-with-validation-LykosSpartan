import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	NetflixOriginal[] netflixOriginals = new NetflixOriginal[2];
	for(int i = 0; i < netflixOriginals.length; i++)
	{
		netflixOriginals[i] = instantiateFromInput(keyboard);
	}
	for(int i = 0; i < netflixOriginals.length; i++)
	{
		System.out.println(netflixOriginals[i]);

	}
	keyboard.close();

	
	}


public static NetflixOriginal instantiateFromInput(Scanner keyboard){
	String name, genre;
	double starRating;

	
	System.out.print("Please enter the name of the show: ");
	name = keyboard.nextLine();
	System.out.print("Please enter the star rating: ");
	starRating = keyboard.nextDouble();
	keyboard.nextLine(); //consume the newline character left by nextDouble()
	System.out.print("Please enter the genre: ");
	genre = keyboard.nextLine();

	do 
	{
		System.out.println("Invalid star rating. Please enter a value between 0.0 and 5.0: ");
		starRating = keyboard.nextDouble();
		keyboard.nextLine(); //consume the newline character left by nextDouble()
	}while (starRating < 0.0 || starRating > 5.0);

	
	do
	{
		System.out.println("Invalid genre. Please try again: ");
		genre = keyboard.nextLine();
	} while(!genre.equalsIgnoreCase("drama") && !genre.equalsIgnoreCase("comedy") && !genre.equalsIgnoreCase("horror") && !genre.equalsIgnoreCase("action") && !genre.equalsIgnoreCase("science fiction") && !genre.equalsIgnoreCase("anime") && !genre.equalsIgnoreCase("reality") && !genre.equalsIgnoreCase("unknown"));
	
	// Do while loop to get valid star rating from user input.
	

	
	//create and intitialize a NetflixOriginal object with the user data.
	NetflixOriginal tempNetflixOriginal = new NetflixOriginal(name, starRating, genre);

	return tempNetflixOriginal;

}


	

}