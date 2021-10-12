package COMSC2;

public class artistry {

	private String artist;
	private String lifetime;
	private String artwork;

	public void setArtist(String newArtist) {
		artist = newArtist;
	}

	public void setLifespan(String newLifetime) {
		lifetime = newLifetime;
	}

	public void setArtwork(String newArtwork) {
		artwork = newArtwork;

	}

	public String getArtist() {
		return artist;
	}

	public void name() {
		System.out.print("Arist: " + getArtist());
	}

	public String getLifespan() {
		return lifetime;

	}

	public void lifespan() {
		System.out.print(" (" + getLifespan() + ") ");
	}

	public String getArtwork() {
		return artwork;
	}

	public void artwork() {
		System.out.println("Title: " + getArtwork());
	}

}

/*
 * NAME OF THE GAME IS GETTERS AND SETTERS
 *
 *
 *
 */
