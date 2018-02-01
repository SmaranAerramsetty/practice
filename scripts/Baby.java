package org.cerner.Baby;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

enum BloodGroup {
	A_Positive,A_Negative,B_Positive,B_Negative,AB_Positive,AB_Negative,O_Positive,O_Negative; 
}

public class Baby {
	private String name;
	private Date birth;
	private BloodGroup bloodGroup;
	private String continent;
	private String state;
	
	Baby(String name, Date birth, BloodGroup bloodGroup, String continent, String state){
		this.name = name;
		this.birth = birth;
		this.bloodGroup = bloodGroup;
		this.continent = continent;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String country) {
		this.continent = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public String getBirthInOtherTimeZone(String continent, String city){
		DateFormat formatter = new SimpleDateFormat("E MMM dd hh:mm:ss zzz yyyy");
		formatter.setTimeZone(TimeZone.getTimeZone(continent+"/"+city)); //or TimeZone.getAvailableIDs() returns String[]
		return formatter.format(this.birth);
	}
	public static void main(String[] args) {
		Date d1 = new Date();
		Baby b1 = new Baby("Sam",d1,BloodGroup.B_Positive,"India","Delhi");
		System.out.println(b1.getBirth());
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy at HH:mm:ss ZZZ");
		//Date d2 = sdf.parse("11/09/1992 at 06:30:45 CST") throws Exception;
		System.out.println(b1.getBirthInOtherTimeZone("America","Texas"));

	}

}
