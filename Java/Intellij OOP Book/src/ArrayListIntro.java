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
    }

    private static void showList(ArrayList<String> arr) {
    }
}