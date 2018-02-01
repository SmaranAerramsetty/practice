package org.cerner.Temperature;

import java.util.*;

enum RecordedFrom {
	MOUTH(1),ARMPIT(-2),BODY(3); //values for extra diff
	private double externalDifference;
	RecordedFrom(int externalDifference){
		this.externalDifference = externalDifference;
	}
	public double getMeasuringStyleDifference(){
		return this.externalDifference;
	}
}
enum Scale {
	FARENHEIT, CELCIUS, KELVIN;
}

public class Temperature  {
	private double reading;
	private Scale scale;
	private RecordedFrom recordedFrom;
	static final double thresholdValue = 1;
	private LinkedList<Temperature> temperatures = new LinkedList<Temperature>();
	
	Temperature(){
		//add all the patient details if needed.
	}
	
	Temperature(double reading,Scale scale, RecordedFrom recordedFrom){
		
		switch(scale){
			case FARENHEIT:
				this.reading = convertF2C(reading) + recordedFrom.getMeasuringStyleDifference();
				break;
			
			case KELVIN:
				this.reading  = convertK2C(reading) + recordedFrom.getMeasuringStyleDifference();
				break;
			
			case CELCIUS:
				this.reading = reading + recordedFrom.getMeasuringStyleDifference();
				break;
				
			default:
				System.out.println("Wrong Scale Value Observed");
				break;
		
		}
		
		this.recordedFrom = recordedFrom;
		this.scale = scale;
		
	}
	
	public double getReading(){
		return this.reading;
	}
	
	public Scale getScale(){
		return this.scale;
	}
	
	public RecordedFrom getMeasuringStyle(){
		return this.recordedFrom;
	}
	
	public void addTemperature(Temperature t){
		boolean fever; //write hasFever
		if(this.temperatures.isEmpty())
			fever = false;
		else
			fever = checkFever(t.getReading());
		if(!fever)
			this.temperatures.add(t);
	}
	
	public LinkedList<Temperature> getTemperature(){
		return this.temperatures;
	}
	
	public boolean checkFever(double reading){
		double average = 0;
		double sum = 0;
		for(Temperature temp: this.temperatures){	//this cannot be used in a static context.
			sum = sum + temp.getReading();
		}
		average = sum/this.temperatures.size();
		if(Math.abs(average-reading) <= Temperature.thresholdValue)	//static variable should be accessed in a static way
			return false;
		else{
			System.out.println("Fever detected.....");
			return true;
		}
			
	}
	
	static double convertF2C(double reading){
		return ((reading-32)*5.0)/9.0;
	}
	static double convertK2C(double reading){
		return reading-273;
	}
	
	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		t1.addTemperature(new Temperature(35.2, Scale.FARENHEIT, RecordedFrom.BODY));
		t1.addTemperature(new Temperature(35.4, Scale.FARENHEIT, RecordedFrom.BODY));
		t1.addTemperature(new Temperature(35.3, Scale.FARENHEIT, RecordedFrom.BODY));
		t1.addTemperature(new Temperature(35.8, Scale.FARENHEIT, RecordedFrom.BODY));
		t1.addTemperature(new Temperature(1.77, Scale.CELCIUS, RecordedFrom.BODY));
		System.out.println("All cool");
		t1.addTemperature(new Temperature(38.2, Scale.FARENHEIT, RecordedFrom.BODY));
		System.out.println("====List all Temperatures============");
		LinkedList<Temperature> temp = t1.getTemperature();
		for(Temperature t:temp){
			System.out.println("Reading :"+t.getReading() + " deg. C | Scale :"+ t.getScale()+" | Rec-Frm :"+t.getMeasuringStyle());
		}
		

	}

}
