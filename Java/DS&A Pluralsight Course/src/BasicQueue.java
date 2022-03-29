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
        }   //could change this to return null -- depending on how you want the queue to work
        //Otherwise if this is the last item on the queue, the queue needs to get reset to empty
        else if (front == end){
            item = data[front]; //front == end checks to see if we are down to the last queue item
            data[front] = null; //claims "data collection purposes" setting the pointer to null?
            front = -1;         // if we are at the last queue item, we set front & end to -1, reinitializing the queue
            end = -1;
        }
        //Otherwise, grab the front of the queue, return it and adjust the front pointer.
        else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(T item) { //Similar to contains method in stack
        boolean found = false;  //declare a false boolean to be returned true at the end, if found

        if (size() == 0){ // check to see size of queue, if empty return false found -- contains nothing
            return found;
        }
        for (int i = front; i < end; i++){ //loop from FRONT of queue, to END of queue and check each item
            if (data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(int position) {
        if (size() == 0 || position > size()){ //Check for size issues to start
            throw new IllegalArgumentException("No items in queue OR the position is greater than the queue size.");
        }

        int trueIndex = 0; //Setting a variable to zero -- front of the queue isn't always at 0
        for (int i = front; i < end ; i++) { //again loop thru each item in the queue
            if (trueIndex == position){ //once the trueIndex reaches the position passed in
                return data[i]; //return the data from the loop
            }   //return is like break;
            trueIndex++;
        }
        //Didn't find item? throw exception.
        throw new IllegalArgumentException("Could not get queue item at position: " + position);

        /*  Check size issues to begin, if issues throw exception, if none then proceed.
            Cycle thru For Loop -- goal is to return the position requested
            If unable to return the position, throw exception
         */
    }
}