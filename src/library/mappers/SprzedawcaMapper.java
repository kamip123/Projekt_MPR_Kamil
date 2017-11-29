package library.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import library.domain.Sprzedawca;

public class SprzedawcaMapper implements IMapper<Sprzedawca>{
	@Override
	public Sprzedawca map(ResultSet rs) throws SQLException {
		Sprzedawca p = new Sprzedawca();
		p.setId(rs.getInt("id"));
		p.setNazwa(rs.getString("nazwa"));
		p.setPrywatnaCzyFirma(rs.getString("prywatnaCzyFirma"));
		p.setTelefon(rs.getInt("telefon"));
		p.setAdresEMail(rs.getString("adresEMail"));
		return p;
	}
}
