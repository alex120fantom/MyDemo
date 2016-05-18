package ua.khpi.osmachko.Practice2;

import java.util.Iterator;

/**
 * @version 1.10 17 May 2016
 * @author Valerii Osmachko
 *
 */

public class MyListImpl implements MyList {
	
	
	int a = 20;  
	 Object [] tmp = new Object[a] ;
	
	
	
	/**
	 * @author Valerii Osmachko
	 * @param Object is paramet of method
	 * @return  void
	 */
	
	@Override
	public void add(Object e) { // It is method whitch add's new element to massive of Objects
	Object [] array = new Object [tmp.length + 1];
	for (int i = 0; i < tmp.length; i++) {
		array[i] = tmp[i];
	}
	array[array.length-1] = e;
	tmp = array;
	}

	
	/**
	 * @author Valerii Osmachko
	 * @param No parametrs
	 * @return void 
	 */
	@Override
	public void clear() { //This method clears the massive
			Object [] arr = null;
			this.tmp = arr;
			
	}
	
	/**
	 * @author Valerii Osmachko
	 * @param any Object 
	 * @return returns true if Object is exists in our massive and is deleted, otherwise returns false
	 */
	@Override
	public boolean remove(Object o) { //This method removes element
		int counter = 0;
		for (int i = 0; i<=tmp.length;i++) {
			counter++;
			if(o.equals(tmp[i])) {
				Object [] arr = new Object[tmp.length - 1];
				System.arraycopy(tmp, 0, arr, 0, counter);
				System.arraycopy(tmp, counter+1, arr, counter, tmp.length - (counter+1));
				arr = tmp;
				return true;
			} 
		} 
	 return false;
	}

	/**
	 * @author Valerii Osmachko
	 * @param No parametrs
	 * @return returns massive of Objects
	 */
	@Override
	public Object[] toArray() { //returns an array containing all of the elements in this list in proper sequence
		return tmp.clone();
	}

	
	/**
	 * @author Valerii Osmachko
	 * @param No parametrs
	 * @return returns int
	 */
	@Override
	public int size() { // this method returns number of elements in massive
		if(tmp.length == 0){
			return 0;
		} else{
			return tmp.length;	
		}
	
	}

	
	/**
	 * @author Valerii Osmachko
	 * @param any Object
	 * @return returns true if inspection of the Object was successfull and it exists in our massive
	 * 
	 */
	@Override
	public boolean contains(Object o) { // It is the method, whitch says has our collection necessary element
		for (Object object : tmp) {
			if(o.equals(object)){
				return true;
			}
		}
		return false;
	}

	
	/**
	 * @author Valerii Osmachko
	 * @param specified list
	 * @return returns true if this list contains all of the elements of the specified list
	 * 
	 */
	@Override
	public boolean containsAll(MyList c) {
		for (Object o : tmp) {
			if(c.equals(o)){
				return true;
			}
		}
		return false;
	}

	/**
	 * @author Valerii Osmachko
	 * @param no Parametrs
	 * @return returns needed realization of toString
	 * 
	 */
	@Override
	public String toString() { 
		String [] str = new String[tmp.length];
		String st = null;
		for (int i = 0; i < tmp.length; i++) {
			str[i] = tmp[i].toString();
		}
		for (int i = 0; i < str.length; i++) {
			if(i == 0 ){
			st = st + "[" + str[i] + "], " ;
	     }else if(i == str.length){
	    	 st = st + "[" + str[i] + "]";
	     }else{
	    	 st = st + "[" + str[i] + "], ";
	     }
	}   
	
		return "{" + st + "}";
	}


	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
