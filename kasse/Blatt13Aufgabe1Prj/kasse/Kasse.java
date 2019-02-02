
package kasse;
import java.util.*;



public class Kasse {
    private static LinkedList<Rechnung> rechnungen = new LinkedList<Rechnung>();
    private static Warenlager lager;
    
    static boolean istNichtLeer(String str) {
        return str != null && !str.isEmpty();
    }
    
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
        boolean weiter = true;
        do {
            System.out.println("R: Lege neue Rechnung an.");
            System.out.println("Z: Gibt alle gespeicherten Rechnungen mit "
                + "Datum und Preis aus.");
            System.out.println("W: Fuege neue Ware zum Lager hinzu.");
            System.out.println("A: Gibt alle gespeicherten Waren im "
                + "Lager aus.");
            System.out.println("E: Das Programm wird beendet.");
            String auswahl = scan.nextLine();
            if (auswahl.equals("R")) {
                System.out.println("Bei leerer Eingabe wird abgebrochen.");
                Rechnung rechnung = new Rechnung(); 
                System.out.println("Gebe ID (Ganzzahl) ein: ");
                String eingabe = scan.nextLine();
                
                while(istNichtLeer(eingabe)) {
                    try {
                        Integer.parseInt(eingabe);
                        int id = Integer.parseInt(eingabe);
                        System.out.println("Jetzt Beschreibung und Preis"
                            + " der Ware bitte:");
                        String name = scan.nextLine();
                        String eingabe2 = scan.nextLine();
                        double preis = Double.parseDouble(eingabe2);
                        Ware ware = new Ware(id, name, preis);
                        rechnung.addWare(ware);
                        System.out.println("Neue Ware wurde der Rechnung"
                            + " hinzugefuegt.");
                    } catch ( Exception e ) {
                        System.out.println("ID muss positiv sein!");
                    }
                eingabe = scan.nextLine();  
                }
    
                System.out.println("Rechnung fertiggestellt.");
                rechnungen.add(rechnung);

            } else if(auswahl.equals("Z")) {
               for (Rechnung r: rechnungen) {
                    System.out.println(r);
                }
            } else if(auswahl.equals("W")) {
               boolean korrekt = false;
               System.out.println("ID, name und Preis eingeben: ");
               do {
                   int id = scan.nextInt();
                   if (id <= 0) {
                       korrekt = true;
                   }
                   String name = scan.nextLine();
                   if (name == "") {
                       korrekt = true;
                   }
                   String eingabe2 = scan.nextLine();
                   double preis = Double.parseDouble(eingabe2);
                   if (preis < 0) {
                       korrekt = true;
                       System.out.println("Gesamte Eingabe wdh.");
                   }
                   if (!korrekt) {
                       lager.addWare(new Ware(id, name, preis));
                   }
               } while (korrekt);

               System.out.println("Ware wurde ins Lager hinzugefuegt!");
            } else if(auswahl.equals("A")) {
              for (Ware w: lager) {
                  System.out.println(w);
              }
                   
               
            }
            if(auswahl.equals("E")) {
               System.exit(0);
            }
        } while(weiter);
	scan.close();
	}
}