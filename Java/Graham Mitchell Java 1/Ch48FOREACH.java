package hardway;
import static java.lang.System.*;
public class Ch48FOREACH { // Arrays -- Many values in a single variable
	public static void main(String[] args) {
		//String uses brackets to identify and array
		String[] planets= { "Mercury", "Venus", "Earth", "Mars",
						"Jupiter", "Saturn", "Uranus", "Neptune"};
		
		// 
	for (String p : planets) {  //"FOR EACH string in array planets"
			out.println(p + "\t" + p.toUpperCase());
		}               //prints the planets, tabs, converts them to upper case
	
	out.print("\nStudy Drill\n\n");
	
		//study drill:
	
		String[] cars= { "bmw", "honda", "mercedes"};
	
	for (String c : cars) { //again FOR EACH string c in array Cars
		out.println(c + "\t" + c.toUpperCase());
	}					//print string, tab, print caps
	
}
}

/* 
 * AN ARRAY IS A COMPOUND VARIABLE -- ONE NAME WITH MULTIPLE VALUES 
 * 
 * 
 * STUDY DRILL: CREATE ANOTHER ARRAY AND USE AN INITIALIZER TO PUT SEVERAL
 * VALUES INTO IT. 
 * 
 */
