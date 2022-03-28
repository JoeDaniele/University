
public class BasicQueue<T> { //create generic
    private T[]data; //private primitive array ds
    private int front;
    private int end;


    public BasicQueue(){ //calls other constructor using THIS and sets queue size to 1000
        this(1000);
    }

    public BasicQueue(int size){ //takes size parameter/argument and initializes Q to given size
        this.front = -1; //-1 is before 0, 0 is first in the queue
        this.end = -1;
        data = (T[])new Object[size];
    }

    public int size(){
        //if the queue is empty return 0
        if (front == -1 && end == -1) {
            return 0; // simple check to see if the queue is empty
        }
        //add one to get the INCLUSIVE subtraction value rather than excluding the front
        else{
            return end - front + 1;
        }
    }

    public void enQueue(T item) {
        //check if Queue is full
        if ((end + 1) % data.length == front){ //MODULO DIVIDES AND TAKES THE REMAINDER
            throw new IllegalStateException("The Queue is full.");
        }
        //Otherwise check to see if any items have been added to the queue yet
        else if (size() == 0){
            front++;
            end++;
            data[end] = item;
        }
        //otherwise add the item to the end of the queue
        else{
            end++;
            data[end] = item;
        }
    }
    public T deQueue(){
        T item = null; //local variable placeholder for the item were returning

        //if the queue is empty we can't dequeue anything
        if (size() == 0){
            throw new IllegalStateException("Can't dequeue because the queue is empty");
        }
        //otherwise if this is the last item on the queue, the queue needs to get reset to empty
        else if (front == end){
            item = data[front];
            front = -1;
            end = -1;
        }
        else {
            item = data[front];
            front++;
        }
        return item;
    }
}