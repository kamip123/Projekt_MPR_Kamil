package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import library.repos.IDatabaseCatalog;
import library.repos.examples.OgloszenieRepositoryExample;
import library.repos.examples.SamochodRepositoryExample;
import library.repos.examples.SprzedawcaRepositoryExample;
import library.repos.impl.DatabaseCatalog;
import library.uow.IUnitOfWork;
import library.uow.UnitOfWork;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {

    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	
    	Connection connection = DriverManager.getConnection(url);
    	IUnitOfWork uow = new UnitOfWork(connection);
    	
    	IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);
    	
    	SamochodRepositoryExample.run(connection, catalog);
    	OgloszenieRepositoryExample.run(connection, catalog);
    	SprzedawcaRepositoryExample.run(connection, catalog);
    	uow.saveChanges();
        connection.close();
    }
}
