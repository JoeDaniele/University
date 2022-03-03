import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

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