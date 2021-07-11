import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
	private int size;
	private Item[] q;
	
	private class RandomIterator implements Iterator<Item>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
    // construct an empty randomized queue
    public RandomizedQueue() {
    	size = 0;
    	q = (Item[]) new Object[1];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
    	return size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
    	return size;
    }

    // add the item
    public void enqueue(Item item) {
    	
    }

    // remove and return a random item
    public Item dequeue() {
    	
    }

    // return a random item (but do not remove it)
    public Item sample() {
    	
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator(){
    	return new RandomIterator();
    }
    
    private void resize() {
    	
    }

    // unit testing (required)
    public static void main(String[] args) {
    	
    }

}