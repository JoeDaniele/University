public class BasicHashTable<T>
{ //X is for Key, Y is for Item/value
    private HashEntry[] data;
    private int capacity; // differs from size
    private int size;

    public BasicHashTable(int tableSize)
    {//Constructor for BasicHashTable
        this.capacity = tableSize; //set capacity to the table size value
        this.data = new HashEntry[this.capacity]; //use capacity to initialize the HashEntry structure
        this.size = 0;
    }

    public T get(String key)
    { //takes in key and returns a value
        int hash = calculateHash(key);
        //nothing for given key? return null
        if (data[hash] == null)
        {
            return null;
        }
        //Otherwise, get Hash Entry for key and return value
        else
        {
            return (T)data[hash].getValue();
        }
    }

    public void put(String key, T value)
    {
        int hash = calculateHash(key);

        data[hash] = new HashEntry<T>(key, value);
        size++;
    }

    public T delete(String key)
    {
        //First get the value for this key so it can be returned
        T value = get(key);
        //clear out the hashtable slot for the key and return the removed value
        if (value != null)
        {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            hash = (hash + 1) % this.capacity;

            //If the next slow isn't empty we should re-add it, so we can keep the hash algorithms clean
            while (data[hash] != null)
            { //found a collision or possible collision
                HashEntry he = data[hash];
                data[hash] = null;
                put((String)he.getKey(), (T)he.getValue());
                //repositioned the hash item and didn't add a new one so back off the size
                size--;
                hash = (hash + 1) % this.capacity;
            }
        }
        return value;
    }

    public boolean hasKey(String key)
    {
        int hash = calculateHash(key);
        //if we don't have anything for the given key, we can just return false
        if (data[hash] == null)
        {
            return false;
        }
        //Otherwise, get the hashentry for the key and see if it matches the given key
        else
        {
            return data[hash].getKey().equals(key); //get key out of the hash entry, and see if it equals key passed in
        }   //returns true or false if it exists or doesn't
    }

    public boolean hasValue(T value)
    {
        //loop through all hash entries.
        for (int i = 0; i < this.capacity; i++)
        {
            HashEntry entry = data[i];
            //if this hash entry isnt null, and the value equals the one passed in, the hashtable has this value
            if (entry != null && entry.getValue().equals(value))
            {
                return true;
            }
        }
        return false;
    }

    public int size()
    {
        return this.size;
    }

    private int calculateHash(String key)
    {
        int hash = (key.hashCode() % this.capacity);
        //this is necessary to deal with collisions
        while (data[hash] != null && !data[hash].getKey().equals(key))
        {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    private class HashEntry<T>
    { //Create HashEntry structure
        private String key;
        private T value;

        public HashEntry(String key, T value)
        { //initialize HashEntry
            this.key = key;
            this.value = value;
        }

        public String getKey()
        {
            return key;
        }

        public void setKey(String key)
        {
            this.key = key;
        }

        public T getValue()
        {
            return value;
        }

        public void setValue(T value)
        {
            this.value = value;
        }
    }
}