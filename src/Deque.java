import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	private Node first,last;
	
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext() {
			return current.next!= null;
		}
		public Item next() {
			Item item = current.item;
			current  = current.next;
			System.out.println(current.item);
			return item;
		}
	}
	
	private class Node{
		Item item;
		Node next;
		Node prev;
	}
	// construct an empty deque
    public Deque() {
    	first =  new Node();
    	last = new Node();
    }

    // is the deque empty?
    public boolean isEmpty() {
    	return first.item == null;
    }

    // return the number of items on the deque
    public int size() {
    	int count = 0;
    	while(iterator().hasNext()) {
    		iterator().next();
    		count++;
    	}
    	return count;
    }

    // add the item to the front
    public void addFirst(Item item) {
    	Node oldFirst =  first;
    	first.item = item;
    	if(isEmpty()) {
    		first.next = null;
    	}
    	else {
    		first.next = oldFirst;
    		first.prev = null;
    	}
    	
    	
    }

    // add the item to the back
    public void addLast(Item item) {
    	Node oldLast = last;
    	last = new Node();
    	last.item = item;
    	last.next = null;
    	if(isEmpty()) {
    		first = last;
    	}
    	else {
    		oldLast.next = last;
    	}
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
    	dq.addFirst(1);
    	System.out.println(dq.size());
    }	

	
}
