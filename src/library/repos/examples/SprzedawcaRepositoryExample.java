package library.repos.examples;

import java.sql.Connection;
import java.util.List;

import library.domain.Sprzedawca;
import library.repos.IDatabaseCatalog;

public class SprzedawcaRepositoryExample {
public static void run(Connection connection,IDatabaseCatalog catalog){
		
    	catalog.sprzedawcy().createTable();
    	
    	Sprzedawca sprzedawca = new Sprzedawca();
    	sprzedawca.setNazwa("Tanie Auta");
    	sprzedawca.setPrywatnaCzyFirma("Firma");
    	sprzedawca.setTelefon(697597586);
    	sprzedawca.setAdresEMail("tanio@gmail.com");
    	
    	catalog.sprzedawcy().add(sprzedawca);
    	
    	int lastId = catalog.sprzedawcy().lastId();
    	int count = catalog.sprzedawcy().count();
    	
    	List<Sprzedawca> naJakiesImie = catalog.sprzedawcy().naJakiesImie("daniel");
    	
    	System.out.println(lastId + " " +  count);
		
	}
}
