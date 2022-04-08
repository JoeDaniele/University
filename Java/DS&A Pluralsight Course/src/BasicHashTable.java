public class BasicHashTable<T, V> { //T is for Key, V is for Item/value
    private HashEntry[] data;
    private int capacity; // differs from size

    private class HashEntry<T, V> {
        private T key;
        private V value;

        public HashEntry(T key, V value) {
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