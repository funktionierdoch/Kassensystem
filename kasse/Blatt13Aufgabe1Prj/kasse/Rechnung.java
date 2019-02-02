package kasse;
import java.util.*;

public class Rechnung {
	 
	private LinkedList<Ware> waren;
	private Date datum;
	

	public Rechnung () {
		datum = new Date();
		waren = new LinkedList<Ware>();
		
		
	}
	
	
	public void addWare(Ware ware) {
		
		if (ware == null) {
			throw new IllegalArgumentException("Eingabe ist fehlerhaft!");
			
		}
		
		waren.add(ware);
	
		
	}
	
	public double getPreis() {
		double summe = 0;
		for(Ware w: waren) {
			summe += w.getEinzelPreis();
		}
		return summe;
	}
	
	
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
        for (Ware w : waren) {
            sb.append(w.toString()).append(System.lineSeparator());
        }
        sb.append(this.datum);
        
        return sb.toString();
        
	}
	
	
	

       

	
	
	
	
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
