package assignment;
import java.time.LocalDate;
import java.time.Period;

public abstract class Athlete {
	public LocalDate dob;
	public String name;
	public char gender;
	public boolean isAPro;
	
/*	public Athlete(String name, int year, int month, int dayOfMonth) {
		this.name = name;
		this.dob = LocalDate.of(year, month, dayOfMonth);
	}
	*/
	
	public boolean getIsAPro() {
		return this.isAPro;
	}
	
	public abstract String getLevel();
	public abstract String toString();
	
	public void setIsAPro(boolean pro) {
		this.isAPro = pro;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		if ((this.gender == 'm') || (this.gender == 'M')) {
			return "male";
		}
		else if ((this.gender == 'f') || (this.gender == 'F')) {
			return "female";
		}
		else { return null;
		}
	}
	
	public void setGender(char gend) {
		this.gender = gend;
	}
	
	public String getAge() {
		Period p = Period.between(this.dob,  java.time.LocalDate.of(2017, 9, 23));
		return p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days old.";
	}
	
	public java.time.LocalDate getDob() {
		return this.dob;
	}
	
	/* a person who is proficient in sports and other forms of physical exercise. 
	 * https://www.merriam-webster.com/dictionary/athlete
	 */
	
	//add private data fields (class variables) here 
	
	//there should be only one constructor in this class
}
