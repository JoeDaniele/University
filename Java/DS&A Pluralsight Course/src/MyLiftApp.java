import org.codehaus.groovy.ast.stmt.WhileStatement;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLiftApp {
    ArrayList<String> ListQueue = new ArrayList<>();

    ListQueue<Gad2Chair> gad2Lift = new ListQueue<Gad2Chair>();

    public static void main(String[] args) {
        MyLiftApp app = new MyLiftApp();
        app.runLift();
        System.out.println("\n\n\n");
        app.listLift();
    }

    public void listLift() {
        ListQueue.add("Lennox Lewis");
        ListQueue.add("Manny Pacquiao");
        ListQueue.add("Mike Tyson");
        ListQueue.add("Arturo Gatti");

        System.out.println("Strings in ArrayList: " + ListQueue.size());
        System.out.println(ListQueue);

        System.out.println("List has Lennox Lewis and Arturo Gatti in it: " +
                ListQueue.containsAll(Arrays.asList("Lennox Lewis", "Arturo Gatti")));

        /*System.out.println(ListQueue.contains(new Seats("Lennox Lewis", "Arturo Gatti")));
            thinking I could create something
         */
        System.out.println("2nd chair has: " + ListQueue.get(1));

        unloadList();

        System.out.println("List after removing: " + ListQueue.size());


    }

    private void unloadList() {
        int index = ListQueue.size() - 1;
        // System.out.println(index);
        // ^ Calculate the index of the last element in the arraylist
        ListQueue.remove(index);
        System.out.println(ListQueue);

    }

    public void runLift() {
        loadLift();
        //print out the lift size
        System.out.println(gad2Lift.size());

        //does the lift contain skiers Mary and Anna
        System.out.println("Lift has Joe and Domino on it: " + gad2Lift.contains(new Gad2Chair("Joe", "Domino")));

        //who's at the 2nd position - remember 0 based index
        System.out.println("2nd chair has: " + gad2Lift.access(1).listChairRiders());

        unloadLift();

        //if the lift is unloaded again, an error should occur since no one is left on it
        try {
            unloadLift();
        } catch (IllegalStateException t) {
            System.out.println("Can't unload any more skiers because the lift is empty: " + "\n" + t.getMessage());
        }
    }

    private void loadLift() {
        //skiers in line to get on lift
        Gad2Chair chair1 = new Gad2Chair("Lennox Claudius Lewis", "Myself");
        Gad2Chair chair2 = new Gad2Chair("Joe Daniele", "Alias");
        Gad2Chair chair3 = new Gad2Chair("Joe", "Domino");
        Gad2Chair chair4 = new Gad2Chair("Robert", "Chad");
        Gad2Chair chair5 = new Gad2Chair("Sarah", "Bill");

        //load them onto the lift
        gad2Lift.enQueue(chair1);
        gad2Lift.enQueue(chair2);
        gad2Lift.enQueue(chair3);
        gad2Lift.enQueue(chair4);
        gad2Lift.enQueue(chair5);
    }

    private void unloadLift() {
        Gad2Chair chair = gad2Lift.deQueue();
        //should be John and Dave
        System.out.println(chair.listChairRiders());

        chair = gad2Lift.deQueue();
        //should be Samantha and Kelly
        System.out.println(chair.listChairRiders());

        chair = gad2Lift.deQueue();
        //should be Mary and Anna
        System.out.println(chair.listChairRiders());

        chair = gad2Lift.deQueue();
        //should be Robert and Chad
        System.out.println(chair.listChairRiders());

        chair = gad2Lift.deQueue();
        //should be Sarah and Bill
        System.out.println(chair.listChairRiders());
    }

    class Seats {
        private final String seated1Name;
        private final String seated2Name;

        public Seats(String firstBoxer, String secondBoxer) {
            this.seated1Name = firstBoxer;
            this.seated2Name = secondBoxer;
        }
    }

    class Gad2Chair {
        private final String seat1Name;
        private final String seat2Name;

        public Gad2Chair(String skierInFirstSeat, String skierInSecondSeat) {
            this.seat1Name = skierInFirstSeat;
            this.seat2Name = skierInSecondSeat;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((seat1Name == null) ? 0 : seat1Name.hashCode());
            result = prime * result + ((seat2Name == null) ? 0 : seat2Name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Gad2Chair other = (Gad2Chair) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (seat1Name == null) {
                if (other.seat1Name != null)
                    return false;
            } else if (!seat1Name.equals(other.seat1Name))
                return false;
            if (seat2Name == null) {
                return other.seat2Name == null;
            } else return seat2Name.equals(other.seat2Name);
        }

        public String listChairRiders() {
            return this.seat1Name + ", " + this.seat2Name;
        }

        private MyLiftApp getOuterType() {
            return MyLiftApp.this;
        }
    }
}