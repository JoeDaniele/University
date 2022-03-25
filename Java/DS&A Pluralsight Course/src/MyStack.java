import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

/* Homework
Create a stack interface (done)
Make the BasicStack implement it (done)
Change the "Card Test" code to use the Stack interface (done)
Create ArrayList called ListStack
Change "Card Test" code to use ListStack

Use methods from NewStackInterface NOT testing example.
(stack/unstack/contains/goToCard/deckSize)
 */

public class MyStack {
    static NewStackInterface<String> stack = new NewStackInterface<String>();

    public String toString() {
        return "Stack [elements=" + listStack + "]";
    }
    private List<String> listStack = new ArrayList<>();

    public static void main(String[] args) {
        MyStack hw = new MyStack();



        hw.stackSomeCards();
        hw.unstackCards();
        hw.stackSomeCards();
        hw.deckSize();
        hw.containsCard("Queen of Hearts");
        hw.containsCard("Joker");
        hw.goToCard("King of Diamonds");
        hw.deckSize();


    }

    public void stackSomeCards() {
        listStack.add("Joker"); //adding joker for testing
        listStack.add("Ace of Spades");//stack the spade suit
        listStack.add("Jack of Spades");
        listStack.add("Queen of Spades");
        listStack.add("King of Spades");
        listStack.add("Ace of Diamonds");//stack the diamond suit
        listStack.add("Jack of Diamonds");
        listStack.add("Queen of Diamonds");
        listStack.add("King of Diamonds");
        listStack.add("Ace of Clubs");//stack the club suit
        listStack.add("Jack of Clubs");
        listStack.add("Queen of Clubs");
        listStack.add("King of Clubs");
        listStack.add("Ace of Hearts");//stack the heart suit
        listStack.add("Jack of Hearts");
        listStack.add("Queen of Hearts");
        listStack.add("King of Hearts");
    }
    public void unstackCards() {
        //now pull the cards off the stack and print them
        while(stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
    public void containsCard(String card) {
        System.out.println(stack.contains(card));
    }
    public void goToCard(String card) {
        System.out.println(stack.access(card));
    }
    public void deckSize() {
        System.out.println(stack.size());
    }
}