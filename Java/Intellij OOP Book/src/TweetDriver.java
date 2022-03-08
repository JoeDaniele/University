public class TweetDriver {
    public static void main(String[] args) {
        Tweet t = new Tweet("Tues Mar 8 1:07:00 +0000 2022",
                8, true, 867530999L, 2, false,
                "The author needs to learn how to use commas!");

        System.out.println(t);
        System.out.println("\n----------------------\n");
        System.out.println(t);


    }
}