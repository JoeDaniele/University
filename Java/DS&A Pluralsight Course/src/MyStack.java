import java.util.ArrayList;
import java.util.Collection;
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

    public static void main(String[] args) {
        MyStack hw = new MyStack();
        ArrayList<String> ListStack = new ArrayList<>();

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
        stack.push("Ace of Spades");    //stack the spade suit
        stack.push("Jack of Spades");
        stack.push("Queen of Spades");
        stack.push("King of Spades");
        stack.push("Ace of Diamonds"); //stack the diamond suit
        stack.push("Jack of Diamonds");
        stack.push("Queen of Diamonds");
        stack.push("King of Diamonds");
        stack.push("Ace of Clubs");    //stack the club suit
        stack.push("Jack of Clubs");
        stack.push("Queen of Clubs");
        stack.push("King of Clubs");
        stack.push("Ace of Hearts");//stack the heart suit
        stack.push("Jack of Hearts");
        stack.push("Queen of Hearts");
        stack.push("King of Hearts");
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