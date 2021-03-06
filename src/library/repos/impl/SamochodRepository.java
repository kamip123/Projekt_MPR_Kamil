package library.repos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import library.domain.Samochod;
import library.mappers.IMapper;
import library.repos.ISamochodRepository;
import library.uow.IUnitOfWork;

public class SamochodRepository extends RepositoryBase<Samochod> implements ISamochodRepository{
	String selectByTypeSql = "SELECT * FROM samochod WHERE typ=?";
	PreparedStatement selectByType;
	String selectByModelSql = "SELECT * FROM samochod WHERE model=?";
	PreparedStatement selectByModel;
	String selectByPrzebiegSql = "SELECT * FROM samochod WHERE przebieg <?";
	PreparedStatement selectByPrzebieg;
	String selectRocznikSql = "SELECT * FROM samochod WHERE rocznik>?";
	PreparedStatement selectRocznik;
	public SamochodRepository(Connection connection,IMapper<Samochod> mapper, IUnitOfWork uow) throws SQLException{
		super(connection,mapper, uow);
		selectByType = connection.prepareStatement(selectByTypeSql);
		selectByModel = connection.prepareStatement(selectByModelSql);
		selectByPrzebieg = connection.prepareStatement(selectByPrzebiegSql);
		selectRocznik = connection.prepareStatement(selectRocznikSql);
	}

	@Override
	protected String getUpdateQuerySql() {
		return "UPDATE samochod SET (marka, model, rocznik, przebieg, typ) = (?,?,?,?,?) WHERE id=?";
	}

	@Override
	protected String getInsertQuerySql() {
		return "INSERT INTO samochod(marka, model, rocznik, przebieg, typ) VALUES (?,?,?,?,?)";
	}

	@Override
	protected String getTableName() {
		return "samochod";
	}

	@Override
	protected String createTableStatementSql() {
		return "CREATE TABLE samochod("
		+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
		+ "marka varchar(50),"
		+ "model varchar(50),"
		+ "rocznik bigint,"
		+ "przebieg bigint,"
		+ "typ varchar(50)"
		+ ")";
	}

	@Override
	protected void setUpdate(Samochod samochod) throws SQLException {
		update.setString(1, samochod.getMarka());
		update.setString(2, samochod.getModel());
		update.setInt(3, samochod.getRocznik());
		update.setInt(4, samochod.getPrzebieg());
		update.setString(5, samochod.getTyp());
		update.setInt(6, samochod.getId());
		
	}

	@Override
	protected void setInsert(Samochod samochod) throws SQLException {
		insert.setString(1, samochod.getMarka());
		insert.setString(2, samochod.getModel());
		insert.setInt(3, samochod.getRocznik());
		insert.setInt(4, samochod.getPrzebieg());
		insert.setString(5, samochod.getTyp());
		
	}
	
	@Override
	public List<Samochod> withType(String typ) {
		List<Samochod> result = new ArrayList<Samochod>();
		try {
			selectByType.setString(1, typ);
			ResultSet rs = selectByType.executeQuery();
			while(rs.next()) result.add(mapper.map(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public List<Samochod> withModel(String model) {
		List<Samochod> result = new ArrayList<Samochod>();
		try {
			selectByModel.setString(1, model);
			ResultSet rs = selectByModel.executeQuery();
			while(rs.next()) result.add(mapper.map(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public List<Samochod> withRocznik(int rocznik) {
		List<Samochod> result = new ArrayList<Samochod>();
		try {
			selectRocznik.setInt(1, rocznik);
			ResultSet rs = selectRocznik.executeQuery();
			while(rs.next()) result.add(mapper.map(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public List<Samochod> withPrzebieg(int przebieg) {
		List<Samochod> result = new ArrayList<Samochod>();
		try {
			selectByPrzebieg.setInt(1, przebieg);
			ResultSet rs = selectByPrzebieg.executeQuery();
			while(rs.next()) result.add(mapper.map(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
