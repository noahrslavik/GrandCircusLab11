package lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class lab11 {
public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);
	
	Movie movie1 = new Movie("Raiders of the Lost Ark", "Steven Spielberg");
	Movie movie2 = new Movie("Jaws", "Steven Spielberg");
	Movie movie3 = new Movie("E.T The Extra-Terestrial", "Steven Spielberg");
	Movie movie4 = new Movie("The Darjeeling Limited", "Wes Anderson");
	Movie movie5 = new Movie("The Grand Budapest Hotel", "Wes Anderson");
	Movie movie6 = new Movie("The Royal Tenenbaums", "Wes Anderson");
	Movie movie7 = new Movie("The Shining", "Stanley Kubrick");
	Movie movie8 = new Movie("2001: A Space Odyssey", "Stanley Kubrick");
	Movie movie9 = new Movie("Pulp Fiction", "Quentin Tarantino");
	Movie movie10 = new Movie("Resevoir Dogs", "Quentin Tarantino");
	
	//place the declared movies into a movie object array
	Movie [] movies = {movie1, movie2, movie3, movie4,movie5, movie6,movie7, movie8,movie9, movie10,};
	do {
	System.out.println("Enter a director and i'll print their movies.\n (Stanley Kubrick, Quentin Tarantino, Wes Anderson, Steven Speilburg):");
	String userInput = kbd.nextLine();
	boolean isValid = false;
	for(int i = 0; i < movies.length; i++) {
		String currentMovie = movies[i].getCategory();
		String currentTitle = movies[i].getTitle();
		if(currentMovie.equalsIgnoreCase(userInput)) {
			System.out.println(currentTitle);
			isValid = true;
		}
	}
	if(!isValid){
			System.out.println("Oops, that director isn't in our system. Try again!");
		}
	
	}while(ValidatorHelper.getYesNo(kbd, "Would you like to continue?"));
	
	System.out.println("I hope we all learned something, thanks for stopping by you beautiful human being");




}
	
	
	
	
	
	
	
	
	
}
