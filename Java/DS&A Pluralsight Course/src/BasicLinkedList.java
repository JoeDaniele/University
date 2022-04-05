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
        //If we already have a front node, we grab the last node and update its value
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

    public void insert(T item, int position) {
        if (size() < position) {
            throw new IllegalStateException("LinkedList is smaller than the position.");
        }
        Node currentNode = first;

        //Start at 1 because we are already on the first node. loop thru the node list.
        for (int i = 1; i < position && (currentNode != null); i++) {
            currentNode = currentNode.getNextNode();
        }
        //Severs the link chain and reconnects with the new node.
        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public T removeAt(int position) {
        if (first == null) {
            throw new IllegalStateException("LinkedList is empty, there are no items to remove.");
        }
        Node currentNode = first;
        Node prevNode = first;

        //start at 1 because we are already on the first node
        for (int i = 1; i < position && currentNode != null; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        //now update pointers arnd throw away the OLD FIRST
        T nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return nodeItem;
    }

    public T get(int position) {
        if (first == null) {
            throw new IllegalStateException("LinkedList is empty and there are no items to get.");
        }

        Node currentNode = first; //"get the first node and set it equal to the current node."
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (i == position) {
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }
        //if not found then return null;
        return null;
    }

    public T remove() {
        if (first == null) {
            throw new IllegalStateException("LinkedList is empty and there are not items to remove.");
        }
        T nodeItem = first.getNodeItem();
        //get the first node by looking at the first pointer

        //now update the first pointer and throw away the OLD first.
        first = first.getNextNode();
        nodeCount--;
        return nodeItem;
    }

    public int find(T item) {
        if (first == null) {
            throw new IllegalStateException("LinkedList is empty and there are no items to find.");
        }

        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (currentNode.getNextNode().equals(item)) {
                return i;
            }
        }
        currentNode = currentNode.getNextNode();

        //if we didn't find it, then return -1
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer contents = new StringBuffer();
        Node curNode = first;

        while (curNode != null) {
            contents.append(curNode.getNextNode());
            curNode = curNode.getNextNode();

            if (curNode != null) {
                contents.append(",");
            }
        }
        return contents.toString();

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
            //get the next node -- allowing for iteration later (remove, removeAt, insert methods)
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