package cse360assignment02;

public class AddingMachine {
  private int total;
  private String output; //keeps track of history from initial 0 to last input
  
  public AddingMachine () {
	  total = 0;  // not needed - included for clarity
	  output = total + "";
  }
  
  public int getTotal () {
	  return total;	//returns total
  }
  
  public void add (int value) {
	  total += value;	//adds value to total
	  output += " + " + value;
  }

  public void subtract (int value) {
	  total -= value;	//subtract value from total
	  output += " - " + value;
  }

  public String toString () {
	  return output; //returns output
  }

  public void clear() {
	  total = 0;
	  output = total + "";
  }
}