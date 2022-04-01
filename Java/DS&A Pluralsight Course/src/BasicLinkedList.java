public class BasicLinkedList<T> { //GENERIC
    private Node first; //front pointer of list
    private Node last;  //back pointer of list
    private int nodeCount; //tracks size, can ++/-- as we change nodes


    public BasicLinkedList() { //Constructor
        first = null;
        last = null;
        nodeCount = 0;
    }

    public void add(T item) {
        if (first == null) {
            first = new Node(item);
            last = first;
        }
        //IF we already have a front node, we want to grab the last node and update its value
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
            //add a new node onto the end of the existing list,
            //link them together,
            //and update the pointer to the last node
        }
        nodeCount++; //update list tracker
    }

    public T remove() {
        if (first == null) {
            throw new IllegalStateException("LinkedList is empty and there are not items to remove.");
        }
        T nodeItem = first.getNodeItem();
        //get the first node by looking at the FIRST pointer

        //now update the first pointer and throw away the OLD first.
        first = first.getNextNode();
        nodeCount--;
        return nodeItem;
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
            //can link the next node to the current node
        }

        public T getNodeItem() {
            return nodeItem;
            //inspect what kind of node it is (see line 18)
        }
    }


}