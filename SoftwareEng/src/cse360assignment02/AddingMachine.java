package cse360assignment02;



public class AddingMachine {
	  private int total;
	  private String hst="0"; //history for toString
	  


	
	  public AddingMachine () {
		  
	    total = 0;  // not needed - included for clarity
	  }
	
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = value + total; 
		  hst=hst+" + "+value;
		  
	  }

	  public void subtract (int value) {
		  total = value - total;
		  hst=hst+" - "+value;
	  }

	  //print all operations
	  public String toString () {
	   return hst;
	  }

	  public void clear() {
		 
	  }
}



