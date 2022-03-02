import java.util.Scanner;

public class RectangleDriver {
    public static void main(String[] args) {
       //Rectangle r  = new Rectangle();
       //r.length = 10;
       // r.width = 5;
        Scanner k = new Scanner(System.in);

        //Rectangle r = new Rectangle(10,5);
        //System.out.println("The area is: " + r.getArea());

        System.out.println("Enter the length and width of a rectangle: ");
        Rectangle user = new Rectangle(k.nextInt(), k.nextInt());
        System.out.println("The area of the users rectangle is: " + user.getArea());


        Rectangle two = new Rectangle(100, 5);
        System.out.println("2nd rectangle area: "+ two.getArea());

        Rectangle three = new Rectangle(2155, 321);
        System.out.println("3rd rectangle area is: "+ three.getArea());
    }
}

//Two different methods of instantiation.