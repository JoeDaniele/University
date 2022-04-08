public class BasicHashTable<X, Y> { //X is for Key, Y is for Item/value
    private HashEntry[] data;
    private int capacity; // differs from size
    private int size;

    public BasicHashTable(int tableSize) {//Constructor for BasicHashTable
        this.capacity = tableSize; //set capacity to the table size value
        this.data = new HashEntry[this.capacity]; //use capacity to initialize the HashEntry structure
        this.size = 0;
    }

    public Y get(X key) { //takes in key and returns a value
        int hash = calculateHash(key);
        //nothing for given key? return null
        if (data[hash] == null) {
            return null;
        }
        //Otherwise, get Hash Entry for key and return value
        else {
            return (Y) data[hash].getValue();
        }
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);

        data[hash] = new HashEntry<X, Y>(key, value);
        size++;
    }

    public Y delete(X key) {
        //First get the value for this key so it can be returned
        Y value = get(key);
        //clear out the hashtable slot for the key and return the removed value
        if (value != null) {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            hash = (hash + 1) % this.capacity;

            //If the next slow isn't empty we should re-add it, so we can keep the hash algorithms clean
            while (data[hash] != null) { //found a collision or possible collision
                HashEntry he = data[hash];
                data[hash] = null;
                put((X) he.getKey(), (Y) he.getValue());
                //repositioned the hash item and didn't add a new one so back off the size
                size--;
                hash = (hash + 1) % this.capacity;
            }
        }
        return value;
    }

    public boolean hasKey(X key) {
        int hash = calculateHash(key);
        //if we don't have anything for the given key, we can just return false
        if (data[hash] == null) {
            return false;
        }
        //Otherwise, get the hashentry for the key and see if it matches the given key
        else {
            return data[hash].getKey().equals(key); //get key out of the hash entry, and see if it equals key passed in
        }
    }

    public boolean hasValue(Y value) {
        return false;
    }

    public int size() {
        return this.size;
    }

    private int calculateHash(X key) {
        int hash = (key.hashCode() % this.capacity);
        //this is necessary to deal with collisions
        while (data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    private class HashEntry<T, V> { //Create HashEntry structure
        private T key;
        private V value;

        public HashEntry(T key, V value) { //initialize HashEntry
            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}