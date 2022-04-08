import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PokedexStack {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\Misc\\GithubMain\\Java\\Pokedex\\Starters.txt"));
        File f = new File("C:\\Misc\\GithubMain\\Java\\Pokedex\\Starters.txt");

        ArrayList<String> original = new ArrayList<String>();
        while (s.hasNext()){
            original.add(s.next());
        }

        System.out.println("ArrayList size before editing: " + original.size());
    }
}