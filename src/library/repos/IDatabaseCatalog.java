package library.repos;

public interface IDatabaseCatalog {

	public ISprzedawcaRepository sprzedawcy();
	public IOgloszenieRepository ogloszenia();
	public ISamochodRepository samochody();
}
