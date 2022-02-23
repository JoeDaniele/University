public class TVActorDriver {
    public static void main(String[] args) {
        TVActor a = new TVActor();
        a.name = "Claudius Lewis";
        a.role = "Heavyweight Champion";

        TVActor b = new TVActor();
        b.name = "Roberto Duran";
        b.role = "Manos De Piedras";

        TVActor c = new TVActor(); // created instance
        c.name = "Prince Naz"; // called variable
        c.role = "Athletic";

        System.out.println(a.name + " was " + a.role);
        System.out.println(b.name + " was " + b.role);
        System.out.println(c.name + " was " + c.role);

    }
}