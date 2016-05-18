package ua.khpi.osmachko.Practice2;

/**
 * @version 1.10 17 May 2016
 * @author Valerii Osmachko
 *
 */

public interface MyList extends Iterable<Object> {
	
	
	/**
	 * @return void
	 * @param any Object
	 */
	void add(Object e); 
	
	/**
	 * @return void
	 * @param No parametrs 
	 */
	 void clear(); 
	
	 
	 /**
	  * 
	  * @param any Object
	  * @return true if romoving element happend successfull
	  */
	 boolean remove(Object o); 
	 
	 /**
	  * @return method returns array
	  * @param No parametrs
	  */
	 	 
	 Object[] toArray(); 
	 
	 /**
	  * @return returns size of the massive
	  * @param No parametrs
	  */
	 		 
	 int size(); // returns the number of elements in this list
	 
	/**
	 * 
	 * @param any Object
	 * @return returns true if massive contains neccecary Object
	 */
	 boolean contains(Object o); // returns true if this list contains the specified element.
	
	
	 /**
	  * 
	  * @param specified list
	  * @return returns true if this list contains all of the elements of the specified list
	  */
	 boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list
	  
	
}
