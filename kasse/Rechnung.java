package kasse;
import java.util.*;
import java.text.SimpleDateFormat;

public class Rechnung {
	 
	private LinkedList<Ware> waren;
	private String datum;
	
	 Scanner scan = new Scanner (System.in);
	 
	 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
     String date = DATE_FORMAT.format(datum);


	public Rechnung () {
		datum = date;
		waren = new LinkedList<Ware>();
		
		
	}
	
	
	public void addWare(Ware ware) {
		
		if (ware == null) {
			throw new IllegalArgumentException("Eingabe ist fehlerhaft!");
			
		} else {
			waren.add(ware);
		}
		
	}
	
	public double getPreis() {
		double summe = 0;
		for(Ware w: waren) {
			summe += w.getEinzelPreis();
		}
		return summe;
	}
	
	
	
	public String toString() {

		for (Ware w : waren) {
		     System.out.println(w);
		}
        return date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
