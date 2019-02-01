package kasse;
import java.text.DecimalFormat;

public class Ware {

	private int id;
	private String name;
	private double preis;
	
	DecimalFormat f = new DecimalFormat("#0.00");
	
	public Ware(int id, String name, double preis) {
		this.id = id;
		
		do {
			try {
				this.name = name;
			} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("Eingabe ist fehlerhaft! Bitte "
						+ "wdh!");
			}
		} while (this.name == null || this.name == "");
		
		this.preis = preis; 
	}
	
	
	
	public String toString() {
		return this.id + ", " + this.name + ", " 
				+  f.format(this.preis) + "�.";
	}
	
	
	public double getEinzelPreis() {
		return this.preis;
	}
	
	public int getID() {
	    return this.id;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
