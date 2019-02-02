package kasse;
import java.text.DecimalFormat;

public class Ware {

	private final int id;
	private final String name;
	private final double preis;
	
	DecimalFormat f = new DecimalFormat("#0.00");
	
	public Ware(int id, String name, double preis) {
		
		
	    if (name == null || name == "") {
	        throw new IllegalArgumentException("Name darf nicht null sein.");
	    }
	    this.id = id;
	    this.name = name;
		this.preis = preis; 
	}
	
	
	
	public String toString() {
		return this.id + ", " + this.name + ", " 
				+  f.format(this.preis) + "€.";
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
