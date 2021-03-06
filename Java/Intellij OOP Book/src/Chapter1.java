import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) throws Exception {
        File f = new File("datafiles/phonetic-alphabet.txt");

        if (!f.exists()) { //!f.exists() is easier            System.out.println(f.getName() + " not found in this folder. ");
            System.exit(1);
        }

        ArrayList<String> words = new ArrayList<String>();
        Scanner alpha = new Scanner(f);

        System.out.println("Reading words from \"" + f.getPath() + "\"...");
        while (alpha.hasNext()){
            String w = alpha.next();
            words.add(w);
        }
        alpha.close();
        System.out.println("Done.\n\t");

        Random rng = new Random();
        rng.setSeed(12345);

        for (int n = 0; n <3; n++){
            int i = rng.nextInt(words.size());
            String s = words.get(i);
            System.out.println(s.toLowerCase() + " ");
        }
        System.out.println();
    }
}
