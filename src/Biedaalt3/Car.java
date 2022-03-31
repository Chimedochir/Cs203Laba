package Biedaalt3;


public class Car {
	String Status;
	String dugaar;
	
	public Car(String ch, String d) {
		Status = ch;
		dugaar = d;
	}
	
	public String getChiglel() {
		return Status;
	}
	
	public String getDugaar() {
		return dugaar;
	}
}