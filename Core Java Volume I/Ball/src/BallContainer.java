/**
 * This is part of the Problem Set 0: Introduction for 6.170 Fall 2005.
 */
//package ps0;

import java.util.LinkedList;

/**
 * This is a container can be used to contain Balls.
 */
public class BallContainer {

	// Contents of the box.
	LinkedList<Ball> contents;
	private double volume = 0.0;
	private int size = 0;

	/**
	 * Constructor that creates a new ballcontainer.
	 */
	public BallContainer() {
		contents = new LinkedList<Ball>();
	}

	/**
	 * Adds a ball to the container. This method returns <tt>true</tt>
	 * if ball was successfully added to the container, i.e. ball is
	 * not already in the container. Of course, you are allowed to put
	 * a Ball into a container only once. Hence, this method returns
	 * <tt>false</tt>, if ball is already in the container.
	 * @param b Ball to be added.
	 * @return true if ball was successfully added to the container,
	 * i.e. ball is not already in the container. Returns false, if ball is
	 * already in the container.
	 */
	public boolean add(Ball b) {
		if (contents.contains(b) == false) {
			contents.add(b);
			volume += b.getCapacity();
			size++;
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Removes a ball from the container. This method returns
	 * <tt>true</tt> if ball was successfully removed from the
	 * container, i.e. ball is actually in the container. You cannot
	 * remove a Ball if it is not already in the container and so ths
	 * method will return <tt>false</tt>, otherwise.
	 * @param b Ball to be removed.
	 * @return true if ball was successfully removed from the container,
	 * i.e. ball is actually in the container. Returns false, if ball is not
	 * in the container.
	 */
	public boolean remove(Ball b) {

		if (contents.contains(b)) {
			contents.remove(b);
			volume -= b.getCapacity();
			size--;
			return true;
		}
		else
			return false;
	}

	/**
	 * Each Ball has a volume. This method returns the total volume of
	 * all the Balls in the container.
	 * @return the volume of the contents of the container.
	 */
	public double getVolume() {
		//    	for (int i = 0; i <= contents.size(); i++) {
		//    		if (volume == 0) {
		//    			volume = contents.get(i).getCapacity();
		//    		}
		//    		else {
		//    			volume += contents.get(i).getCapacity();
		//    		}
		//    	}
		return volume;
	}

	/**
	 * Returns the number of Balls in this container.
	 * @return the number of Balls in this container.
	 */
	public int size() {
		//return contents.size();
		return size;
	}

	/**
	 * Empties the container, i.e. removes all its contents.
	 */
	public void clear() {
		contents.clear();
		volume = 0.0;
		size = 0;
	}

	/**
	 * This method returns <tt>true</tt> if this container contains
	 * the specified Ball. It will return <tt>false</tt> otherwise.
	 * @param b Ball to be checked if its in container
	 * @return true if this container contains the specified Ball. Returns
	 * false, otherwise.
	 */
	public boolean contains(Ball b) {
		if (contents.contains(b)) 
			return true;
		else
			return false;
	}

}