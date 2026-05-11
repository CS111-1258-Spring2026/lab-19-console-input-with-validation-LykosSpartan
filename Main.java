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

	System.out.println("Enter the name of the Netflix Original: ");
	name = keyboard.nextLine();
	System.out.println("Enter the star rating of the Netflix Original (0.0 - 5.0): ");
	starRating = keyboard.nextDouble();
	keyboard.nextLine(); //consume the newline character left by nextDouble()
	System.out.println("Enter the genre of the Netflix Original: ");
	genre = keyboard.nextLine();

	//do while loop genre
	while(!genre.equalsIgnoreCase("Action") && !genre.equalsIgnoreCase("Comedy") && !genre.equalsIgnoreCase("Drama") && !genre.equalsIgnoreCase("Horror") && !genre.equalsIgnoreCase("Science Fiction"))
	{
		System.out.println("Invalid genre. Please enter one of the following genres: Action, Comedy, Drama, Horror, Science Fiction: ");
		genre = keyboard.nextLine();
	}
	
	// Do while loop to get valid star rating from user input.
	do
	{
		if(starRating < 0.0 || starRating > 5.0)
		{
			System.out.println("Invalid star rating. Please enter a value between 0.0 and 5.0: ");
			starRating = keyboard.nextDouble();
			keyboard.nextLine(); //consume the newline character left by nextDouble()
		}
	} while(starRating < 0.0 || starRating > 5.0);
	
	//create and intitialize a NetflixOriginal object with the user data.
	NetflixOriginal tempNetflixOriginal = new NetflixOriginal(name, starRating, genre);

	return tempNetflixOriginal;
}


	

}