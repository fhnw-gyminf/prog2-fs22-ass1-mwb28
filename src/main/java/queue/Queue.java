package queue;

public class Queue {
	/**
	 * Initializes a queue with a given capacity.
	 */
	private int[] queue;
	private int capacity;
	private int numberOfElements;


	public Queue(int capacity) {
		this.queue = new int[capacity];
		this.capacity = capacity;
	}

	/**
	 * Inserts the specified element into this queue if it is possible to do so
	 * without violating capacity restrictions. This method returns {@code true} if
	 * the operation was successful, i.e. if the element could be added,
	 * {@code false} otherwise.
	 * 
	 * @param element the element to add
	 * @return {@code true} if the element could be added, {@code false} otherwise.
	 */
	public boolean enqueue(int element) {
		if(!isFull()){
			queue[numberOfElements]= element;
			numberOfElements++;
			return true;

		}
		return false;
	}

	/**
	 * Retrieves and removes the head of this queue, or returns {@code -1} if this
	 * queue is empty.
	 *
	 * @return the head of this queue, or {@code -1} if this queue is empty
	 */
	public int dequeue() {
		if (!isEmpty()){
			int firstElement= queue[0];
			for (int i = 0; i < numberOfElements-1; i++){
				queue[i] = queue[i+1];
			}
			numberOfElements--;
			
			return firstElement;

		}
		return -1;
	}

	/**
	 * Returns {@code true} if this queue contains no elements.
	 *
	 * @return {@code true} if this queue contains no elements
	 */
	public boolean isEmpty() {
		
		return numberOfElements==0;
	}

	/**
	 * Returns {@code true} if this queue is full, i.e. if its size is equal to its capacity.
	 *
	 * @return {@code true} if this queue is full
	 */
	public boolean isFull() {
		
		return capacity == numberOfElements;
	}

    /**
     * Returns the number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
	public int size() {
		
		return numberOfElements;
	}

}
