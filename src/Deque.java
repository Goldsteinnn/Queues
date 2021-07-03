import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	private Node first = null;
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext() {
			return current.next != null;
		}
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current  = current.next;
			return item;
		}
	}
	
	private class Node{
		Item item;
		Node next;
	}
	// construct an empty deque
    public Deque() {
    	first = new Node();
    }

    // is the deque empty?
    public boolean isEmpty() {
    	return first.item == null;
    }

    // return the number of items on the deque
    public int size() {
    	int count = 0;
    	return 0;
    }

    // add the item to the front
    public void addFirst(Item item) {
    	
    }

    // add the item to the back
    public void addLast(Item item) {
    	
    }

    // remove and return the item from the front
    public Item removeFirst() {
    	
    }

    // remove and return the item from the back
    public Item removeLast() {
    	
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
    	return new ListIterator();
    }

    // unit testing (required)
    public static void main(String[] args) {
    	Deque dq = new Deque();
    	System.out.println(dq.isEmpty());
    }	

	
}
