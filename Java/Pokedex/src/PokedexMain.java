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


        System.out.println("This will print the length of the file: " + f.length());
        //System.out.println("This will print the path: ");
        //System.out.println(f.toString() +"\n" + f.getPath() +"\n" + f.getAbsolutePath() );

        System.out.println("Lets convert the imported file to an ArrayList:");
        ArrayList<String> original = new ArrayList<String>();
        while (s.hasNext()){
            original.add(s.next());
        }
        System.out.println("Let's get the size of our new ArrayList: " + original.size());
        System.out.print(original);


    }
}