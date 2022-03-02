public class FieldAccessDriver {
    public static void main(String[] args) {
        FieldAccess j = new FieldAccess("Claudius", "Domino", "Pizza");
        System.out.println(j.getFullName());

        j.setLast("Daniele");
        j.setFirst("Joseph");
        j.setNick("Joe");
        System.out.println(j.getFullName());


        j.setLast("Lewis");
        j.setFirst("Claudius");
        j.setNick("Lennox");
        System.out.println(j.getFullName());
    }
}