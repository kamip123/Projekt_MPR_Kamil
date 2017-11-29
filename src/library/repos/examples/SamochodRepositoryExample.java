package library.repos.examples;

import java.sql.Connection;
import java.util.List;

import library.domain.Samochod;
import library.repos.IDatabaseCatalog;

public class SamochodRepositoryExample {
public static void run(Connection connection,IDatabaseCatalog catalog){
		
    	catalog.samochody().createTable();
    	
    	Samochod samochod = new Samochod();
    	samochod.setMarka("Fiat");
    	samochod.setModel("Punto");
    	samochod.setRocznik(2010);
    	samochod.setPrzebieg(59000);
    	samochod.setTyp("osobowy");
    	
    	catalog.samochody().add(samochod);
    	
    	int lastId = catalog.samochody().lastId();
    	int count = catalog.samochody().count();
    	
    	List<Samochod> withType = catalog.samochody().withType("osobowy");
    	List<Samochod> withModel = catalog.samochody().withModel("fiat");
    	List<Samochod> withRocznik = catalog.samochody().withRocznik(2010);
    	List<Samochod> withPrzebieg = catalog.samochody().withPrzebieg(59000);
    	
    	System.out.println(lastId + " " +  count);
		
	}
}
