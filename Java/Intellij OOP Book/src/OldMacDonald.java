class Cow {
    public void moo() {
        System.out.println("Moo.");
    }
}
class Pig {
    public void oink() {
        System.out.println("Oink.");
    }
}
class Duck {
    public void quack() {
        System.out.println("Quack.");
    }
}
public class OldMacDonald {
    public static void main(String[] args) {
        Cow maudine = new Cow();
        Cow pauline = new Cow();
        maudine.moo();
        pauline.moo();

        Pig snowball = new Pig();
        snowball.oink();
        snowball.oink();

        Duck ferdinand = new Duck();
        ferdinand.quack();

        snowball.oink();
    }
}
