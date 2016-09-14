package Bags;/**    A class of bags whose entries are stored in a chain of linked nodes.    The bag is never full.    @author Frank M. Carrano    @version 3.0 * @param <T>*/public class LinkedBag<T> implements BagInterface<T>{	private Node firstNode;       // reference to first node	private int numberOfEntries;	public LinkedBag()	{            firstNode = null;            numberOfEntries = 0;	} // end default constructor	/** Sees whether this bag is empty.	    @return true if the bag is empty, or false if not */        @Override	public boolean isEmpty() 	{            return numberOfEntries == 0;	} 	/** Gets the number of entries currently in this bag.	@return the integer number of entries currently in the bag */        @Override	public int getCurrentSize() 	{            return numberOfEntries;	} 	/** Adds a new entry to this bag.	@param newEntry  the object to be added as a new entry	@return true if the addition is successful, or false if not */        @Override	public boolean add(T newEntry)  	      // OutOfMemoryError possible	{            // add to beginning of chain:            Node newNode = new Node(newEntry);            newNode.next = firstNode; // make new node reference rest of chain (firstNode is null if chain is empty)                    firstNode = newNode;      // new node is at beginning of chain            numberOfEntries++;            return true;	} // end add	/** Sees whether this bag is full.	@return false */        @Override	public boolean isFull() {            System.out.println("Replace stub method for this");            return false;        } 	/** Removes one unspecified entry from this bag, if possible.       @return either the removed entry, if the removal was successful, or null */        @Override	public T remove()         {            System.out.println("Replace stub method for remove");            return null; // STUB        }    	/** Removes one occurrence of a given entry from this bag.       @param anEntry  the entry to be removed       @return true if the removal was successful, or false otherwise */        @Override        public boolean remove(T anEntry)         {            System.out.println("Replace stub method for remove");            return false; // STUB        } 		/** Removes all entries from this bag. */        @Override	public void clear()        {             System.out.println("Replace stub method for clear");            // STUB        } 		/** Counts the number of times a given entry appears in this bag.	@param anEntry  the entry to be counted	 @return the number of times anEntry appears in the bag */        @Override	public int getFrequencyOf(T anEntry)        {          System.out.println("Replace stub method for getFrequencyOF");          return 0; // STUB        } 		/** Tests whether this bag contains a given entry.	@param anEntry  the entry to locate	@return true if the bag contains anEntry, or false otherwise */        @Override	public boolean contains(T anEntry)        {            System.out.println("Replace stub method for contains" );            return false; // STUB        } 	/** Retrieves all entries that are in this bag.	@return a newly allocated array of all the entries in the bag */        @Override	public T[] toArray()	{            // the cast is safe because the new array contains null entries            @SuppressWarnings("unchecked")            T[] result = (T[])new Object[numberOfEntries]; // unchecked cast                        int index = 0;            Node currentNode = firstNode;            while ((index < numberOfEntries) && (currentNode != null))            {               result[index] = currentNode.data;               index++;               currentNode = currentNode.next;            } // end while      	            return result;	} 	private class Node 	{            private T    data; // entry in bag            private Node next; // link to next node            private Node(T dataPortion)            {                this(dataPortion, null);	            }             private Node(T dataPortion, Node nextNode)            {                data = dataPortion;                next = nextNode;	            } 	}         } // end LinkedBag