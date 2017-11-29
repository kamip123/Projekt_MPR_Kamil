package library;

import static org.junit.Assert.*;
import library.domain.Ogloszenie;
import org.junit.Test;

public class OgloszenieCheckerTest {
public void check_test_if_author_has_name_etc () {
		
		OgloszenieChecker checker = new OgloszenieChecker();
		
		Ogloszenie ogloszenieWithEmptyOrNull = new Ogloszenie();
		
		Ogloszenie ogloszenieWithNotEmptyOrNull = new Ogloszenie();
		
		ogloszenieWithEmptyOrNull.setTytul("");
		ogloszenieWithEmptyOrNull.setOpis("");
		ogloszenieWithEmptyOrNull.setCena(0);
		ogloszenieWithEmptyOrNull.setIdSamochodu(0);
		ogloszenieWithEmptyOrNull.setIdSprzedawcy(0);
		
		ogloszenieWithNotEmptyOrNull.setTytul("");
		ogloszenieWithNotEmptyOrNull.setOpis("");
		ogloszenieWithNotEmptyOrNull.setCena(10);
		ogloszenieWithNotEmptyOrNull.setIdSamochodu(1);
		ogloszenieWithNotEmptyOrNull.setIdSprzedawcy(1);
		
		boolean inValidResultForTytul= checker.isTytulValid(ogloszenieWithEmptyOrNull);
		boolean ValidResultForNotNullTytul = checker.isTytulValid(ogloszenieWithNotEmptyOrNull);

		boolean inValidResultForOpis = checker.isCenaValid(ogloszenieWithEmptyOrNull);
		boolean ValidResultForNotNullOpis = checker.isCenaValid(ogloszenieWithNotEmptyOrNull);
		
		boolean inValidResultForNullCena = checker.isCenaValid(ogloszenieWithEmptyOrNull);
		boolean ValidResultForNotNullCena = checker.isCenaValid(ogloszenieWithNotEmptyOrNull);

		boolean inValidResultForIdSamochodu = checker.isIdSamochoduValid(ogloszenieWithEmptyOrNull);
		boolean ValidResultForNotNullsetDataWygasniecia = checker.isIdSamochoduValid(ogloszenieWithNotEmptyOrNull);
		
		boolean inValidResultForIdSprzedawcy = checker.isIdSprzedawcyValid(ogloszenieWithEmptyOrNull);
		boolean ValidResultForNotNullIdSprzedawcy = checker.isIdSprzedawcyValid(ogloszenieWithNotEmptyOrNull);
		
		assertFalse("check tytul failed", inValidResultForTytul);
		assertTrue(ValidResultForNotNullTytul);
		
		assertFalse("check opis failed", inValidResultForOpis);
		assertTrue(ValidResultForNotNullOpis);
		
		assertFalse("check cena failed", inValidResultForNullCena);
		assertTrue(ValidResultForNotNullCena);
		
		assertFalse("check id samochodu failed", inValidResultForIdSamochodu);
		assertTrue(ValidResultForNotNullsetDataWygasniecia);
		
		assertFalse("check id sprzedawcy failed", inValidResultForIdSprzedawcy);
		assertTrue(ValidResultForNotNullIdSprzedawcy);
	}
}
