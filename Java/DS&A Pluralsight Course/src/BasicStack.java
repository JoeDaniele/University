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
        if (stackPointer == 0){
            throw new IllegalStateException("No more items in the stack");
        }
        return data[--stackPointer]; //pre-decrement will pull the value out of the DS and return it.
        //not actually deleting said value
    }

    public boolean contains(X item){
        boolean found = false;
        for (int i = 0; i <stackPointer ; i++) {
            if (data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
        /* Declare local boolean to determine whether we've found the item or not
           Return that variable at the end of the method
           Loop through all items in the stack
           Comparison check on the data slot with the current item passed in
           Once found -- set var to true and break;
           e.g. a basic linear function
         */

    }

    public X access(X item){

        return item;
    }
}