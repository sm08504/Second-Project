
package assignment;

import java.time.LocalDate;

public class Golfer extends Athlete {
	public int handicap;
	
	public Golfer(String name, int year, int month, int dayOfMonth) {
		super.name = name;
		super.dob = LocalDate.of(year,  month, dayOfMonth);
	}
	
	public String getLevel() {
		if (super.getIsAPro() == true) {
			return "professional golfer";
		}
		else {
			return "amateur golfer";
		}
	}
	
	public int getHandicap() {
		return this.handicap;
	}
	
	public void setHandicap(int numb) {
		this.handicap = numb;
	}
	
	public boolean equals(Golfer s) {
		
		if (this.name.equals(s.name) && (this.dob.equals(s.dob))) {
			return true;
		}
		else { return false; }
	}
	
	public String toString() {
		System.out.println(super.name + " is a " + super.getGender() + " " + this.getLevel() + ".");
		System.out.println(super.name + " is " + super.getAge());
		return "";
	}

	/*
	 * A golf handicap is a numerical measure of a golfer's potential ability. A handicap value is a whole number
	 * https://en.wikipedia.org/wiki/Handicap_(golf)
	 */
}
