package library.repos.examples;

import java.sql.Connection;
import java.util.List;

import library.domain.Ogloszenie;
import library.repos.IDatabaseCatalog;

public class OgloszenieRepositoryExample {
public static void run(Connection connection,IDatabaseCatalog catalog){
		
    	catalog.ogloszenia().createTable();
    	
    	Ogloszenie ogloszenie = new Ogloszenie();
    	ogloszenie.setTytul("Tanio");
    	ogloszenie.setOpis("Najtaniej w gdansku");
    	ogloszenie.setCena(59000);
    	ogloszenie.setDataUmieszczenia(null);
    	ogloszenie.setDataWygasniecia(null);
    	ogloszenie.setIdSamochodu(1);
    	ogloszenie.setId(1);
    	
    	catalog.ogloszenia().add(ogloszenie);
    	
    	int lastId = catalog.ogloszenia().lastId();
    	int count = catalog.ogloszenia().count();
    	
    	List<Ogloszenie> cenaDo = catalog.ogloszenia().cenaDo(50000);
    	
    	System.out.println(lastId + " " +  count);
		
	}
}
