package library.repos;

import java.util.List;
import library.domain.Sprzedawca;

public interface ISprzedawcaRepository extends IRepository<Sprzedawca>{
	public List<Sprzedawca> naJakiesImie(String name);
}
