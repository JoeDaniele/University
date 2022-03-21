import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Ant-man");
        arr.add("Hulk");
        arr.add("Iron Man");
        arr.add("Thor");
        arr.add("Claudius");

        System.out.println("ArrayList has size(): " + arr.size());
        System.out.println("Current contents: " + arr);
        showList(arr);

        arr.add(3, "Jarvis"); //inserts into slot 3, others slide right
        showList(arr);

        int i = arr.indexOf("Hulk");
        System.out.println(arr.get(i) + " is located in slot " + i);
        arr.remove(i); //removes value in that slot, others slide left
        showList(arr);

        arr.add(1, "Captain America"); //Original slot 1, others slide right
        showList(arr);

        arr.set(1, "Cap"); //replaces the value in slot 1
        showList(arr);

        arr.remove(5); //removing backwards lets us avoid sliding
        arr.remove(4);
        arr.remove(2);
        arr.remove(0);
        showList(arr);

        arr.add("Hawkeye");
        arr.add("Quicksilver");
        arr.add("Scarlet Witch");
        showList(arr);

        i = arr.indexOf("Hawkeye");
        String removed = arr.remove(i);
        arr.add(i - 1, removed);
        showList(arr);

        System.out.println("Current contents: " + arr);
    }

    private static void showList(ArrayList<String> arr) {
        System.out.println("size() is " + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            int len = arr.get(i).length() + 4; //two quotes two spaces
            System.out.println("|" + centerPad("" + i, len));
        }
        System.out.println("|");
        for (String s : a) {
            System.out.println("| \"" + s + "\" ");
            System.out.println("|\n");
        }
    }
}