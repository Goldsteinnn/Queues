import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	private Node first,last;
	private int size;
	
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext() {
			return current != null;
		}
		public Item next() {
			Item item = current.item;
			current  = current.next;
			//System.out.println(item);
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
    	first =  null;
    	last = null;
    	size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
    	return size ==  0;
    }

    // return the number of items on the deque
    public int size() {
    	return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
    	Node newFirst = new Node();
    	newFirst.item = item;
    	newFirst.prev = null; 
    	//if it is empty
    	if(size == 0) {
    		newFirst.next = null;
    		first = newFirst;
    		last = newFirst;
    	}
    	else {
    		first.prev = newFirst;
    		newFirst.next = first;
    		first = newFirst;
    		
    	}
    	size++;
    	
    	
    }

    // add the item to the back
    public void addLast(Item item) {
    	Node newNode = new Node();
    	newNode.item = item;
    	newNode.next = null;
    	if(size == 0) {
    		newNode.next = null;
    		newNode.prev = null;
    		first =  newNode;
    		last = newNode;
    	}
    	else {
    		last.next = newNode;
    		newNode.prev = last;
    		last = newNode;
    		
    	}
    }

    // remove and return the item from the front
    public Item removeFirst() {
    	Item item = first.item;
    	first = first.next;
    	return item;
    	
    } 

    // remove and return the item from the back
    public Item removeLast() {
    	//Updates last pointer
    	Item item = last.item;
    	last = last.prev;
    	last.next = null;
    	size--;
    	
    	
    	return item;
    	
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
    	return new ListIterator();
    }
    
    public void displayQ() {
    	ListIterator li = new ListIterator();
    	while(li.hasNext()) {
    		System.out.println(li.next());
    	}
    	
    }
    public Item getLast() {
    	return last.item;
    }

    // unit testing (required)
    public static void main(String[] args) {
    	Deque dq = new Deque();
    	dq.addFirst(1);
    	dq.addFirst(2);
    	dq.addFirst(3);
    	dq.addLast(4);
    	dq.displayQ();
    	dq.removeFirst();
    	System.out.println("First Gone");
    	dq.displayQ();
    	dq.removeLast();
    	System.out.println("Last Gone");
    	dq.displayQ();
    	
    	
    }	
	
}
