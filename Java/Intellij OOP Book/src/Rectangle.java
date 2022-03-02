public class Rectangle {
    private int length, width;

    public Rectangle() {  //constructor 1
        length = width = 0;
    }

    public Rectangle(int l, int w) { //constructor 2
        length = l;
        width = w;
    }

    public int getArea(){ //function
        return length*width;
    }
}

//constructors have the same name as the class, have no return type, and can be public/private