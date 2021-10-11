package COMSC2;

import java.util.Scanner;

public class artDriver {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String newArtist;
		String lifespan;
		String artwork;

		artistry a = new artistry();

		System.out.println("Enter the name of the artist: ");
		newArtist = k.nextLine();
		a.setArtist(newArtist);
		System.out.println("What was their lifespan?");
		lifespan = k.nextLine();
		a.setLifespan(lifespan);
		System.out.println("Enter a piece of art: ");
		artwork = k.nextLine();
		a.setArtwork(artwork);
		System.out.println();
		a.name();
		a.lifespan();
		a.artwork();

		k.close();
	}
}
