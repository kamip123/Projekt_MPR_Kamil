package library.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import library.domain.Ogloszenie;

public class OgloszenieMapper implements IMapper<Ogloszenie>{
	@Override
	public Ogloszenie map(ResultSet rs) throws SQLException {
		Ogloszenie p = new Ogloszenie();
		p.setId(rs.getInt("id"));
		p.setTytul(rs.getString("tytul"));
		p.setOpis(rs.getString("opis"));
		p.setCena(rs.getInt("cena"));
		p.setDataUmieszczenia(rs.getDate("dataUmieszczenia"));
		p.setDataWygasniecia(rs.getDate("dataWygasniecia"));
		p.setIdSamochodu(rs.getInt("idSamochodu"));
		p.setId(rs.getInt("idSprzedawcy"));
		return p;
	}
}
