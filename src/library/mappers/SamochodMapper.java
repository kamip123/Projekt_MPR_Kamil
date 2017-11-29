package library.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import library.domain.Samochod;

public class SamochodMapper implements IMapper<Samochod>{
	@Override
	public Samochod map(ResultSet rs) throws SQLException {
		Samochod p = new Samochod();
		p.setId(rs.getInt("id"));
		p.setMarka(rs.getString("marka"));
		p.setModel(rs.getString("model"));
		p.setRocznik(rs.getInt("rocznik"));
		p.setPrzebieg(rs.getInt("przebieg"));
		p.setTyp(rs.getString("typ"));
		return p;
	}
}
