package library.repos.impl;

import java.sql.Connection;
import java.sql.SQLException;

import library.mappers.OgloszenieMapper;
import library.mappers.SamochodMapper;
import library.mappers.SprzedawcaMapper;
import library.repos.IDatabaseCatalog;
import library.repos.IOgloszenieRepository;
import library.repos.ISamochodRepository;
import library.repos.ISprzedawcaRepository;
import library.uow.IUnitOfWork;

public class DatabaseCatalog implements IDatabaseCatalog{

	Connection connection;
	IUnitOfWork uow;
	
	public DatabaseCatalog(Connection connection, IUnitOfWork uow){
		this.connection = connection;
		this.uow = uow;
	}
	
	@Override
	public IOgloszenieRepository ogloszenia() {
		try {
			return new OgloszenieRepository(connection, new OgloszenieMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public ISamochodRepository samochody() {
		try {
			return new SamochodRepository(connection, new SamochodMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public ISprzedawcaRepository sprzedawcy() {
		try {
			return new SprzedawcaRepository(connection, new SprzedawcaMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
