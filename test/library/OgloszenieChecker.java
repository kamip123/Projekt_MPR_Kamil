package library;

import library.domain.Ogloszenie;

public class OgloszenieChecker {
	public boolean isTytulValid(Ogloszenie ogloszenie) {
		return ogloszenie.getTytul()!=null && !ogloszenie.getTytul().isEmpty();
	}
	public boolean isOpisValid(Ogloszenie ogloszenie) {
		return ogloszenie.getOpis()!=null && !ogloszenie.getOpis().isEmpty();
	}
	public boolean isCenaValid(Ogloszenie ogloszenie) {
		return ogloszenie.getCena()!=0 && !(ogloszenie.getCena()==0);
	}
	public boolean isIdSamochoduValid(Ogloszenie ogloszenie) {
		return ogloszenie.getIdSamochodu()!=0 && !(ogloszenie.getIdSamochodu()==0);
	}
	public boolean isIdSprzedawcyValid(Ogloszenie ogloszenie) {
		return ogloszenie.getIdSamochodu()!=0 && !(ogloszenie.getIdSprzedawcy()==0);
	}
}
