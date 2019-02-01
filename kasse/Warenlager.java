package kasse;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class Warenlager {
    //Warenlager Iterator: "ListIterator<String> iterator = list.listIterator();" ?
    private static Warenlager lager;
    
    private List<Ware> waren;
    
    
    public Ware addWare(Ware ware) {
        
        
        if (ware == null) {
            throw new IllegalArgumentException("Eingabe ist fehlerhaft!");
            
        } else {
            //Überschreiben bei selber ID ? 
            for(Ware w: waren) {
                if (ware.getID() == w.getID()) {
                    
                }
                    
        }
        }
        return ware;
    }
    
	public Ware getWare(int id) {
	    Ware nurAusgabe = null;
	    for (Ware w: waren) {
	        if (id == w.getID()) {
	            nurAusgabe = w;
	        } else {
	            return null;
	        }
	    }
	    return nurAusgabe;
	}
}
