package CompSci2;

import java.util.Scanner;

public class HW9P1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Book myBook = new Book();
		Encyclopedia myEncyclopedia = new Encyclopedia();

		String title, author, publisher, publicationDate;
		String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
		int numVolumes;

		title = k.nextLine();
		author = k.nextLine();
		publisher = k.nextLine();
		publicationDate = k.nextLine();

		eTitle = k.nextLine();
		eAuthor = k.nextLine();
		ePublisher = k.nextLine();
		ePublicationDate = k.nextLine();
		edition = k.nextLine();
		numVolumes = k.nextInt();

		myBook.setTitle(title);
		myBook.setAuthor(author);
		myBook.setPublisher(publisher);
		myBook.setPublicationDate(publicationDate);
		myBook.printInfo();

		myEncyclopedia.setTitle(eTitle);
		myEncyclopedia.setAuthor(eAuthor);
		myEncyclopedia.setPublisher(ePublisher);
		myEncyclopedia.setPublicationDate(ePublicationDate);
		myEncyclopedia.setEdition(edition);
		myEncyclopedia.setNumVolumes(numVolumes);
		myEncyclopedia.printInfo();

		k.close();
	}
}