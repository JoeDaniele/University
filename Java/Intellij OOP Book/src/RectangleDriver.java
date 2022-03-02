public class RectangleDriver {
    public static void main(String[] args) {
       //Rectangle r  = new Rectangle();
       //r.length = 10;
       // r.width = 5;

        Rectangle r = new Rectangle(10,5);
        System.out.println("The area is: " + r.getArea());

        Rectangle one = new Rectangle(100, 5);
        System.out.println("2nd rectangle area: "+ one.getArea());

        Rectangle two = new Rectangle(2155, 321);
        System.out.println("3rd rectangle area is: "+ two.getArea());

    }
}

//Two different methods of instantiation.