import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
/*Goal is to allow the user to enter a Pokémon by name or number
and return its type(s) like a Pokédex would. Experimenting with data structures.

Question: Which data structure or series of structures will allow me to configure this
more freely e.g. user input name || type || number || -> user receives everything associated with those 3.

Can this be any of this done with an imported file?

If I want to add more parameters to the Pokémon e.g. description, height, weight, abilities;
can that I import multiple files to set that up?

Example: Charmander, #004, "It has a preference for hot things.", 2'0", 18.7lbs, Abilities: Blaze.

Goal: Figure this out then create a Pokédex in JS.
Gotta catch em all.
 */
public class PokedexMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\Misc\\GithubMain\\Java\\Pokedex\\Starters.txt"));
        File f = new File("C:\\Misc\\GithubMain\\Java\\Pokedex\\Starters.txt");

        System.out.println("File Location:"+ f.getAbsoluteFile());
        System.out.println("File Length: " + f.length());

        ArrayList<String> original = new ArrayList<String>();
        while (s.hasNext()){
            original.add(s.next());
        }
        System.out.println("Size of ArrayList: " + original.size());
        System.out.print(original +"\n");

        System.out.println("Printing 151: " + original.get(150));

    }
}