public class BasicLinkedList<T> { //GENERIC
    private Node first; // front of list
    private Node last;  //back of list
    private int nodeCount; //tracks size, can ++/-- as we change nodes


    public BasicLinkedList() { //Constructor
        first = null;
        last = null;
    }

    public int size() {
        return nodeCount;
    }

    private class Node { //Node Structure
        private Node nextNode; //link to the adjacent node
        private T nodeItem; //nodeItem set to generic type -- specifies what the node is e.g. boxcar/tanker car

        public Node(T item) { //Node Constructor that initializes the above attributes
            this.nextNode = null;
            this.nodeItem = item;
            /*Constructor will take in the generic item,
            set the nextNode to null.
            and initialize the nodeItem to the passed in item
             */
        }

        public Node getNextNode() {
            return nextNode;
            //get the next node -- allowing for iteration later
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
            //can link the next node, to the current node
        }

        public T getNodeItem() {
            return nodeItem;
            //inspect what kind of node it is (see line 8)
        }
    }


}