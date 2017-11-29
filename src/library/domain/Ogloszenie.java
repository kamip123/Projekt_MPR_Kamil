package library.domain;

import java.sql.Date;

public class Ogloszenie implements IHaveId{
	private int id;
	private String tytul;
	private String opis;
	private int cena;
	private Date dataUmieszczenia;
	private Date dataWygasniecia;
	private int idSamochodu;
	private int idSprzedawcy;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public Date getDataUmieszczenia() {
		return dataUmieszczenia;
	}

	public void setDataUmieszczenia(Date date) {
		this.dataUmieszczenia = date;
	}

	public Date getDataWygasniecia() {
		return dataWygasniecia;
	}

	public void setDataWygasniecia(Date dataWygasniecia) {
		this.dataWygasniecia = dataWygasniecia;
	}

	public int getIdSamochodu() {
		return idSamochodu;
	}

	public void setIdSamochodu(int idSamochodu) {
		this.idSamochodu = idSamochodu;
	}

	public int getIdSprzedawcy() {
		return idSprzedawcy;
	}

	public void setIdSprzedawcy(int idSprzedawcy) {
		this.idSprzedawcy = idSprzedawcy;
	}
}
