package org.cerner.Medication;

import java.util.Calendar;

enum MedicationPattern {
	HOURLY,DAILY,DAILY_MEALS,WEEKLY,MONTHLY30,MONTHLY31,YEARLY,LIFETIME;
}
//for a leap year????

public class Medication {
	
	private String medicineName;
	private int dosesCount;	//why doses count??
	private int frequency;
	private MedicationPattern pattern;
	private int nextDoseHrs;
	private int start_day;
	private int start_month;
	private int start_year;
	private int start_HH;
	private int start_MM;
	private int start_SS;
	private int end_day;
	private int end_month;
	private int end_year;
	private int end_HH;
	private int end_MM;
	private int end_SS;
	private int totalNoOfDoses;	//why dosesCount nd totalNoOfDoses  for Lifetime set this val to -1;
	//how to set values for LIFETIME
	//total doses to take each time..
	
	public Medication(String medicineName, int dosesCount, int frequency, MedicationPattern pattern, int start_day, int start_month, int start_year, int start_HH, int start_MM, int start_SS,  int end_day, int end_month, int end_year, int end_HH, int end_MM, int end_SS, int totalNoOfDoses){
		this.medicineName = medicineName;
		this.dosesCount = dosesCount;
		this.frequency = frequency;
		this.pattern = pattern;
		this.start_day = start_day;
		this.start_month = start_month;
		this.start_year = start_year;
		this.start_HH = start_HH;
		this.start_MM = start_MM;
		this.start_SS = start_SS;
		this.end_day = end_day;
		this.end_month = end_month;
		this.end_year = end_year;
		this.end_HH = end_HH;
		this.end_MM = end_MM;
		this.end_SS = end_SS;
		this.totalNoOfDoses = totalNoOfDoses;
		
		switch(pattern){
			case HOURLY:
				this.nextDoseHrs = 1;
				break;
			
			case DAILY:
				this.nextDoseHrs = 24/frequency;
				break;
				
			case DAILY_MEALS:
				this.nextDoseHrs = 24/frequency;
				break;
				
			case WEEKLY:
				this.nextDoseHrs = (24*7)/frequency;
				break;
				
			case MONTHLY30:
				this.nextDoseHrs = (24*7*30)/frequency;
				break;
				
			case MONTHLY31:
				this.nextDoseHrs = (24*7*31)/frequency;
				break;
				
			case YEARLY:
				this.nextDoseHrs = (24*7*365)/frequency;
				break;
				
			default:
				System.out.println("Wrong Pattern Value Observed");
				break;
		}		
		
	}

	public String getMedicineName() {
		return medicineName;
	}

	public int getDosesCount() {
		return dosesCount;
	}

	public int getFrequency() {
		return frequency;
	}

	public MedicationPattern getPattern() {
		return pattern;
	}

	public float getNextDoseHrs() {
		return nextDoseHrs;
	}

	public int getStart_day() {
		return start_day;
	}

	public int getStart_month() {
		return start_month;
	}

	public int getStart_year() {
		return start_year;
	}

	public int getStart_HH() {
		return start_HH;
	}

	public int getStart_MM() {
		return start_MM;
	}

	public int getStart_SS() {
		return start_SS;
	}

	public int getEnd_day() {
		return end_day;
	}

	public int getEnd_month() {
		return end_month;
	}

	public int getEnd_year() {
		return end_year;
	}

	public int getEnd_HH() {
		return end_HH;
	}

	public int getEnd_MM() {
		return end_MM;
	}

	public int getEnd_SS() {
		return end_SS;
	}

	public int getTotalNoOfDoses() {
		return totalNoOfDoses;
	}
	
	public void printNotificationSchedule(){
		Calendar startDate = new Calendar.Builder().setDate(start_year,start_month,start_day).setTimeOfDay(start_HH,start_MM,start_SS).build();
		Calendar endDate = new Calendar.Builder().setDate(end_year,end_month,end_day).setTimeOfDay(end_HH,end_MM,end_SS).build();
		System.out.println("TYPE OF MEDICATION: "+this.pattern);
		int count=0;
		
		while(startDate.getTime().before(endDate.getTime())){
			//check for current condition
			//if(startDate == Calendar.now()) only then print...
			  System.out.println("TIME: "+startDate.getTime());
			  //also save this string for future references...
			count++;
			if(count == this.totalNoOfDoses && this.pattern!=MedicationPattern.LIFETIME)
				break;
			startDate.add(Calendar.HOUR_OF_DAY, this.nextDoseHrs);
			
		}
	}

	public static void main(String[] args) {
		Medication med = new Medication("Aspirin", 5, 2, MedicationPattern.DAILY, 30, 0, 2018, 12, 0, 0, 31, 0, 2018, 12, 0, 0, 5);
		med.printNotificationSchedule();
	}

}
