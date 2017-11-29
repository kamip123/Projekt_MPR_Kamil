package library.domain;

public class Sprzedawca implements IHaveId{
	private int id;
	private String nazwa;
	private String prywatnaCzyFirma;
	private int telefon;
	private String adresEMail;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getPrywatnaCzyFirma() {
		return prywatnaCzyFirma;
	}

	public void setPrywatnaCzyFirma(String prywatnaCzyFirma) {
		this.prywatnaCzyFirma = prywatnaCzyFirma;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getAdresEMail() {
		return adresEMail;
	}

	public void setAdresEMail(String adresEMail) {
		this.adresEMail = adresEMail;
	}
}
