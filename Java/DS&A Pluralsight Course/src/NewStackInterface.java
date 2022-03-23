public class NewStackInterface<T> {
    private T [] data; //private scope for primitive array
    private int stackPointer; //increment or decrement based on size of stack (internal pointer on this DS)

    public NewStackInterface(){ //Constructor to initialize array
        data = (T[]) new Object[1000]; //initialize data structure -- set to 1k and cast back to generic type x
        stackPointer = 0; //initialize the stack pointer
    }

    public void push(T newItem) {
        data[stackPointer++] = newItem;
    }

    public T pop(){
        if (stackPointer == 0){
            throw new IllegalStateException("No more items in the stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(T item){
        boolean found = false;
        for (int i = 0; i <stackPointer ; i++) {
            if (data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(T item){
        while (stackPointer > 0){
            T tmpItem = pop();
            if (item.equals(tmpItem)){
                return item;
            }
        }
        throw new IllegalArgumentException("Could not find the item in the stack: " + item);
    }

    public int size(){
        return stackPointer;
    }
}