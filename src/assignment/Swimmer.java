package assignment;

import java.time.LocalDate;

public class Swimmer extends Athlete {
public String teamName;
public Event[] event;

public Swimmer(String name, int year, int month, int dayOfMonth) {
	super.name = name;
	super.dob = LocalDate.of(year,  month, dayOfMonth);
}
	
	public String getLevel() {
		if (super.getIsAPro() == true) {
			return "professional swimmer";
		}
		else {
			return "amateur swimmer";
		}
	}
	
	public void setEvent(Event[] e) {
		this.event = e;
	}
	
	public void setEvent(Event f) {
		this.event = new Event[1];
		this.event[0] = f;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public void setTeamName(String team) {
		this.teamName = team;
	}
	
	public String toString() {
		String text = "";
		for (int i = 0; i < event.length; i++) {
			if (i == event.length-1) {
				text = text.concat(event[i] + "");
			}
			else {
			text = text.concat(event[i] + "; ");
			}
		}
		System.out.println(super.name + " is a " + super.getGender() + " " + this.getLevel() + " for team: " + this.getTeamName() + " in the following events: " + text);
		System.out.println(super.name + " is " + super.getAge());
		return "";
	}
	
	
	public boolean equals(Swimmer s) {
		
		if (this.name.equals(s.name) && (this.dob.equals(s.dob))) {
			return true;
		}
		else { return false; }
	}
	
	/*
	 * Enumeration of all accepted swim events: Backstroke, Freestyle, Butterfly, IM, Breaststroke, Medley
	 */
	public static enum Event {
		Backstroke, Freestyle, Butterfly, IM, Breaststroke, Medley 
	}
	
}
