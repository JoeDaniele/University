public class MyQueue<T> {
    private T [data];
    private int front;
    private int end;

    public MyQueue(){
        this(3);
    }

    public BasicQueue(int size){
        this.front = -1;
        this.end = -1;
        data = (T[])new Object[size];
    }

    public int size(){
        if (front == -1 && end == -1){
            return 0;
        }
        else {
            return end - front + 1;
        }
    }











}