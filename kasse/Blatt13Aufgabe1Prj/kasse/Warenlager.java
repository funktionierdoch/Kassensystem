package kasse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Warenlager implements Iterable<Ware> {
    private Map<Integer, Ware> waren = new HashMap<>();
    
    public Ware addWare(Ware ware) {
        if (ware == null) {
            throw new IllegalArgumentException("ware == null");
        }
        return waren.put(ware.getID(), ware);
    }

    public Ware getWare(int id) {
        return waren.get(id);
    }

    public int anzahl() {
        return waren.size();
    }

    public Iterator<Ware> iterator() {
        return waren.values().iterator();
    }
}
