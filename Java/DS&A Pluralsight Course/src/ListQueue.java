import org.jetbrains.annotations.NotNull;

public class ListQueue<T> { //create generic
    private final T[] data; //private primitive array ds
    private int front;
    private int end;

    public ListQueue() { //calls other constructor using THIS and sets queue size to 1000
        this(1000);
    }

    public ListQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (T[]) new Object[size];
    }

    public boolean containsAll(String @NotNull ... args) {
        for (String arg : args) {
            if (!this.contains((T) arg))
                return false;
        }
        return true;
    }

    public int size() {

        if (front == -1 && end == -1) {
            return 0;
        } else {
            return end - front + 1;
        }
    }

    public void enQueue(T item) {

        if ((end + 1) % data.length == front) { //MODULO DIVIDES AND TAKES THE REMAINDER
            throw new IllegalStateException("The Queue is full.");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public T deQueue() {
        T item = null;

        if (size() == 0) {
            throw new IllegalStateException("Can't dequeue because the queue is empty");
        } else if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(T item) {
        boolean found = false;

        if (size() == 0) {
            return found;
        }
        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalArgumentException("No items in queue OR the position is greater than the queue size.");
        }

        int trueIndex = 0;
        for (int i = front; i < end; i++) {
            if (trueIndex == position) {
                return data[i];
            }
            trueIndex++;
        }

        throw new IllegalArgumentException("Could not get queue item at position: " + position);

        /*  Check size issues to begin, if issues throw exception, if none then proceed.
            Cycle thru For Loop -- goal is to return the position requested
            If unable to return the position, throw exception
         */
    }
}