public class BasicHashTable<T, V> { //T is for Key, V is for Item/value
    private HashEntry[] data;
    private int capacity; // differs from size
    private int size;

    public BasicHashTable(int tableSize) {//Constructor for BasicHashTable
        this.capacity = tableSize; //set capacity to the table size value
        this.data = new HashEntry[this.capacity]; //use capacity to initialize the HashEntry structure
        this.size = 0;
    }

    public V get(T key) { //takes in key and returns a value
        int hash = calculateHash(key);
        //nothing for given key? return null
        if (data[hash] == null) {
            return null;
        }
        //Otherwise, get Hash Entry for key and return value
        else {
            return (V) data[hash].getValue();
        }
    }

    public void put(T key, V value) {
        int hash = calculateHash(key);

        data[hash] = new HashEntry<T, V>(key, value);
        size++;
    }

    public int size() {
        return this.size;
    }

    private int calculateHash(T key) {
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