public class BasicStack<X> { //generic type of x
    private X [] data; //private scope for primitive array
    private int stackPointer; //increment or decrement based on size of stack (internal pointer on this DS)

    public BasicStack(){ //Constructor to initialize array
        data = (X[]) new Object[1000]; //initialize data structure -- set to 1k and cast back to generic type x
        stackPointer = 0; //initialize the stack pointer
    }
    //creating push/pop/search methods == insert/delete/search
    public void push(X newItem) {//Parameter is new item that will go on top of the stack
        data[stackPointer++] = newItem;
    }

    public X pop(){
        return data[--stackPointer];
    }
}